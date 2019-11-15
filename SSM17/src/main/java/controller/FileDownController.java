package controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FileDownController {
    private static Log log = LogFactory.getLog(FileDownController.class);

    @RequestMapping("showDownFiles")
    public String show(HttpServletRequest request, Model model) {
        String realPath = request.getServletContext().getRealPath("uploadfiles");
        File dir = new File(realPath);
        File[] files = dir.listFiles();
        //获取该目录下所有文件名
        List<String> fileNames = new ArrayList<>();
        for (int i = 0; i < files.length; i++) {
            fileNames.add(files[i].getName());
        }
        model.addAttribute("files", fileNames);
        return "showDownFiles";
    }

    @RequestMapping("down")
    public String down(@RequestParam("filename") String fileName, HttpServletRequest request, HttpServletResponse response) {
        String aFilePath = null;
        FileInputStream fis = null;
        ServletOutputStream out = null;
        try {
            aFilePath = request.getServletContext().getRealPath("uploadfiles");
            response.setHeader("Content-Type", "application/x-msdownload");
            response.setHeader("Content-Disposition", "attachment; filename=" + toUTF8String(fileName));
            //读入文件
            fis = new FileInputStream(aFilePath + "\\" + fileName);
            //得到响应对象的输出流，用于向客户端输出二进制数据
            out = response.getOutputStream();
            out.flush();
            int aRead = 0;
            byte[] b = new byte[1024];
            while ((aRead = fis.read(b))!=-1) {
                out.write(b, 0, aRead);
            }
            out.flush();
            fis.close();
            out.close();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        log.info("下载成功");
        return null;
    }

    private String toUTF8String(String str) {
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (c>=0 && c<=255) sb.append(c);
            else { //转换为UTF8
                byte[] b;
                try {
                    b = Character.toString(c).getBytes("UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    b = null;
                }
                //转换为%HH的字符串形式
                for (int j = 0; j < b.length; j++) {
                    int k = b[j];
                    if (k < 0) k &= 255;
                    sb.append("%" + Integer.toHexString(k).toUpperCase());
                }
            }
        }
        return sb.toString();
    }
}
