/**
 * 
 */
package cn.edu.jxnu.entity;

import java.util.Date;

/**
 * @author 喻亮
 *
 */

// 人员调动实例
public class Translate {

	private int TranslateNO; // 记录编号
	private String EmployeeID;// 员工ID
	private Date TranslateDate;// 调动时间
	private String PriorBranch;// 前部门
	private String NextBranch;// 现部门
	private String PriorDuty;// 前职务
	private String NextDuty;// 现职务

	public int getTranslateNO() {
		return TranslateNO;
	}

	public void setTranslateNO(int translateNO) {
		TranslateNO = translateNO;
	}

	public String getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(String employeeID) {
		EmployeeID = employeeID;
	}

	public Date getTranslateDate() {
		return TranslateDate;
	}

	public void setTranslateDate(Date translateDate) {
		TranslateDate = translateDate;
	}

	public String getPriorBranch() {
		return PriorBranch;
	}

	public void setPriorBranch(String priorBranch) {
		PriorBranch = priorBranch;
	}

	public String getNextBranch() {
		return NextBranch;
	}

	public void setNextBranch(String nextBranch) {
		NextBranch = nextBranch;
	}

	public String getPriorDuty() {
		return PriorDuty;
	}

	public void setPriorDuty(String priorDuty) {
		PriorDuty = priorDuty;
	}

	public String getNextDuty() {
		return NextDuty;
	}

	public void setNextDuty(String nextDuty) {
		NextDuty = nextDuty;
	}

}
