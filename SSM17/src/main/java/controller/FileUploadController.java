package controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import pojo.FileDomain;
import pojo.MultiFileDomain;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
public class FileUploadController {
    private static final Log log = LogFactory.getLog(FileUploadController.class);

    @RequestMapping("/onefile")
    public String oneFileUpload(@ModelAttribute FileDomain fileDomain, HttpServletRequest request) {
        String realPath = request.getServletContext().getRealPath("uploadfiles");
        System.out.println(realPath);
        String fileName = fileDomain.getMyfile().getOriginalFilename();
        File targetFile = new File(realPath, fileName);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        try {
            fileDomain.getMyfile().transferTo(targetFile);
            log.info("成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "showOne";
    }

    @RequestMapping("/multifile")
    public String multiFileUpload(@ModelAttribute MultiFileDomain multiFileDomain, HttpServletRequest request) {
        String realPath = request.getServletContext().getRealPath("uploadfiles");
        File targetDir = new File(realPath);
        if (!targetDir.exists()) targetDir.mkdirs();
        List<MultipartFile> files = multiFileDomain.getMyfile();
        for (int i = 0; i < files.size(); i++) {
            MultipartFile file = files.get(i);
            String fileName = file.getOriginalFilename();
            File targetFile = new File(realPath, fileName);
            try {
                file.transferTo(targetFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        log.info("成功");
        return "showMulti";
    }
}
