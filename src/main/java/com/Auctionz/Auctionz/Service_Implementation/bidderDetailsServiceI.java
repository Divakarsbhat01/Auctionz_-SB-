package com.Auctionz.Auctionz.Service_Implementation;

import com.Auctionz.Auctionz.Entity.auctioneerEntity;
import com.Auctionz.Auctionz.Entity.bidderEntity;
import com.Auctionz.Auctionz.Repository.bidderDetailsRepository;
import com.Auctionz.Auctionz.Schemas.auctioneerInput;
import com.Auctionz.Auctionz.Schemas.bidderInput;
import com.Auctionz.Auctionz.Service.bidderDetailsService;
import com.Auctionz.Auctionz.errorContol.exceptions.userNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class bidderDetailsServiceI implements bidderDetailsService
{
    @Autowired
    bidderDetailsRepository bidderDetailsRepositoryObj;
    @Override
    public int insertNewBidder(bidderInput bidderInputObj)
    {
        bidderEntity bidderEntityObj=new bidderEntity(bidderInputObj);
        bidderEntity x=bidderDetailsRepositoryObj.save(bidderEntityObj);
        return x.getId();
    }

    @Override
    public void updateNewBidder(int id, auctioneerInput auctioneerInputObj) throws userNotFoundException {
        if(bidderDetailsRepositoryObj.findById(id)!=null)
        {
            bidderEntity x=bidderDetailsRepositoryObj.getReferenceById(id);
            x.setFirstName(auctioneerInputObj.getFirstName());
            x.setLastName(auctioneerInputObj.getLastName());
            x.setCity(auctioneerInputObj.getCity());
            x.setEmail(auctioneerInputObj.getEmail());
            x.setState(auctioneerInputObj.getState());
            x.setCode(Integer.parseInt(auctioneerInputObj.getCode()));
            x.setPhone(Long.parseLong(auctioneerInputObj.getPhone()));
            x.setCountry(auctioneerInputObj.getCountry());
            bidderDetailsRepositoryObj.save(x);
        }
        else {
            throw new userNotFoundException("User ID Not FOund");
        }
    }

    @Override
    public Object getAllBidder()
    {
        return bidderDetailsRepositoryObj.findAll();
    }

    @Override
    public Optional<bidderEntity> getBidderById(int id) throws userNotFoundException {
        if(bidderDetailsRepositoryObj.findById(id).isPresent())
        {
            return bidderDetailsRepositoryObj.findById(id);
        }
        else
        {
            throw new userNotFoundException("User ID Not FOund");
        }
    }

    @Override
    public void deleteBidder(int id) throws userNotFoundException {
        if(bidderDetailsRepositoryObj.findById(id).isPresent())
        {
            bidderDetailsRepositoryObj.deleteById(id);
        }
        else
        {
            throw new userNotFoundException("User ID Not FOund");
        }
    }
}
