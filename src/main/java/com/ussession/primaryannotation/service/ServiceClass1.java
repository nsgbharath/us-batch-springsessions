package com.ussession.primaryannotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.ussession.primaryannotation.repository.RepositoryInterface;

@Service
//@Primary
public class ServiceClass1 implements ServiceInterface {

	@Autowired
	private RepositoryInterface repo;

	public ServiceClass1() {

	}

	@Override
	public void service() {
		System.out.println("class 1 service method");
		repo.repo();
	}

}
