package com.alive.kanjiwoh.user;

public class DummyUserInfo {

	private Integer userId;
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public DummyUserInfo() {
		setUserId(777);
	}
}
