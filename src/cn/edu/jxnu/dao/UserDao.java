package cn.edu.jxnu.dao;

import cn.edu.jxnu.entity.Admin;

public interface UserDao {

	//查找用户名
	Admin findUserByName(String username);

	
}
