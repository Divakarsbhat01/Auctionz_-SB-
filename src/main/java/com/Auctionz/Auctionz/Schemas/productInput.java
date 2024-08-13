package com.Auctionz.Auctionz.Schemas;

import com.Auctionz.Auctionz.Entity.auctioneerEntity;
import com.Auctionz.Auctionz.Entity.bidderEntity;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;

import java.util.Set;

@Valid
@Data
@AllArgsConstructor
@NoArgsConstructor
public class productInput
{
    @NotNull
    @Pattern(regexp="^[A-Za-z]*$",message = "Invalid Input")
    private String productName;

    @NotNull
    private int auctionedBy;

    @NotNull
    private String productCategory;

    @NotNull
    private String productOpeningValue;

    @NotNull
    private String shortDescription;

}
