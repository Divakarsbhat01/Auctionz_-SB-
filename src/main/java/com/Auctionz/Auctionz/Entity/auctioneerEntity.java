package com.Auctionz.Auctionz.Entity;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.NumberFormat;

@Valid
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="auctioneerDetails")
public class auctioneerEntity
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @NotNull
    @Pattern(regexp="^[A-Za-z]*$",message = "Invalid Input")
    private String firstName;

    @NotNull
    @Pattern(regexp="^[A-Za-z]*$",message = "Invalid Input")
    private String lastName;

    @NotNull
    private int phone;

    @NotNull
    @Email
    private String email;

    private boolean verified=false;

    @NotNull
    @Pattern(regexp="^[A-Za-z]*$",message = "Invalid Input")
    private String country;

    @NotNull
    @Pattern(regexp="^[A-Za-z]*$",message = "Invalid Input")
    private String state;

    @NotNull
    @Pattern(regexp="^[A-Za-z]*$",message = "Invalid Input")
    private String city;

    @NotNull
    private int code;

    private boolean blocked=false;
}
