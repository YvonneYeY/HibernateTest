package mldn.cn.dbc;

import com.sun.org.apache.regexp.internal.RE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @program: testJava
 * @description: 负责数据库的连接
 * @author: Yonne
 * @create: 2018-09-05 11:32
 */
public class DatabaseConnection {
    private static ThreadLocal<Connection> threadLocal=new ThreadLocal<Connection>();
    private static final String DBDRIVER=
            "oracle.jdbc.driver.OracleDriver";
    private static final String DBURL=
            "jdbc:oracle:thin:@localhost:1521:mldn";
    private static final String DBUSER="scott";
    private static final String DBPASSWORD="tiger";
    public static Connection getConnection(){
        Connection connection=threadLocal.get();
            try {
                if(connection==null){
                connection=rebuildConnection();
                threadLocal.set(connection);
                }
                return connection;
            } catch (Exception e) {
                e.printStackTrace();
            }
        return null;
    }
    private static Connection rebuildConnection() throws Exception{
        Class.forName(DBDRIVER);
        return DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
    }

    public static void close(){
        Connection connection=threadLocal.get();
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            threadLocal.remove();
        }

    }
}