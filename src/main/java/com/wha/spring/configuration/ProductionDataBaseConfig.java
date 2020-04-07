package com.wha.spring.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Profile("Production")
@Configuration
public class ProductionDataBaseConfig implements DataBaseConfig{

	
	
	@Bean
	public DataSource createDataSource() {
		System.out.println("Create Production database");
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		return null;
	}
	
}
