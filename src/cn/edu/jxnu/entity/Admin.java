package cn.edu.jxnu.entity;

//管理员实例类
public class Admin {

	private String UserName;  //用户名
	private String Password; //密码

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

}
