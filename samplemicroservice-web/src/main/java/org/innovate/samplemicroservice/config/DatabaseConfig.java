package org.innovate.samplemicroservice.config;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariDataSource;

/**
 *
 * @author BChekuri
 *
 */
@Configuration
@EnableTransactionManagement
public class DatabaseConfig {

	private final Logger log = LoggerFactory.getLogger(DatabaseConfig.class);
	
	@Autowired
	private Environment environment;
	
	@Bean(name = "dataSource")
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource getDataSource(DataSourceProperties dataSourceProperties) {
		log.info("getDataSource");
		log.info("Spring Active Profile - " + environment.getActiveProfiles() + ", Db url - " + dataSourceProperties.getUrl());
		return DataSourceBuilder
				.create(dataSourceProperties.getClassLoader())
				.type(HikariDataSource.class)
				.url(dataSourceProperties.getUrl())
				.password(dataSourceProperties.getPassword())
				.username(dataSourceProperties.getUsername())
				.build();
	}
	
}
