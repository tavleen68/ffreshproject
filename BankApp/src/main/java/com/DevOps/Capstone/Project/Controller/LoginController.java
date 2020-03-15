package com.DevOps.Capstone.Project.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.DevOps.Capstone.Project.HTML.LoginHTML;

@RestController
public class LoginController 
{
	@RequestMapping("/bankApp/login")
	public ModelAndView Display(Model model)
	{
		LoginHTML loginModel = new LoginHTML();
		model.addAttribute("loginModel", loginModel);
		
		ModelAndView MVobj= new ModelAndView();
		MVobj.setViewName("Login");
		
		return MVobj;
	}
  
}
