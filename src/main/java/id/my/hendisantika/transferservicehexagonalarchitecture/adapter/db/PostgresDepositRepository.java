package id.my.hendisantika.transferservicehexagonalarchitecture.adapter.db;

import id.my.hendisantika.transferservicehexagonalarchitecture.adapter.db.datajdbc.DepositDataJdbc;
import id.my.hendisantika.transferservicehexagonalarchitecture.adapter.db.datajdbc.entity.DepositEntity;
import id.my.hendisantika.transferservicehexagonalarchitecture.adapter.db.exception.RepositoryException;
import id.my.hendisantika.transferservicehexagonalarchitecture.core.model.Deposit;
import id.my.hendisantika.transferservicehexagonalarchitecture.core.port.DepositRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by IntelliJ IDEA.
 * Project : transfer-service-hexagonal-architecture
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/5/24
 * Time: 10:15
 * To change this template use File | Settings | File Templates.
 */
@AllArgsConstructor
@Slf4j
public class PostgresDepositRepository implements DepositRepository {

    private DepositDataJdbc depositDataJdbc;

    @Override
    public Deposit save(Deposit deposit) {
        try {
            var depositEntity = DepositEntity.fromDeposit(deposit);
            var savedDepositEntity = depositDataJdbc.save(depositEntity);
            return savedDepositEntity.toDeposit();
        } catch (RuntimeException e) {
            log.warn("Cannot save deposit={}", deposit);
            throw new RepositoryException("Cannot save deposit.", e);
        }
    }
}
