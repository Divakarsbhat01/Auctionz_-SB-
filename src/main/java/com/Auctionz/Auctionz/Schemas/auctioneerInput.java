package com.Auctionz.Auctionz.Schemas;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;

@Valid
@NoArgsConstructor
@AllArgsConstructor
@Data
public class auctioneerInput
{
    @NotNull
    @Pattern(regexp="^[A-Za-z]*$",message = "Invalid Input for First Name")
    private String firstName;

    @NotNull
    @Pattern(regexp="^[A-Za-z]*$",message = "Invalid Input for Last Name")
    private String lastName;

    @NotNull
    private String phone;

    @Email
    private String email;

    @NotNull
    @Pattern(regexp="^[A-Za-z]*$",message = "Invalid Input for Country")
    private String country;

    @NotNull
    @Pattern(regexp="^[A-Za-z]*$",message = "Invalid Input for State")
    private String state;

    @NotNull
    @Pattern(regexp="^[A-Za-z]*$",message = "Invalid Input for City")
    private String city;

    @NotNull
    private String code;
}
