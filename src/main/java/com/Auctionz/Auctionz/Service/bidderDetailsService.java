package com.Auctionz.Auctionz.Service;

import com.Auctionz.Auctionz.Schemas.bidderInput;
import org.springframework.stereotype.Service;

@Service
public interface bidderDetailsService {
    void insertNewBidder(bidderInput bidderInputObj);
}
