package id.my.hendisantika.transferservicehexagonalarchitecture.adapter.db.datajdbc.entity;

import id.my.hendisantika.transferservicehexagonalarchitecture.core.model.Deposit;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * Project : transfer-service-hexagonal-architecture
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/5/24
 * Time: 10:19
 * To change this template use File | Settings | File Templates.
 */
@Data
@Builder(toBuilder = true)
@Table(schema = "transfer_service", name = "deposit")
public class DepositEntity {
    @Id
    long id;
    String requestUid;
    long customerId;
    String fromAccountNumber;
    String toAccountNumber;
    BigDecimal amount;
    LocalDateTime createdAt;

    public static DepositEntity fromDeposit(Deposit deposit) {
        return DepositEntity.builder()
                .id(deposit.id())
                .requestUid(deposit.requestUid())
                .customerId(deposit.customerId())
                .fromAccountNumber(deposit.fromAccountNumber())
                .toAccountNumber(deposit.toAccountNumber())
                .amount(deposit.amount())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public Deposit toDeposit() {
        return Deposit.builder()
                .id(id)
                .customerId(customerId)
                .fromAccountNumber(fromAccountNumber)
                .toAccountNumber(toAccountNumber)
                .amount(amount)
                .build();
    }
}
