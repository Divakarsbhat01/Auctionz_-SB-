package com.Auctionz.Auctionz.Controller;

import com.Auctionz.Auctionz.Schemas.auctioneerInput;
import com.Auctionz.Auctionz.Schemas.bidderInput;
import com.Auctionz.Auctionz.Service.auctioneerDetailsService;
import com.Auctionz.Auctionz.Service.bidderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class bidderController
{
    @Autowired
    bidderDetailsService bidderDetailsServiceObj;

    @PostMapping("/create_bidder")
    public ResponseEntity<HashMap<String,String>> create_auctioneer(@RequestBody bidderInput bidderInputObj)
    {
        bidderDetailsServiceObj.insertNewBidder(bidderInputObj);
        HashMap<String,String>ab=new HashMap<>();
        ab.put("Message","Success");
        return ResponseEntity.status(HttpStatus.CREATED).body(ab);
    }
}
