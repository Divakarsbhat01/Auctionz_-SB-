package com.Auctionz.Auctionz.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "ProductsandBidders")
public class productsAndBiddersEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pid;
    private List<biddersEntity>biddersEntityObj;
}
