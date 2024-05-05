package id.my.hendisantika.transferservicehexagonalarchitecture.core;

import id.my.hendisantika.transferservicehexagonalarchitecture.core.port.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by IntelliJ IDEA.
 * Project : transfer-service-hexagonal-architecture
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/5/24
 * Time: 09:58
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@Transactional
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository repository;

    public void validateCustomer(long id) {
        repository.validateCustomer(id);
    }
}
