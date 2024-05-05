package id.my.hendisantika.transferservicehexagonalarchitecture.config;

import id.my.hendisantika.transferservicehexagonalarchitecture.adapter.db.PostgresCustomerRepository;
import id.my.hendisantika.transferservicehexagonalarchitecture.adapter.db.PostgresDepositRepository;
import id.my.hendisantika.transferservicehexagonalarchitecture.adapter.db.datajdbc.BaseDataJdbc;
import id.my.hendisantika.transferservicehexagonalarchitecture.adapter.db.datajdbc.CustomerDataJdbc;
import id.my.hendisantika.transferservicehexagonalarchitecture.adapter.db.datajdbc.DepositDataJdbc;
import id.my.hendisantika.transferservicehexagonalarchitecture.core.CustomerService;
import id.my.hendisantika.transferservicehexagonalarchitecture.core.DefaultDepositService;
import id.my.hendisantika.transferservicehexagonalarchitecture.core.port.CustomerRepository;
import id.my.hendisantika.transferservicehexagonalarchitecture.core.port.DepositRepository;
import id.my.hendisantika.transferservicehexagonalarchitecture.core.port.DepositService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
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
