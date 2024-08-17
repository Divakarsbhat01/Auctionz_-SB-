package com.Auctionz.Auctionz.Entity;

import com.Auctionz.Auctionz.Schemas.auctioneerInput;
import com.Auctionz.Auctionz.Schemas.bidderInput;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;

import java.util.Set;

@Entity
@Valid
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="bidderDetails")
public class bidderEntity
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @NotNull
    @Pattern(regexp="^[A-Za-z]*$",message = "Invalid Input")
    private String firstName;

    @NotNull
    @Pattern(regexp="^[A-Za-z]*$",message = "Invalid Input")
    private String lastName;

    @NotNull
    private Long phone;

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

    @ManyToMany(cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
    @JoinTable(name="productBidder",
    joinColumns = @JoinColumn(name="bId"),
    inverseJoinColumns = @JoinColumn(name="pId"))
    private Set<productEntity> productEntitySet;

    public bidderEntity(bidderInput bidderInputObj)
    {
        this.firstName=bidderInputObj.getFirstName();
        this.lastName=bidderInputObj.getLastName();
        this.city=bidderInputObj.getCity();
        this.email=bidderInputObj.getEmail();
        this.code=Integer.parseInt(bidderInputObj.getCode());
        this.country=bidderInputObj.getCountry();
        this.state=bidderInputObj.getState();
        this.phone=Long.parseLong(bidderInputObj.getPhone());
    }
}
