package com.ussession.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoService {
@Autowired
	private DemoRepository demoRepository;

	public DemoService() {
		super();
		System.out.println("service constructor called");
	}

	public void service() {
		System.out.println("service classbusiness logic method is called ");
		demoRepository.repo();
	}
}
