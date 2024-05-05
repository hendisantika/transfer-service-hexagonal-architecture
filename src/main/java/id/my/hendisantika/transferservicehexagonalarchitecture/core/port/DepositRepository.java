package id.my.hendisantika.transferservicehexagonalarchitecture.core.port;

import id.my.hendisantika.transferservicehexagonalarchitecture.core.model.Deposit;

/**
 * Created by IntelliJ IDEA.
 * Project : transfer-service-hexagonal-architecture
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/5/24
 * Time: 10:06
 * To change this template use File | Settings | File Templates.
 */
public interface DepositRepository {
    Deposit save(Deposit deposit);
}
