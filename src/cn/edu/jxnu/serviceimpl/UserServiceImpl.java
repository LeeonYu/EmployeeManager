package cn.edu.jxnu.serviceimpl;

import cn.edu.jxnu.dao.UserDao;
import cn.edu.jxnu.entity.Admin;

public class UserServiceImpl {
    private UserDao userDao;

	//用户登录服务
    public boolean login(String username, String password) {  
        Admin user =userDao.findUserByName(username);  
        if(user!=null)  
            if(password.equals(user.getPassword()))  
                return true;  
        return false;  
    }  
    public void setUserDAO(UserDao userDao) {  
        this.userDao = userDao;  
    }  


}
