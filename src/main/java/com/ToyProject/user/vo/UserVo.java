package com.ToyProject.user.vo;

import java.util.Date;

public class UserVo {
	private int userNo;
	private String userId;
	private int userPw;
	private String userName;
	private String sex;
	private String birth;
	
	
	private String email;
	private String phoneNo;
	private String userZcode;
	private String addr1;
	private String addr2;
	private Date createdate;
	private Date updatedate;
	private Date lastlogin;
	private String useruse;
	private String cart;
	private String code;
	
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getUserPw() {
		return userPw;
	}
	public void setUserPw(int userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getUserZcode() {
		return userZcode;
	}
	public void setUserZcode(String userZcode) {
		this.userZcode = userZcode;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	public Date getLastlogin() {
		return lastlogin;
	}
	public void setLastlogin(Date lastlogin) {
		this.lastlogin = lastlogin;
	}
	public String getUseruse() {
		return useruse;
	}
	public void setUseruse(String useruse) {
		this.useruse = useruse;
	}
	public String getCart() {
		return cart;
	}
	public void setCart(String cart) {
		this.cart = cart;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	@Override
	public String toString() {
		return "UserVo [userNo=" + userNo + ", userId=" + userId + ", userPw=" + userPw + ", userName=" + userName
				+ ", sex=" + sex + ", birth=" + birth + ", email=" + email + ", phoneNo=" + phoneNo + ", userZcode="
				+ userZcode + ", addr1=" + addr1 + ", addr2=" + addr2 + ", createdate=" + createdate + ", updatedate="
				+ updatedate + ", lastlogin=" + lastlogin + ", useruse=" + useruse + ", cart=" + cart + ", code=" + code
				+ "]";
	}
}
