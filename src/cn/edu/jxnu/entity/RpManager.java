package cn.edu.jxnu.entity;

import java.util.Date;


//奖惩实例
public class RpManager {

	private int RewardNO;// 奖励号
	private String EmployeeID;// 员工ID
	private String Position;// 职位
	private String RewardPunish;// 惩奖
	private String Rewardcontent;// 惩奖内容
	private String Reason;// 惩奖原因
	private String Branch;// 批准部门
	private String HandleName;// 处理人
	private Date StartDate;// 起始时间
	private Date CancelDate;// 取消时间
	private String CancelReason;// 取消原因
	private String Remark;// 备注

	public int getRewardNO() {
		return RewardNO;
	}

	public void setRewardNO(int rewardNO) {
		RewardNO = rewardNO;
	}

	public String getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(String employeeID) {
		EmployeeID = employeeID;
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
	}

	public String getRewardPunish() {
		return RewardPunish;
	}

	public void setRewardPunish(String rewardPunish) {
		RewardPunish = rewardPunish;
	}

	public String getRewardcontent() {
		return Rewardcontent;
	}

	public void setRewardcontent(String rewardcontent) {
		Rewardcontent = rewardcontent;
	}

	public String getReason() {
		return Reason;
	}

	public void setReason(String reason) {
		Reason = reason;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

	public String getHandleName() {
		return HandleName;
	}

	public void setHandleName(String handleName) {
		HandleName = handleName;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getCancelDate() {
		return CancelDate;
	}

	public void setCancelDate(Date cancelDate) {
		CancelDate = cancelDate;
	}

	public String getCancelReason() {
		return CancelReason;
	}

	public void setCancelReason(String cancelReason) {
		CancelReason = cancelReason;
	}

	public String getRemark() {
		return Remark;
	}

	public void setRemark(String remark) {
		Remark = remark;
	}
}
