package id.my.hendisantika.transferservicehexagonalarchitecture.adapter.db.datajdbc;

import id.my.hendisantika.transferservicehexagonalarchitecture.adapter.db.datajdbc.entity.DepositEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : transfer-service-hexagonal-architecture
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/5/24
 * Time: 10:18
 * To change this template use File | Settings | File Templates.
 */
public interface DepositDataJdbc extends BaseDataJdbc, CrudRepository<DepositEntity, Long> {
}
