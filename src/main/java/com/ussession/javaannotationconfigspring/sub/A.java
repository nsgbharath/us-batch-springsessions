package com.ussession.javaannotationconfigspring.sub;

import org.springframework.stereotype.Component;

@Component
public class A {

	public A() {
		super();
		System.out.println("A class constructor");
	}

}
