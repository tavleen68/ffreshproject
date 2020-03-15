package com.DevOps.Capstone.Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.DevOps.Capstone.Project.HTML.LoginHTML;
//import com.DevOps.Capstone.Project.services.DashboardService;
//import com.DevOps.Capstone.Project.services.loginService;
@RestController
public class DashboardController 
{
//	@Autowired
//	loginService logService;
//	@Autowired
//	DashboardService dashService;
//	
	@RequestMapping(value = "/bankApp/dashboard", produces = "application/HTML")
	public ModelAndView Dashboard(@ModelAttribute ("loginModel") LoginHTML HTMLobj , BindingResult result, ModelMap model) 
	{
		String UserID = HTMLobj.getUserID();
		System.out.println("UserId from HTML:" + UserID);
		String password = HTMLobj.getPassword();
		System.out.println("Password from HTML:" + password);
		System.out.println("checking userId and password");
		
		try
		{ 
//		String userID = logService.getUserID (HTMLobj);
//		if (userID.equals(UserID))
//		{
//			String passwrd = HTMLobj.getPassword();
//			if (passwrd.equals(password))
//			{
//				String UserName=dashService.findUserName(userID);
//				//String accountnumber=dashService.findAccountNumber(userID);
//				model.addAttribute("name",UserName);
//				return DisplayDash();
//				
//				
//			}
//		}
//	}		
		if (UserID.equals("W111"))
		{
			System.out.println("userId matched");
			if (password.equals("W111@1"))
					{
						System.out.println("Password matched");
						System.out.println("displaying dashboard page");
						model.addAttribute("name",UserID);
						return Dashboard();
					}
		}
		}
		catch (Exception e)
		{ 
			e.printStackTrace();
		}
		return null;		
		
	}
	
	public ModelAndView Dashboard()
	{
		ModelAndView MVobj= new ModelAndView();
		MVobj.setViewName("Dashboard");
		return MVobj;
	}
}
