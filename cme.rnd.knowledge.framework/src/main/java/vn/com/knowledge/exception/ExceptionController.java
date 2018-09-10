package vn.com.knowledge.exception;

import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;
import org.apache.tomcat.util.http.fileupload.FileUploadBase;
import org.hibernate.StaleStateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.multipart.MultipartException;
import vn.com.knowledge.dto.ErrorResponseModal;
import vn.com.knowledge.dto.ResponseModal;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.util.Set;

@ControllerAdvice
public class ExceptionController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionController.class);

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    @ExceptionHandler({MultipartException.class, FileUploadBase.SizeLimitExceededException.class})
    public ResponseEntity<ResponseModal> handleSizeExceededException(Exception e) {
        LOGGER.info(e.getMessage());

        // we only get error message instead of full exception cause.
        // For example:
        // Could not parse multipart servlet request; nested exception is java.io.IOException:
        // org.apache.tomcat.util.http.fileupload.FileUploadException:
        // the request was rejected because no multipart boundary was found
        String message = e.getCause().getCause() == null ?
                e.getCause().getMessage() : e.getCause().getCause().getMessage();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).
                body(new ErrorResponseModal(HttpStatus.BAD_REQUEST.value(), message));
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    @ExceptionHandler(JpaSystemException.class)
    public ResponseEntity<ResponseModal> validateChecklistName(JpaSystemException e) throws IOException {
        LOGGER.info(e.getMessage());
        ResponseModal error = new ErrorResponseModal(HttpStatus.BAD_REQUEST.value(), e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(error);
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = {StaleStateException.class, OptimisticLockingFailureException.class, BadRequestException.class})
    public ResponseEntity<ResponseModal> handleStaleData(Exception e) throws IOException {
        LOGGER.info(e.getMessage());
        ResponseModal error = new ErrorResponseModal(HttpStatus.BAD_REQUEST.value(), e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(error);
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = {javax.persistence.EntityNotFoundException.class, MethodArgumentTypeMismatchException.class, ResourceNotFoundException.class, DataIntegrityViolationException.class})
    public ResponseEntity<ResponseModal> handleEntityNotFound() throws IOException {
        LOGGER.info("Data not found");
        ResponseModal error = new ErrorResponseModal(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND.getReasonPhrase());
        return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(error);
    }

    @ResponseBody
    @ExceptionHandler({GenericException.class, InternalException.class})
    public ResponseEntity<ResponseModal> handleGenericExceptions(GenericException ex) throws IOException {
        LOGGER.info("{}", ex.getMessage());
        ResponseModal error = new ErrorResponseModal(ex.getStatus(), ex.getMessage());
        return ResponseEntity.status(ex.getStatus()).body(error);
    }

    @ExceptionHandler
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseModal handle(ConstraintViolationException exception) {
        Set<ConstraintViolation<?>> violations = exception.getConstraintViolations();
        StringBuilder strBuilder = new StringBuilder();
        for (ConstraintViolation<?> violation : violations) {
            strBuilder.append(violation.getMessage() + ". ");
        }
        return new ErrorResponseModal(HttpStatus.BAD_REQUEST.value(), strBuilder.toString());
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public ResponseEntity<ResponseModal> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) throws IOException {
        LOGGER.info("{}", ex.getMessage());
        String message = ex.getBindingResult().getFieldError().getField() + " " + ex.getBindingResult().getFieldError().getDefaultMessage();
        ResponseModal error = new ErrorResponseModal(HttpStatus.BAD_REQUEST.value(), message);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = {Exception.class})
    public ResponseModal handleCommonException(Exception ex) throws IOException {
        LOGGER.error(ex.getMessage(), ex);
        ResponseModal error = new ErrorResponseModal(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
        return error;
    }

//    @ResponseStatus(HttpStatus.UNAUTHORIZED)
//    @ResponseBody
////    @ExceptionHandler(value = AuthenticationException.class)
//    public ResponseModal handleAuthenticationExceptions(AuthenticationException ex) {
//        LOGGER.info("Authentication Exception: {}", ex.getMessage());
//        ResponseModal error = new ErrorResponseModal(HttpStatus.UNAUTHORIZED.value(), "Username or password is incorrect");
//        return error;
//    }

    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ResponseBody
    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<ResponseModal> validateChecklistName(AccessDeniedException e) {
        LOGGER.info(e.getMessage());
        ResponseModal error = new ErrorResponseModal(HttpStatus.FORBIDDEN.value(), e.getMessage());
        return ResponseEntity.status(HttpStatus.FORBIDDEN.value()).body(error);
    }
}
