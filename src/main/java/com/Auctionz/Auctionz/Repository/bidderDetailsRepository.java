package com.Auctionz.Auctionz.Repository;

import com.Auctionz.Auctionz.Entity.bidderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bidderDetailsRepository extends JpaRepository<bidderEntity,Integer>
{
}
