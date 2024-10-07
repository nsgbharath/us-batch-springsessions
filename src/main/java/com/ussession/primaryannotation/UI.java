package com.ussession.primaryannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ussession.primaryannotation.controller.ControllerClass;
import com.ussession.primaryannotation.controller.ControllerInterface;

public class UI {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		ControllerInterface controller = context.getBean(ControllerClass.class);
		controller.controller();

	}

}
