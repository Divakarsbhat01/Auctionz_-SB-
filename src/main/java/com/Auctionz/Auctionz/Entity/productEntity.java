package com.Auctionz.Auctionz.Entity;

import jakarta.persistence.*;
import jakarta.validation.Valid;
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
@Table(name="productDetails")
public class productEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    @Pattern(regexp="^[A-Za-z]*$",message = "Invalid Input")
    private String productName;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="auctionedBy",referencedColumnName = "id",insertable = false,updatable = false)
    private auctioneerEntity auctioneerEntityObj;

    @NotNull
    private String productCategory;

    @NotNull
    private String productOpeningValue;

    @NotNull
    private String shortDescription;

    @ManyToMany(mappedBy = "productEntitySet",cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
    private Set<bidderEntity> bidderEntitySet;
}
