package com.Auctionz.Auctionz.Repository;

import com.Auctionz.Auctionz.Entity.productEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productDetailsRepository extends JpaRepository<productEntity,Integer>
{

}
