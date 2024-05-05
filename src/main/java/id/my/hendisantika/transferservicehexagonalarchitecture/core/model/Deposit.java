package id.my.hendisantika.transferservicehexagonalarchitecture.core.model;

import lombok.Builder;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * Project : transfer-service-hexagonal-architecture
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/5/24
 * Time: 10:07
 * To change this template use File | Settings | File Templates.
 */

@Builder(toBuilder = true)
public record Deposit(long id,
                      String requestUid,
                      long customerId,
                      String fromAccountNumber,
                      String toAccountNumber,
                      BigDecimal amount) {
}
