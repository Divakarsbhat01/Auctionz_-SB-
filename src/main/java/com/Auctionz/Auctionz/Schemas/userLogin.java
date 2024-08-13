package com.Auctionz.Auctionz.Schemas;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Valid
@AllArgsConstructor
@NoArgsConstructor
public class userLogin
{
    @NotNull
    private String userType;

    @NotNull
    private int userId;

    @NotNull
    @Email
    private String email;
}
