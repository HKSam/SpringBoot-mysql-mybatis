package com.sms.dao;

import com.sms.model.StudentInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface StudentInfoDao {

    @Select("select * from StudentInfo")
    public List<StudentInfo> getAllStudents();

    @Insert("insert into StudentInfo(LoginId,Password,Name,Mobile,Email,Sex,CreateTime,CreateUserId,Status,ModifyTime,ModifyUserId) values(#{LoginId},#{Password},#{Name},#{Mobile},#{Email},#{Sex},#{CreateTime},#{CreateUserId},#{Status},#{ModifyTime},#{ModifyUserId})")
    public void insert(StudentInfo s);

    @Delete("delete from StudentInfo where Name=#{Name}")
    public void deleteStudent(@Param("Name")String Name);

    @Update("update StudentInfo set LoginId=#{LoginId},Password=#{Password},Mobile=#{Mobile},Email=#{Email},Sex=#{Sex},ModifyTime=#{ModifyTime},ModifyUserId=#{ModifyUserId} where Name=#{Name}")
    public void updateStudent(StudentInfo s);

    @Select("select * from StudentInfo where Name=#{Name}")
    public List<StudentInfo> findStudentByName(@Param("Name") String Name);
}
