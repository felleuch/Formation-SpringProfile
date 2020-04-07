package com.wha.spring.configuration;

import javax.sql.DataSource;

public interface DataBaseConfig {
	DataSource createDataSource();
}



