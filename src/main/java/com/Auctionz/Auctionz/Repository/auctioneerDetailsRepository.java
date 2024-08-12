package com.Auctionz.Auctionz.Repository;

import com.Auctionz.Auctionz.Entity.auctioneerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface auctioneerDetailsRepository extends JpaRepository<auctioneerEntity,Integer>
{

}
