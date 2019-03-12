package mldn.cn.service;

/**
 * @program: CRUDForOneSheet
 * @description: 定义操作层的规范
 * @author: Yonne
 **/
public interface IMemberService {
    public boolean add(mldn.cn.vo.Member member) throws Exception;
}
