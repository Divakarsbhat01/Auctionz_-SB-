package com.Auctionz.Auctionz.Service_Implementation;

import com.Auctionz.Auctionz.Entity.auctioneerEntity;
import com.Auctionz.Auctionz.Entity.bidderEntity;
import com.Auctionz.Auctionz.Repository.auctioneerDetailsRepository;
import com.Auctionz.Auctionz.Repository.bidderDetailsRepository;
import com.Auctionz.Auctionz.Schemas.bidderInput;
import com.Auctionz.Auctionz.Service.bidderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bidderDetailsServiceI implements bidderDetailsService
{
    @Autowired
    bidderDetailsRepository bidderDetailsRepositoryObj;
    @Override
    public void insertNewBidder(bidderInput bidderInputObj)
    {
        bidderEntity bidderEntityObj=new bidderEntity(bidderInputObj);
        bidderDetailsRepositoryObj.save(bidderEntityObj);
    }
}
