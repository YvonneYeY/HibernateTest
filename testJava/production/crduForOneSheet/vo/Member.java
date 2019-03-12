package mldn.cn.vo;

import java.util.Date;
import java.io.Serializable;

/**
 * @program: testJava
 * @description: 表member的类
 * @author: Yonne
 * @create: 2018-09-05 12:07
 */
public class Member implements Serializable {
    /*
     memid   VARCHAR2(50),
  name  VARCHAR2(20),
  sex   VARCHAR2(10),
  edu   VARCHAR2(50),
  birthday DATE,
  salary  NUMBER(8,2),
  note    BLOB,
     */
    private String memid;
    private String name;
    private String sex;
    private String edu;
    private Date birthday;
    private Double salary;
    private String note;
    public Member() {
    }

    public String getMemid() {
        return memid;
    }

    public Member(String memid, String name, String sex, String edu, Date birthday, Double salary, String note) {
        this.memid = memid;
        this.name = name;
        this.sex = sex;
        this.edu = edu;
        this.birthday = birthday;
        this.salary = salary;
        this.note = note;
    }



    public void setMemid(String memid) {
        this.memid = memid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}