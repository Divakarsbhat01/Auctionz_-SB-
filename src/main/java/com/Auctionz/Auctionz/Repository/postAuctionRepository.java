package com.Auctionz.Auctionz.Repository;

import com.Auctionz.Auctionz.Entity.postAuctionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface postAuctionRepository extends JpaRepository<postAuctionEntity,Integer>
{
}
