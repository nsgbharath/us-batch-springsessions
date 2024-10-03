package com.ussession.javaconfigspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {
//metadata
	// class info
	// name
	// scope
	// behaviour

	@Bean
	public DemoController createControllerBean() {
		return new DemoController();
	}

	@Bean(name = "demoServiceBean")
	@Scope("prototype")
	public DemoService createServiceBean() {
		return new DemoService();
	}

	@Bean(name = "demoRepo")
	@Scope
	@Lazy
	public DemoRepository createRepo() {
		return new DemoRepository();
	}

//	@Bean
//	public Object dummy() {
//		System.out.println("bean check");
//		return null;
//	}

}
