package com.Auctionz.Auctionz.Schemas;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Valid
public class biddersInput
{
    @NotNull
    private int bidderId;
    @NotNull
    private int bidPrice;
}
