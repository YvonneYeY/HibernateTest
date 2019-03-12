package mldn.cn.service.proxy;

import mldn.cn.dbc.DatabaseConnection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: testJava
 * @description: 使用动态代理模式进行数据的连接及关闭操作
 * @author: Yonne
 * @create: 2018-09-05 15:05
 */
public class ServiceProxy implements InvocationHandler {
    private Object objectTarget;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object retObj=null;
        try{
            if(method.getName().startsWith("add")
                    ||method.getName().startsWith("edit")
                    ||method.getName().startsWith("remove")){
                DatabaseConnection.getConnection().setAutoCommit(false);
                try{
                    retObj=method.invoke(this.objectTarget,args);
                    DatabaseConnection.getConnection().commit();
                }catch (Exception e){
                    DatabaseConnection.getConnection().rollback();
                    e.printStackTrace();
                }
            }else {
                retObj=method.invoke(this.objectTarget,args);
            }
        }catch (Exception e){
            throw e;
        }finally {
            DatabaseConnection.close();
        }
        return retObj;
    }
    public Object bind(Object objectTarget){
        this.objectTarget=objectTarget;
        return Proxy.newProxyInstance(objectTarget.getClass().getClassLoader(),objectTarget.getClass().getInterfaces(),this);
    }
}