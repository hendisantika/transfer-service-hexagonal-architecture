package id.my.hendisantika.transferservicehexagonalarchitecture.adapter.db.datajdbc.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.OffsetDateTime;

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
@Data
@Builder(toBuilder = true)
@Table(schema = "transfer_service", name = "customer")
public class Customer {
    @Id
    Long id;
    String name;
    String personNumber;
    OffsetDateTime createdAt;
}
