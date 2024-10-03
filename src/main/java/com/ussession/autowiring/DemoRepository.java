package com.ussession.autowiring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class DemoRepository {

	public DemoRepository() {
		super();
		System.out.println("repo costructor called");
	}
	public void repo() {
		System.out.println("Repo class  db transaction method is called ");
	}
}
