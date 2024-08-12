package com.Auctionz.Auctionz.Entity;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
    private String firstName;
    private String lastName;
    private int phone;
    private String email;
    private boolean verified=false;
    private String country;
    private String state;
    private String city;
    private int code;
    private boolean blocked=false;
}
