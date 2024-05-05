package id.my.hendisantika.transferservicehexagonalarchitecture.adapter.db.exception;

import id.my.hendisantika.transferservicehexagonalarchitecture.core.model.ErrorCode;
import id.my.hendisantika.transferservicehexagonalarchitecture.core.model.exception.TransferServiceException;

/**
 * Created by IntelliJ IDEA.
 * Project : transfer-service-hexagonal-architecture
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/5/24
 * Time: 10:16
 * To change this template use File | Settings | File Templates.
 */
public class RepositoryException extends TransferServiceException {

    public RepositoryException(ErrorCode errorCode, String description) {
        super(errorCode, description);
    }

    public RepositoryException() {
        super(DATABASE_INTERNAL_ERROR, "Internal database error");
    }

    public RepositoryException(String description, Throwable cause) {
        super(DATABASE_INTERNAL_ERROR, description, cause);
    }
}
