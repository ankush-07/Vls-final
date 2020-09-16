package com.cjc.main.service;

import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;

public interface HomeService 
{
  public void savedata(Student s);
  public Student logincheck(String uname,String pass);
  public Iterable<Student> getAllData();
  public void deleteData(Student s);
  public Student editData(int sid);
}
