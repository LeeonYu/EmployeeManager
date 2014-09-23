package cn.edu.jxnu.action.login;

import cn.edu.jxnu.serviceimpl.UserServiceImpl;
import cn.edu.jxnu.util.BaseAction;

//登录Action
public class LoginAction extends BaseAction {

	private static final long serialVersionUID = -4748917272740123171L; //ID
	private UserServiceImpl userService;  //用户服务
	private String username;    //登录用户名
	private String password;   //登录密码

	public String execute() throws Exception {
		if (userService.login(username, password))
			return "success";
		return "error";
	}

	public UserServiceImpl getUserService() {
		return userService;
	}

	public void setUserService(UserServiceImpl userService) {
		this.userService = userService;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
