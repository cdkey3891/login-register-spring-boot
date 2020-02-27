package com.hellokoding.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import com.hellokoding.auth.repository.RoleRepository;
import com.hellokoding.auth.repository.UserRepository;
import com.hellokoding.auth.service.UserService;

@SpringBootApplication
public class WebApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WebApplication.class);
	}

	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(WebApplication.class, args);
		System.out.println(context.getBean(UserRepository.class));
		System.out.println(context.getBean(RoleRepository.class));
		System.out.println(context.getBean(UserService.class));
	}
}
