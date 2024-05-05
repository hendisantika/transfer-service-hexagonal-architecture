package id.my.hendisantika.transferservicehexagonalarchitecture.adapter.rest;

import id.my.hendisantika.transferservicehexagonalarchitecture.adapter.rest.dto.DepositDto;
import id.my.hendisantika.transferservicehexagonalarchitecture.core.port.DepositService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : transfer-service-hexagonal-architecture
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/5/24
 * Time: 10:11
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@RestController
@RequestMapping(path = "/v1/transfer-service", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class DepositController {

    private final DepositService depositService;

    @PostMapping(path = "/deposit", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addDeposit(@RequestBody DepositDto dto) {
        depositService.add(dto.toDomain());
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(dto.requestUid());
    }
}
