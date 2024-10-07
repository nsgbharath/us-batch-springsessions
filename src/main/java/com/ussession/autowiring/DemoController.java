package com.ussession.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//@Component
//name=demoController
//scope=singleton
@Controller
public class DemoController {
	 @Autowired
	private DemoService demoService ;
	

	public DemoController() {
		super();
		//System.out.println("controller constructor called");
	}

	public void controller() {
		System.out.println("controller class entry point method is called ");
		demoService.service();
	}

}
