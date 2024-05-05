package id.my.hendisantika.transferservicehexagonalarchitecture.core;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by IntelliJ IDEA.
 * Project : transfer-service-hexagonal-architecture
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/5/24
 * Time: 10:04
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@RequiredArgsConstructor
public class DefaultDepositService implements DepositService {

    private final DepositRepository depositRepository;
    private final CustomerService customerService;
}
