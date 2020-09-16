package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.service.HomeService;
@Service
public class HomeServiceImpl implements HomeService
{
	@Autowired
	HomeRepository hr;

	@Override
	public void savedata(Student s) 
	{
	hr.save(s);
		
	}

	@Override
	public Student logincheck(String uname, String pass) 
	{
		Student s= hr.findByUnameAndPass(uname, pass);
		System.out.println(s);
		return s;
	}

	@Override
	public Iterable<Student> getAllData() 
	{
		
		return hr.findAll();
	}

	@Override
	public void deleteData(Student s) 
	{
	hr.delete(s);	
		
	}

	@Override
	public Student editData(int sid) 
	{
		Student s= hr.findBySid(sid);
		return s;
	}

}
