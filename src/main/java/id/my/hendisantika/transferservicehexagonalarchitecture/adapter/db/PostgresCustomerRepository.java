package id.my.hendisantika.transferservicehexagonalarchitecture.adapter.db;

import id.my.hendisantika.transferservicehexagonalarchitecture.core.model.ErrorCode;
import id.my.hendisantika.transferservicehexagonalarchitecture.core.port.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by IntelliJ IDEA.
 * Project : transfer-service-hexagonal-architecture
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/5/24
 * Time: 10:14
 * To change this template use File | Settings | File Templates.
 */
@AllArgsConstructor
@Slf4j
public class PostgresCustomerRepository implements CustomerRepository {

    private CustomerDataJdbc customerDataJdbc;

    @Override
    public void validateCustomer(long id) {
        var customerEntityOptional = customerDataJdbc.findById(id);
        customerEntityOptional.orElseThrow(() -> {
            log.error(String.format("customer with id %s doesn't exist.", id));
            return new RepositoryException(ErrorCode.CUSTOMER_DOES_NOT_EXIST, "Customer not found");
        });
    }
}
