package mldn.cn.dao;

import mldn.cn.vo.Member;

/**
 * @program: testJava
 * @description: 规范数据层的操作
 * @author: Yonne
 **/
public interface IMemberDAO {
    public boolean doCreate(Member member) throws Exception;
    public Member findById(String id) throws Exception;
}
