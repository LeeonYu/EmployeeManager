package cn.edu.jxnu.util;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport{

	private static final long serialVersionUID = 5254516142394471784L;
	
    public String execute() throws Exception {  
        return "success";  
    }  


}
