package com.Auctionz.Auctionz.Service_Implementation;

import com.Auctionz.Auctionz.Entity.auctioneerEntity;
import com.Auctionz.Auctionz.Repository.auctioneerDetailsRepository;
import com.Auctionz.Auctionz.Schemas.auctioneerInput;
import com.Auctionz.Auctionz.Service.auctioneerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class auctioneerDetailsServiceI implements auctioneerDetailsService
{
    @Autowired
    auctioneerDetailsRepository auctioneerDetailsRepositoryObj;
    @Override
    public void insertNewAuctioneer(auctioneerInput auctioneerInputObj)
    {
        auctioneerEntity auctioneerEntityObj=new auctioneerEntity(auctioneerInputObj);
        auctioneerDetailsRepositoryObj.save(auctioneerEntityObj);

    }
}
