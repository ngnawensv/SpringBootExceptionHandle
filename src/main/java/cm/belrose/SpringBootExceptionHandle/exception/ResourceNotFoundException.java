package cm.belrose.SpringBootExceptionHandle.exception;

import org.springframework.http.HttpStatus;

public class ResourceNotFoundException extends Exception {
    private static final long serialVersionUID = -9079454849611061074L;

    private Long resourceId;
    private String errorCode;
    private HttpStatus status;

    public ResourceNotFoundException() {
        super();
    }

    public ResourceNotFoundException(final String message) {
        super(message);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
