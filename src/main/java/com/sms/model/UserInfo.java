package com.sms.model;

/**
 * 用户表的实体对象
 * @author hp
 *
 */
public class UserInfo {
	
	private long id;
	
	private String name;
	
	private String password;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return name;
	}

	public void setUsername(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
