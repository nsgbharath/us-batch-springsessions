package com.ussession.autowiring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class DemoRepository {

	public DemoRepository() {
		super();
		//System.out.println("repo costructor called");
	}

	public void repo() {
		System.out.println("Repo class  db transaction method is called ");
	}
}
