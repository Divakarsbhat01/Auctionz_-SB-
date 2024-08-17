package com.Auctionz.Auctionz.Controller;

import com.Auctionz.Auctionz.Schemas.auctioneerInput;
import com.Auctionz.Auctionz.Service.auctioneerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import java.util.HashMap;

@RestController
public class auctioneerController
{
    @Autowired
    auctioneerDetailsService auctioneerDetailsServiceObj;

    @PostMapping("/create_auctioneer")
    public ResponseEntity<HashMap<String,String>> create_auctioneer(@RequestBody auctioneerInput auctioneerInputObj)
    {
        auctioneerDetailsServiceObj.insertNewAuctioneer(auctioneerInputObj);
        HashMap<String,String>ab=new HashMap<>();
        ab.put("Message","Success");
        return ResponseEntity.status(HttpStatus.CREATED).body(ab);
    }
}
