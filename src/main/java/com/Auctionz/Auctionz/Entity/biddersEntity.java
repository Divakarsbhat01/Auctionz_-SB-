package com.Auctionz.Auctionz.Entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class biddersEntity
{
    @NotNull
    private int bidderId;
    @NotNull
    private int bidPrice;
}
