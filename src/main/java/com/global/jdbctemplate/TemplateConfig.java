package com.global.jdbctemplate;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;


public class TemplateConfig{
	/*
	@Value("${connection.url}")
	private String url;
	@Value("${connection.driver}")
	private String driver;
	@Value("${connection.userName}")
	private String userName;
	@Value("${connection.password}")
	private String password;
	*/
	
    @Autowired
    private DataSource dataSource;
    
	
	@Bean 
	public JdbcTemplate getTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(dataSource);
		return template;
	}
}
