package cm.belrose.SpringBootExceptionHandle.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ExceptionHandlerControllerAdvice {

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public @ResponseBody ExceptionResponse handleResourceNotFound(ResourceNotFoundException ex, HttpServletRequest req) {
        ExceptionResponse error = new ExceptionResponse();
        error.setErrorCode(ex.getErrorCode());
        error.setErrorMessage(ex.getMessage());
        error.setRequestedURI(req.getRequestURI());
        return error;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public @ResponseBody ExceptionResponse handleException(Exception ex, HttpServletRequest req) {
        ExceptionResponse error = new ExceptionResponse();
        error.setErrorCode("Technical Error");
        error.setErrorMessage(ex.getMessage());
        error.setRequestedURI(req.getRequestURI());
        return error;
    }

}
