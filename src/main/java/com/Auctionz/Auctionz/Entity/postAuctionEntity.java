package com.Auctionz.Auctionz.Entity;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Valid
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="postAuction")
public class postAuctionEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="productId",referencedColumnName = "id",insertable = false,updatable = false)
    private productEntity productEntityObj;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="bidderId",referencedColumnName = "id",insertable = false,updatable = false)
    private productEntity bidderEntityObj;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="auctioneerId",referencedColumnName = "id",insertable = false,updatable = false)
    private productEntity auctioneerEntityObj;

    private int openingPrice;
    private int closingPrice;
}
