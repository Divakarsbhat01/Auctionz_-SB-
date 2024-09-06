package com.Auctionz.Auctionz.Service;

import com.Auctionz.Auctionz.Entity.auctioneerEntity;
import com.Auctionz.Auctionz.Entity.bidderEntity;
import com.Auctionz.Auctionz.Schemas.auctioneerInput;
import com.Auctionz.Auctionz.Schemas.bidderInput;
import com.Auctionz.Auctionz.errorContol.exceptions.userNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface bidderDetailsService {
    int insertNewBidder(bidderInput bidderInputObj);

    void updateNewBidder(int id, auctioneerInput auctioneerInputObj) throws userNotFoundException;

    Object getAllBidder();

    Optional<bidderEntity> getBidderById(int id) throws userNotFoundException;

    void deleteBidder(int id) throws userNotFoundException;
}
