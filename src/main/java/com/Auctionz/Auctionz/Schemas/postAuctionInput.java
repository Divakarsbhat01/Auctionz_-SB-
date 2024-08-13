package com.Auctionz.Auctionz.Schemas;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Valid
public class postAuctionInput
{
    @NotNull
    private int productId;

    @NotNull
    private int bidderId;

    @NotNull
    private int auctioneerId;

    @NotNull
    private int openingPrice;

    @NotNull
    private int closingPrice;
}
