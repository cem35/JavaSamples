package com.springdemo;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.springdemo")
@PropertySource("classpath:values.properties")
public class IocConfic {
	
	@Bean
	public ICustomerDal database() {
		return new OracleCustomerDal(); 
	}
	
	@Bean
	public ICustomerService service() {
		return new CustomerManager(database()); 
	}

}
