package com.sms.service;

import com.sms.dao.StudentInfoDao;
import com.sms.model.StudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;

@Service
public class StudentInfoService {

    @Autowired
    private StudentInfoDao dao;

    public List<StudentInfo> getStudents(){
        return this.dao.getAllStudents();
    }

    public void addStudent(StudentInfo s) throws UnknownHostException {
        s.setCreateTime(new Date());
        s.setModifyTime(new Date());
        s.setCreateUserId(InetAddress.getLocalHost().getHostAddress());
        s.setModifyUserId(InetAddress.getLocalHost().getHostAddress());
        s.setStatus("激活");
        this.dao.insert(s);
    }

    public void deletestudent(String Name){
        this.dao.deleteStudent(Name);
    }

    public void updatestudent(StudentInfo s) throws UnknownHostException {
        s.setModifyTime(new Date());
        s.setModifyUserId(InetAddress.getLocalHost().getHostAddress());
        this.dao.updateStudent(s);
    }

    public List<StudentInfo> findstudent(String Name){
        return  this.dao.findStudentByName(Name);
    }


}
