package com.cjc.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.Student;
import com.cjc.main.service.HomeService;

@Controller
public class HomeController 
{
  @Autowired
	HomeService hs;
  
  @RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}
  
  @RequestMapping("/registeration")
  public String preregister()
  {
	  return "registeration";
  }

    
  @RequestMapping("/reg")
  public String registerdata(@ModelAttribute Student s)
  {
	  
	  
	  System.out.println(s.getSid());
	  System.out.println(s.getName());
	  System.out.println(s.getAddr());
	  System.out.println(s.getMobino());
	  hs.savedata(s);
	  return "login";
  }
  
  @RequestMapping("/login")
  public String logincheck(@RequestParam ("uname") String uname,@RequestParam ("pass") String pass,ModelMap m)
  {
	 Student stu= hs.logincheck(uname,pass);
	 
	 if(stu!=null)
	 {
		Iterable<Student> list= hs.getAllData();
		m.addAttribute("data", list);
		return "success";
	 }
	  return "login";
  }
	
	  @RequestMapping("/delete")
	  public String deleteData(@ModelAttribute ("stu")Student s,ModelMap m) 
	  { 
		  hs.deleteData(s);
	   Iterable<Student> list= hs.getAllData(); 
	  m.addAttribute("data", list); 
	  return "success";
	  }
	  
	  @RequestMapping("/edit") 
	  public String editData(@RequestParam int sid,Model m)
	  {
		  System.out.println("Into Edit");
	  Student s= hs.editData(sid);
	  m.addAttribute("data", s);
	  return "edit"; 
	  }
	  
	  @RequestMapping("/update") 
	  public String updateData(@ModelAttribute ("stu")Student s,Model m) 
	  { 
	  hs.savedata(s); 
	  Iterable<Student> list= hs.getAllData();
	  m.addAttribute("data", list); 
	  return "success";
	  
	  }
	 
}
