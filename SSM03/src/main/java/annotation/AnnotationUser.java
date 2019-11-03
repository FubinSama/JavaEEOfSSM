package annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//Component注解在不指定value时，使用类名第一个字母小写当作id
@Component
//该注解是一个泛化的概念，仅仅表示一个组件对象（Bean），可以作用在任何层次上
public class AnnotationUser {
    @Value("wfb1")
    private String uname;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
