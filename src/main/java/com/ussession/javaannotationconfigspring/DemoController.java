package com.ussession.javaannotationconfigspring;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class DemoController {

	public DemoController() {
		super();
		System.out.println("controller constructor called");
	}

}
