//package com.DevOps.Capstone.Project.services;
//
//
//import javax.persistence.EntityNotFoundException;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import com.DevOps.Capstone.Project.HTML.LoginHTML;
//import com.DevOps.Capstone.Project.repository.LoginRepository;
//
//@Service
//public class loginService 
//{
//	@Autowired
//	LoginRepository repoObj;
//	
//	public String getUserID(@RequestBody LoginHTML HTMLobj) throws Exception
//	{
//		String userid = findUserID(HTMLobj.getUserID());
//		String passwrd = findpassword(HTMLobj.getUserID());
//		
//		HTMLobj.setUserID(userid);
//		HTMLobj.setPassword(passwrd);
//		return userid;
//	}
//	public String findUserID(String ID) throws EntityNotFoundException
//	{ 
//		String Userid = repoObj.getOne(ID).getUserID();
//		return Userid;
//	
//	}
//
//	public String findpassword(String ID) throws EntityNotFoundException
//	{ 
//		String Userid = repoObj.getOne(ID).getPassword();
//		return Userid;
//	
//	}
//}
