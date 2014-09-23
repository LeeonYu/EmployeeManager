package cn.edu.jxnu.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.edu.jxnu.dao.UserDao;
import cn.edu.jxnu.entity.Admin;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	//实现查找用户名方法
	@Override
	public Admin findUserByName(String username) {
		// TODO Auto-generated method stub
        List<Admin> list;  
        String hql="from users u where u.username=?";  
        list=this.getHibernateTemplate().find(hql, username);  
        if(list!=null&&list.size()>0)  
            return list.get(0);  
        return null;
	}

}
