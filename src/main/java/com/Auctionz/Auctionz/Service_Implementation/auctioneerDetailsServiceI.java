package com.Auctionz.Auctionz.Service_Implementation;

import com.Auctionz.Auctionz.Entity.auctioneerEntity;
import com.Auctionz.Auctionz.Repository.auctioneerDetailsRepository;
import com.Auctionz.Auctionz.Schemas.auctioneerInput;
import com.Auctionz.Auctionz.Service.auctioneerDetailsService;
import com.Auctionz.Auctionz.errorContol.exceptions.userNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class auctioneerDetailsServiceI implements auctioneerDetailsService
{
    @Autowired
    auctioneerDetailsRepository auctioneerDetailsRepositoryObj;
    @Override
    public int insertNewAuctioneer(auctioneerInput auctioneerInputObj)
    {
        auctioneerEntity auctioneerEntityObj=new auctioneerEntity(auctioneerInputObj);
        auctioneerEntity x=auctioneerDetailsRepositoryObj.save(auctioneerEntityObj);
        return x.getId();

    }

    @Override
    public void updateNewAuctioneer(int id, auctioneerInput auctioneerInputObj) throws userNotFoundException {
        if(auctioneerDetailsRepositoryObj.findById(id)!=null)
        {
            auctioneerEntity x=auctioneerDetailsRepositoryObj.getReferenceById(id);
            x.setFirstName(auctioneerInputObj.getFirstName());
            x.setLastName(auctioneerInputObj.getLastName());
            x.setCity(auctioneerInputObj.getCity());
            x.setEmail(auctioneerInputObj.getEmail());
            x.setState(auctioneerInputObj.getState());
            x.setCode(Integer.parseInt(auctioneerInputObj.getCode()));
            x.setPhone(Long.parseLong(auctioneerInputObj.getPhone()));
            x.setCountry(auctioneerInputObj.getCountry());
            auctioneerDetailsRepositoryObj.save(x);
        }
        else {
            throw new userNotFoundException("User ID Not FOund");
        }
    }

    @Override
    public List<auctioneerEntity> getAllAuctioneer()
    {
        return auctioneerDetailsRepositoryObj.findAll();
    }

    @Override
    public Optional<auctioneerEntity> getAuctioneerById(int id) throws userNotFoundException {
        if(auctioneerDetailsRepositoryObj.findById(id).isPresent())
        {
            return auctioneerDetailsRepositoryObj.findById(id);
        }
        else
        {
            throw new userNotFoundException("User ID Not FOund");
        }

    }

    @Override
    public void deleteAuctioneer(int id) throws userNotFoundException {
        if(auctioneerDetailsRepositoryObj.findById(id).isPresent())
        {
            auctioneerDetailsRepositoryObj.deleteById(id);
        }
        else
        {
            throw new userNotFoundException("User ID Not FOund");
        }
    }
}
