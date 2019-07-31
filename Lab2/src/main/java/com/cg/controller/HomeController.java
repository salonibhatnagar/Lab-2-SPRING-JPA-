package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.cg.entities.Trainee;
import com.cg.service.TraineeService;
import com.cg.service.TraineeServiceImpl;

@Controller
@RequestMapping("/")
//@RestController
public class HomeController {
	
	@Autowired private TraineeService service;
	
	
	/* Request Handling Method
	 * Syntax
	 * 1. public ModelAndView methodName(){}
	 * 2. public String methodName(Model model){}
	 * 3. public String methodName(Map<String,Object> model){}
	 * 4. public String methodName(){}
	
	*/
@GetMapping
public String home(Model model)
{
	model.addAttribute("msg","welcome to spring webmvc");
	return "home";
	
}
@RequestMapping(value="/login-trainee",method=RequestMethod.GET)

public String search(Model model,@RequestParam("user") String user1,@RequestParam("pass") String password)
{
	if(user1.equals("admin") && password.equals("admin@123"))
	{
		 
		return "Operation";
	}
	else
		return "home";
	
	
}
@RequestMapping(value="/add-trainee",method=RequestMethod.GET)

public String add(Model model)
{
		return "Add";
	}

@RequestMapping(value="/add-trainee",method=RequestMethod.POST)

public String add1(Model model,@RequestParam Integer traineeId,
								@RequestParam String traineeName,
								@RequestParam String Location,
								@RequestParam String traineeDomain)
{   
	Trainee trainee = new Trainee(traineeId, traineeName, traineeDomain, Location);
	service.create(trainee);
		return "Add";
	}


@GetMapping("/retrive-all-trainees")
public String getAll(Model model){
	model.addAttribute("list",service.getAll());
	return "retrieveall";
}

@RequestMapping(value="/retrieve-trainee",method=RequestMethod.GET)
public String get(Model model){
	return "retrieve";
}
@RequestMapping(value="/retrieve-trainee",method=RequestMethod.POST)
public String get(Model model,@RequestParam("retrieve1") int id2){
	model.addAttribute("list",this.service.find(id2));
	return "retrieve";
}
@RequestMapping(value="/delete-trainee",method=RequestMethod.GET)
public String delete(Model model){
	return "Delete";
}
int idRetreived=0;
@RequestMapping(value="/delete-trainee",method=RequestMethod.POST)
public String delete(Model model,@RequestParam("idd") int id2){
	idRetreived=id2;
	model.addAttribute("list",this.service.find(id2));
	return "Delete";
}
@RequestMapping(value="/deletefinal-trainee",method=RequestMethod.POST)
public String delete1(Model model){
	this.service.delete(idRetreived);
	return "Delete";
}

@RequestMapping(value="/modify-trainee",method=RequestMethod.GET)
public String modify(Model model){
	return "Modify";
}
int idRetreived1=0;
@RequestMapping(value="/modify-trainee11",method=RequestMethod.POST)
public String modify(Model model,@RequestParam("mod") int id2){
	
	model.addAttribute("list",this.service.find(id2));
	return "Modify";
}
@RequestMapping(value="/modify-trainee12",method=RequestMethod.POST)
public String modify(Model model,@ModelAttribute("trainee1") Trainee trainee){
	
	service.modify(trainee);
	return "Modify";
}

}

	
	



