package com.Auctionz.Auctionz.Schemas;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Valid
public class userOutput
{
    private int userId;
    private String firstName;
    private String lastName;
    private String token;
    private String tokenType;
}
