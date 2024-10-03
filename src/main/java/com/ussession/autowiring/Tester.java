package com.ussession.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

	public static void main(String[] args) {
		System.out.println("creating context");
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		DemoController controller = context.getBean(DemoController.class);
		controller.controller();
	}

}
