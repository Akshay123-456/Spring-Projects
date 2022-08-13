package com.informationasset.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DS_Config {
@Bean
public DataSource MySqlDatasource()
{
	DriverManagerDataSource datasource=new DriverManagerDataSource();
	datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	datasource.setSchema("test");
	datasource.setUrl("jdbc:mysql://localhost:3306/test");
	datasource.setUsername("akshay");
	datasource.setPassword("Akshay@123");
	return datasource;
}
}
