package com.Auctionz.Auctionz.Service;

import com.Auctionz.Auctionz.Schemas.auctioneerInput;
import org.springframework.stereotype.Service;

@Service
public interface auctioneerDetailsService
{
    public void insertNewAuctioneer(auctioneerInput auctioneerInputObj);
}
