package com.ussession.primaryannotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.ussession.primaryannotation.service.ServiceInterface;

@Controller
public class ControllerClass implements ControllerInterface {

	@Autowired
	@Qualifier(value="serviceClass2")
	private ServiceInterface service;

	public ControllerClass() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void controller() {
		System.out.println("controller class entry point method");
		service.service();
	}

}
