package cm.belrose.SpringBootExceptionHandle.exception;

import org.springframework.http.HttpStatus;

public class ExceptionResponse {
    private String errorCode;
    private String errorMessage;
    private String requestedURI;
    private HttpStatus status;

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getRequestedURI() {
        return requestedURI;
    }


    public void setRequestedURI(String requestedURI) {
        this.requestedURI = requestedURI;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
