package cn.edu.jxnu.serviceimpl;

import cn.edu.jxnu.dao.UserDao;
import cn.edu.jxnu.dao.impl.UserDaoImpl;
import cn.edu.jxnu.entity.User;

public class UserServiceImpl {
    private UserDaoImpl userDao = new UserDaoImpl();

	//用户登录服务
    public boolean login(String username, String password) {  
        User user =userDao.findUserByName(username);  
        if(user!=null)  
            if(password.equals(user.getPassword()))  
                return true;  
        return false;  
    }  
    public void setUserDAO(UserDaoImpl userDao) {  
        this.userDao = userDao;  
    }  


}
