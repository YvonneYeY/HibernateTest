package mldn.cn.dao.daoImpl;

import mldn.cn.dao.IMemberDAO;
import mldn.cn.vo.Member;
import mldn.cn.dbc.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @program: testJava
 * @description: 数据层操作接口的实现类
 * @author: Yonne
 * @create: 2018-09-05 16:12
 */
public class MenberDAOImpl implements IMemberDAO {
    private PreparedStatement preparedStatement;


    @Override
    /*
     private String memid;
    private String name;
    private String sex;
    private String edu;
    private Date birthday;
    private Double salary;
    private String note;
     */
    public boolean doCreate(Member member) throws Exception {
        String sql="INSERT INTO member(memid,name,sex,edu,BIRTHDAY,salary,note) " +
                "VALUES(?,?,?,?,?,?,?)";
        this.preparedStatement= DatabaseConnection.getConnection().prepareStatement(sql);
        this.preparedStatement.setString(1, member.getMemid());
        this.preparedStatement.setString(2,member.getName());
        this.preparedStatement.setString(3,member.getSex());
        this.preparedStatement.setString(4,member.getEdu());
        this.preparedStatement.setDate(5,new java.sql.Date(member.getBirthday().getTime()));
        this.preparedStatement.setDouble(6,member.getSalary());
        this.preparedStatement.setString(7,member.getNote());
        return this.preparedStatement.executeUpdate()>0;
    }

    @Override
    public Member findById(String id) throws SQLException {
        String sql="SELECT memid,name,sex,edu,BIRTHDAY,salary,note FROM member " +
                "WHERE memid=?";
        Member member=null;
        preparedStatement=DatabaseConnection.getConnection().prepareStatement(sql);
        ResultSet resultSet=preparedStatement.executeQuery();
        if(resultSet.next()){
            member=new Member();
            member.setMemid(resultSet.getString(1));
            member.setName(resultSet.getString(2));
            member.setSex(resultSet.getString(3));
            member.setEdu(resultSet.getString(4));
            member.setBirthday(resultSet.getDate(5));
            member.setSalary(resultSet.getDouble(6));
            member.setName(resultSet.getString(7));
        } return member;

    }
}