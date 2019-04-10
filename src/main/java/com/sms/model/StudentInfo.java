package com.sms.model;

import java.util.Date;

/**
 * 学生信息实体对象
 */
public class StudentInfo {

    private int Id;
    private String LoginId;
    private String Password;
    private String Name;
    private String Mobile;
    private String Email;
    private String Sex;
    private String CreateUserId;
    private String ModifyUserId;
    private Date CreateTime;
    private Date ModifyTime;
    private String Status;

    public StudentInfo(int Id,String LoginId,String Password,String Name,String Mobile,String Email,String Sex,String CreateUserId,String ModifyUserId,Date CreateTime,Date ModifyTime,String Status)
    {
        this.Id=Id;
        this.LoginId=LoginId;
        this.Password=Password;
        this.Name=Name;
        this.Mobile=Mobile;
        this.Email=Email;
        this.Sex=Sex;
        this.CreateTime=CreateTime;
        this.ModifyTime=ModifyTime;
        this.CreateUserId=CreateUserId;
        this.ModifyUserId=ModifyUserId;
        this.Status=Status;
    }
    public int getId() { return Id; }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getLoginId() {
        return LoginId;
    }

    public void setLoginId(String LoginId) {
        this.LoginId = LoginId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        this.Mobile = mobile;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        this.Sex = sex;
    }

    public String getCreateUserId() {
        return CreateUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.CreateUserId = createUserId;
    }

    public String getModifyUserId() {
        return ModifyUserId;
    }

    public void setModifyUserId(String modifyUserId) {
        ModifyUserId = modifyUserId;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date CreateTime) {
        this.CreateTime = CreateTime;
    }

    public Date getModifyTime() {
        return ModifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.ModifyTime = modifyTime;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        this.Status = status;
    }

    public StudentInfo(){
    }


}
