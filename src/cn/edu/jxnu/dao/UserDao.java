package cn.edu.jxnu.dao;

import cn.edu.jxnu.entity.User;


public interface UserDao {

	//查找用户名
	User findUserByName(String username);

	
}
