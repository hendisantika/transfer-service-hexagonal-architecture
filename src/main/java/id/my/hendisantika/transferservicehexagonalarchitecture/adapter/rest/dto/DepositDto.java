package id.my.hendisantika.transferservicehexagonalarchitecture.adapter.rest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import id.my.hendisantika.transferservicehexagonalarchitecture.core.model.Deposit;
import lombok.Builder;

import java.math.BigDecimal;

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
@Builder(toBuilder = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public record DepositDto(
        String requestUid,
        long customerId,
        String fromAccountNumber,
        String toAccountNumber,
        String amount) {

    public Deposit toDomain() {
        return Deposit.builder()
                .requestUid(requestUid)
                .customerId(customerId)
                .fromAccountNumber(fromAccountNumber)
                .toAccountNumber(toAccountNumber)
                .amount(new BigDecimal(amount))
                .build();
    }
}
