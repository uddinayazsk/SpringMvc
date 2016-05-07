package com.photon.std;



import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class StudentDetails {

@RequestMapping("/desgin.html")
public void info1(@Valid ModelMap model)
{ 
 	model.addAttribute(new User());
	
	
}

 @RequestMapping(value="/result.html",method=RequestMethod.POST)
 public void info2(@ModelAttribute User user,Model model)
 {
	 user.addDetails();
  model.addAttribute(user);	 
  }
 
 
 @RequestMapping(value="/desgin1.html",method=RequestMethod.GET)
 public void jil(ModelMap model1){
model1.addAttribute(new Info());	 
	 
 }
 
@RequestMapping(value="/result1.html",method=RequestMethod.POST) 
 public void sei(@ModelAttribute Info info,Model model)
 {
	 info.retrieveList();
 	 model.addAttribute(info);
 }

}
