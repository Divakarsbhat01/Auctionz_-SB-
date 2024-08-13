package com.Auctionz.Auctionz.errorContol;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class errorMessage
{
    private HttpStatus httpStatus;
    private String message;
}
