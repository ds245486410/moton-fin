package com.moton.motonfin.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author daiweihang
 * @date 2022/7/26
 */
@EnableTransactionManagement
@Configuration
public class TransactionConfig {
    @Bean
    public PlatformTransactionManager mysqlTransactionManager(DataSource myqlDataSource)
    {
        return new DataSourceTransactionManager(myqlDataSource);
    }
}
