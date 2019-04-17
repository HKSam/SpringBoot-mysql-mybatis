package com.sms.dao;

import com.sms.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface IUserInfoDao {

    @Select("select * from userInfo where name=#{name}")
    public UserInfo getUserInfoByName(String name);
}
