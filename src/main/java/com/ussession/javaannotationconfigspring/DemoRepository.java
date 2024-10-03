package com.ussession.javaannotationconfigspring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class DemoRepository {

	public DemoRepository() {
		super();
		System.out.println("repo costructor called");
	}

}
