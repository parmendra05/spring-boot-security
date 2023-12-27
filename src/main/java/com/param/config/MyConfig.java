package com.param.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class MyConfig {

	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((request) -> request
				.requestMatchers("/myAccount","/myBallance").authenticated()
				.requestMatchers("/myNotice","/mySupport").permitAll())
				.formLogin(Customizer.withDefaults())
				.httpBasic(Customizer.withDefaults());
		return http.build();
		
	}
	
	@Bean
	public InMemoryUserDetailsManager userDetailsManager() {
		UserDetails admin=User.withDefaultPasswordEncoder() //With Default Password Encoder
				.username("admin")
				.password("12345")
				.authorities("admin")
				.build();
		
		UserDetails user=User.withDefaultPasswordEncoder() // //With Default Password Encoder
				.username("user")
				.password("12345")
				.authorities("user")
				.build();
		
		return new InMemoryUserDetailsManager(admin,user);
	}
	
}
