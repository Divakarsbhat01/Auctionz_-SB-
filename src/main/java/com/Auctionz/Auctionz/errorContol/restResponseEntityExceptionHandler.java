package com.Auctionz.Auctionz.errorContol;

import com.Auctionz.Auctionz.errorContol.exceptions.userNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class restResponseEntityExceptionHandler extends ResponseEntityExceptionHandler
{
    @ExceptionHandler(userNotFoundException.class)
    public ResponseEntity<errorMessage> userNotFoundException(userNotFoundException exception, WebRequest webRequest)
    {
        errorMessage errorMessage=new errorMessage(HttpStatus.NOT_FOUND,exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
    }
}
