package com.coffeecoding.springsecurity;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.HttpAccessor;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http
			.csrf().disable()
			.authorizeRequests()
			.antMatchers("/enroll/*").permitAll()
			.antMatchers("/viewAllStudents").permitAll()
			.antMatchers("/signIn").permitAll()
			.antMatchers("/getStudentByEmail/*").permitAll()
			.anyRequest()
			.authenticated()
			.and()
			.httpBasic();
	}

}
