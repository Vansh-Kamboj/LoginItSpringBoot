package com.thlmeleaf.example;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
//import org.springframework.boot.SpringApplication;
//import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
@Controller
public class Pagecontrol {
	@Autowired
	private userrepository pack;
	@Autowired
	private Environment en;
	@GetMapping("/sta")
	 public  String  start(Model model) {
		model.addAttribute("logindata",new Register());
		String kp="You have entered to address ";
		model.addAttribute("ab",kp);
		return "Front";
	 }
	@PostMapping("/collect")
	public String collect(@Valid @ModelAttribute("logindata") Register logindata,BindingResult res) {
		if(res.hasErrors()) {          
	       	System.out.println(logindata);
			return "Front";
		}
		else {
			pack.save(logindata);
			System.out.println(logindata +"here the registration is done successfully  "+(res.hasErrors()));
		return "successhtml"; 
		}
		
		
	}
}
 
