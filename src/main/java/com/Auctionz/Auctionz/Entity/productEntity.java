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
@Table(name="productDetails")
public class productEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String productName;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="auctionedBy",referencedColumnName = "id",insertable = false,updatable = false)
    private auctioneerEntity auctioneerEntityObj;

    private String productCategory;
    private String productOpeningValue;
    private String shortDescription;

    @ManyToMany(mappedBy = "productEntitySet",cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
    private Set<bidderEntity> bidderEntitySet;
}
