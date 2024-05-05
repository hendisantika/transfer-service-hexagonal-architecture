package id.my.hendisantika.transferservicehexagonalarchitecture.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by IntelliJ IDEA.
 * Project : transfer-service-hexagonal-architecture
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/5/24
 * Time: 09:56
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@EnableScheduling
@EnableJdbcRepositories(basePackageClasses = {BaseDataJdbc.class})
@EnableConfigurationProperties()
@Slf4j
public class TransferServiceConfig {
    // Service Beans
    @Bean
    public DepositService depositService(DepositRepository depositTransferRepository, CustomerService endUserService) {
        return new DefaultDepositService(depositTransferRepository, endUserService);
    }

    @Bean
    public CustomerService customerService(CustomerRepository endUserRepository) {
        return new CustomerService(endUserRepository);
    }

    // Repository Beans
    @Bean
    DepositRepository depositTransferRepository(DepositDataJdbc depositTransferDataJdbc) {
        return new PostgresDepositRepository(depositTransferDataJdbc);
    }

    @Bean
    public CustomerRepository customerRepository(CustomerDataJdbc customerDataJdbc) {
        return new PostgresCustomerRepository(customerDataJdbc);
    }
}