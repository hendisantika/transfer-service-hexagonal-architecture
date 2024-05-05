package id.my.hendisantika.transferservicehexagonalarchitecture.adapter.liquibase;

import org.apache.commons.lang3.StringUtils;
import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

/**
 * Created by IntelliJ IDEA.
 * Project : transfer-service-hexagonal-architecture
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/5/24
 * Time: 10:09
 * To change this template use File | Settings | File Templates.
 */
@SpringBootApplication
public class LiquibaseRunner {
    @Profile("liquibase")
    @EnableConfigurationProperties(LiquibaseProperties.class)
    @Configuration
    static class LiquibaseConfig {

        @Bean
        @LiquibaseDataSource
        DataSource liquibaseDataSource(LiquibaseProperties properties) {
            var dataSource = new PGSimpleDataSource();

            dataSource.setUser(properties.user());
            if (StringUtils.isNotBlank(properties.password())) {
                dataSource.setPassword(properties.password());
            }
            dataSource.setUrl(properties.url());

            return dataSource;
        }
    }

    @ConfigurationProperties("spring.liquibase")
    record LiquibaseProperties(
            boolean enabled,
            String user,
            String password,
            String url) {

    }
}
