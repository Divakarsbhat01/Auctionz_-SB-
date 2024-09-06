package com.Auctionz.Auctionz.Service;

import com.Auctionz.Auctionz.Entity.auctioneerEntity;
import com.Auctionz.Auctionz.Schemas.auctioneerInput;
import com.Auctionz.Auctionz.errorContol.exceptions.userNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface auctioneerDetailsService
{
    public int insertNewAuctioneer(auctioneerInput auctioneerInputObj);

    void updateNewAuctioneer(int id,auctioneerInput auctioneerInputObj) throws userNotFoundException;

    List<auctioneerEntity> getAllAuctioneer();

    Optional<auctioneerEntity> getAuctioneerById(int id) throws userNotFoundException;

    void deleteAuctioneer(int id) throws userNotFoundException;
}
