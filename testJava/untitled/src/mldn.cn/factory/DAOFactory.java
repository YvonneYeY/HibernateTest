package mldn.cn.factory;

/**
 * @program: testJava
 * @description: DAO数据层工厂类, 取得数据层接口对象
 * @author: Yonne
 * @create: 2018-09-05 15:55
 */
public class DAOFactory {
    public static <T> T getInstance(Class<T> cls){
        try {
            return cls.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}