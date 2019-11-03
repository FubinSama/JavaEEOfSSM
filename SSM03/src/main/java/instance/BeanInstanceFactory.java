package instance;

public class BeanInstanceFactory {
    public BeanClass createBeanClassInstance() {
        return new BeanClass("调用工厂方法实例化Bean");
    }
}
