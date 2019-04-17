package com.sms.web;

import com.sms.dao.StudentInfoDao;
import com.sms.model.StudentInfo;
import com.sms.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.net.UnknownHostException;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentInfoController {

    @Autowired
    private StudentInfoService service;
    private StudentInfoDao dao;


    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(Model model){
        List<StudentInfo> list = this.service.getStudents();
        model.addAttribute("students",list);
        return "student/list";
    }

    @RequestMapping(value="/add",method = RequestMethod.GET)
    public String add(Model model){
        return "student/add";
    }

    @RequestMapping(value="/add",method = RequestMethod.POST)
    public String add(StudentInfo s) throws UnknownHostException {
        this.service.addStudent(s);
        return "redirect:/student/list";
    }

    @RequestMapping(value = "/deleteStudent")
    public void delete(String Name){
        this.service.deletestudent(Name);
    }

    @RequestMapping(value = "/updateStudent",method = RequestMethod.POST)
    public void update(String LoginId,String Password,String Name,String Mobile,String Email,String Sex) throws UnknownHostException {
        StudentInfo studentInfo=new StudentInfo();
        studentInfo.setLoginId(LoginId);
        studentInfo.setPassword(Password);
        studentInfo.setName(Name);
        studentInfo.setMobile(Mobile);
        studentInfo.setEmail(Email);
        studentInfo.setSex(Sex);
        this.service.updatestudent(studentInfo);
    }


    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public String findByName(String Name,Model model){
        List<StudentInfo> user=this.service.findstudent(Name);
        model.addAttribute("users",user);
        return "student/list";
    }



}
