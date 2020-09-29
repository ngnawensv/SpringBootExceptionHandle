package cm.belrose.SpringBootExceptionHandle.exception;

import org.springframework.http.HttpStatus;

public class EmployeServiceException extends Exception {
    private static final long serialVersionUID = -470180507998010368L;

    private Long resourceId;
    private String errorCode;
    private HttpStatus status;

    public EmployeServiceException() {
        super();
    }

    public EmployeServiceException(String message) {
        super(message);
    }

    public EmployeServiceException(Long resourceId, String message) {
        super(message);
        this.resourceId = resourceId;
    }
    public EmployeServiceException(Long resourceId, String errorCode, String message) {
        super(message);
        this.resourceId = resourceId;
        this.errorCode = errorCode;
    }

    public EmployeServiceException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public EmployeServiceException(String errorCode, String message, HttpStatus status) {
        super(message);
        this.errorCode = errorCode;
        this.status = status;
    }
}
