package test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class TestFormat {
    public static void main(String[] args) {
        //获取系统默认的国家语言环境
        Locale lc = Locale.getDefault();
        ResourceBundle bundle = ResourceBundle.getBundle("messageResource", lc);
        //从资源文件中取得的信息
        String msg = bundle.getString("welcome");
        //替换消息文本中的占位符，消息文本中的数字占位符将按照参数的顺序被替换
        String msgFor = MessageFormat.format(msg, "wfb", "6");
        System.out.println(msgFor);
    }
}
