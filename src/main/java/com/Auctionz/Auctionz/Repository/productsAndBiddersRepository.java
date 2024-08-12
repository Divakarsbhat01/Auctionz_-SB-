package com.Auctionz.Auctionz.Repository;

import com.Auctionz.Auctionz.Entity.productsAndBiddersEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface productsAndBiddersRepository extends MongoRepository<productsAndBiddersEntity,Integer>
{

}
