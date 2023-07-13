package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dto.Hospital;
import com.spring.service.HospitalService;

@Controller
public class HospitalController {	
	@Autowired
	HospitalService hospitalService;
	//we have to send empty object to the jsp file
	@RequestMapping("/load")
	public ModelAndView loadJsp() {
		ModelAndView andView = new ModelAndView("save.jsp");
		return andView.addObject("loading", new Hospital());
	}
	
	@RequestMapping("/save")
	public ModelAndView save(@ModelAttribute Hospital hospital) {
		Hospital hospital2 = hospitalService.saveService(hospital);
		if(hospital2 != null) {
			ModelAndView andView = new ModelAndView("result.jsp");
			return andView.addObject("gh", "data is save in the table");
		}
		else {
			ModelAndView andView = new ModelAndView("index.jsp");
			return andView.addObject("gh", "data is not save");
		}
	}
	
}
