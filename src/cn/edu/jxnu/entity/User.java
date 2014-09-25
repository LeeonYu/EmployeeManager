package cn.edu.jxnu.entity;

//用户实例类
public class User {

	private String Username;  //用户名
	private String Password; //密码

	public String getPassword() {
		return Password;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public void setPassword(String password) {
		Password = password;
	}

}
