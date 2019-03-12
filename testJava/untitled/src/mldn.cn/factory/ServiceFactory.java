package mldn.cn.factory;
import mldn.cn.service.proxy.ServiceProxy;
/**
 * @program: testJava
 * @description: 业务层工厂类
 * @author: Yonne
 * @create: 2018-09-05 16:01
 */
public class ServiceFactory {
    public static <T> T getInstance(Class<T> cls){
        try {
            return (T)new ServiceProxy().bind(cls.newInstance());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}