package com.sms.service;

import com.sms.dao.IUserInfoDao;
import com.sms.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

	@Autowired
	private IUserInfoDao dao;
	

	public UserInfo login(String name, String password){
		UserInfo user = this.dao.getUserInfoByName(name);
		if(user==null) return null;
		
		if(user.getPassword().equals(password)) return user;
		
		return null;
		
	}

}
