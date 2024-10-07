package com.ussession.primaryannotation.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceClass2 implements ServiceInterface {

	public ServiceClass2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void service() {
		System.out.println("service class 2 method");

	}

}
