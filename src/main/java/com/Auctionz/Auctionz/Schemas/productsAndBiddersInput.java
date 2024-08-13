package com.Auctionz.Auctionz.Schemas;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Valid
public class productsAndBiddersInput
{
    private List<biddersInput>biddersInputListObj;
}
