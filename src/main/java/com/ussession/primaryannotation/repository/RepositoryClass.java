package com.ussession.primaryannotation.repository;

import org.springframework.stereotype.Repository;

@Repository
public class RepositoryClass implements RepositoryInterface {
//@Value("")
	private String url;

	public RepositoryClass() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void repo() {
		System.out.println("repo method called for db transaction logic");
		// url
		// username
		// password

	}

}
