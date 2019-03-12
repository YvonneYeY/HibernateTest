package mldn.cn.service.serviceImpl;

import mldn.cn.dao.IMemberDAO;
import mldn.cn.dao.daoImpl.MenberDAOImpl;
import mldn.cn.vo.Member;

import mldn.cn.service.IMemberService;

/**
 * @program: CRUDForOneSheet
 * @description: 操作层IMemberService接口的具体实现类
 * @author: Yonne
 * @create: 2018-09-05 19:21
 */
public class MemberServiceImpl implements IMemberService {
    @Override

    public boolean add(Member member) throws Exception {
        IMemberDAO iMemberDAO= mldn.cn.factory.DAOFactory.getInstance(MenberDAOImpl.class);
        if(iMemberDAO.findById(member.getMemid())==null){
            return iMemberDAO.doCreate(member);
        }
        return false;
    }
}