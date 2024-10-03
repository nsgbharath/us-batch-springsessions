package com.ussession.javaannotationconfigspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

	public static void main(String[] args) {
		System.out.println("creating context");
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

//		DemoController dc1 = new DemoController();
//		DemoController dc2 = new DemoController();
//Class
		DemoController dc1 = context.getBean(DemoController.class);
		Object o = context.getBean("demoController");
		DemoController dc2 = (DemoController) o;
////
		System.out.println("hashCode of dc1 :" + dc1.hashCode());
		System.out.println("hashCode of dc2 :" + dc2.hashCode());
		System.out.println();
		DemoService ds1 = context.getBean(DemoService.class);
		DemoService ds2 = (DemoService) context.getBean("demoService");
		System.out.println("hashCode of ds1 :" + ds1.hashCode());
		System.out.println("hashCode of ds2 :" + ds2.hashCode());
//		System.out.println();
//		DemoRepository dr1 = context.getBean(DemoRepository.class);
//		DemoRepository dr2 = (DemoRepository) context.getBean("demoController");
//		System.out.println("hashCode of dr1 :" + dr1.hashCode());
//		System.out.println("hashCode of dr2 :" + dr2.hashCode());

	}

}
