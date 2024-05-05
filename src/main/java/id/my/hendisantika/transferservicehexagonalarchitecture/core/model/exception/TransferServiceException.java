package id.my.hendisantika.transferservicehexagonalarchitecture.core.model.exception;

import id.my.hendisantika.transferservicehexagonalarchitecture.core.model.ErrorCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Created by IntelliJ IDEA.
 * Project : transfer-service-hexagonal-architecture
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/5/24
 * Time: 10:08
 * To change this template use File | Settings | File Templates.
 */
@Getter
@ToString
public class TransferServiceException extends RuntimeException {

    private final ErrorCode errorCode;
    private final String description;

    public TransferServiceException(ErrorCode errorCode, String description) {
        super(String.format("Error Code: %s, Description: %s", errorCode, description));
        this.errorCode = errorCode;
        this.description = description;
    }

    public TransferServiceException(ErrorCode errorCode, String description, Throwable cause) {
        super(String.format("Error Code: %s, Description: %s", errorCode, description), cause);
        this.errorCode = errorCode;
        this.description = description;
    }
}
