package id.my.hendisantika.transferservicehexagonalarchitecture.adapter.db.datajdbc;

import id.my.hendisantika.transferservicehexagonalarchitecture.adapter.db.datajdbc.entity.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : transfer-service-hexagonal-architecture
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/5/24
 * Time: 10:17
 * To change this template use File | Settings | File Templates.
 */
public interface CustomerDataJdbc extends BaseDataJdbc, CrudRepository<Customer, Long> {
}
