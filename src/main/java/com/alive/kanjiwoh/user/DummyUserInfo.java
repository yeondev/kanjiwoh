package com.alive.kanjiwoh.user;

public class DummyUserInfo {

	private Integer userNo;
	
	public Integer getUserNo() {
		return userNo;
	}

	public void setUserNo(Integer userId) {
		this.userNo = userId;
	}

	public DummyUserInfo() {
		setUserNo(777);
	}
}
