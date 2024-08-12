package com.Auctionz.Auctionz.Entity;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    @ManyToMany(cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
    @JoinTable(name="productBidder",
    joinColumns = @JoinColumn(name="bId"),
    inverseJoinColumns = @JoinColumn(name="pId"))
    private Set<productEntity> productEntitySet;
}
