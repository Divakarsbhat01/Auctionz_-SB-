package com.Auctionz.Auctionz.Controller;

import com.Auctionz.Auctionz.Entity.auctioneerEntity;
import com.Auctionz.Auctionz.Entity.bidderEntity;
import com.Auctionz.Auctionz.Schemas.auctioneerInput;
import com.Auctionz.Auctionz.Schemas.bidderInput;
import com.Auctionz.Auctionz.Service.bidderDetailsService;
import com.Auctionz.Auctionz.errorContol.exceptions.userNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
public class bidderController
{
    @Autowired
    bidderDetailsService bidderDetailsServiceObj;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/create_bidder")
    public ResponseEntity<HashMap<String,String>> create_auctioneer(@RequestBody bidderInput bidderInputObj)
    {
        int x=bidderDetailsServiceObj.insertNewBidder(bidderInputObj);
        HashMap<String,String>ab=new HashMap<>();
        ab.put("Message","Success");
        ab.put("Id", String.valueOf(x));
        return ResponseEntity.status(HttpStatus.CREATED).body(ab);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/update_bidder/{id}")
    public ResponseEntity<HashMap<String,String>> update_auctioneer(@PathVariable ("id") int id,@RequestBody auctioneerInput auctioneerInputObj) throws userNotFoundException {
        bidderDetailsServiceObj.updateNewBidder(id,auctioneerInputObj);
        HashMap<String,String>ab=new HashMap<>();
        ab.put("Message","Success");
        return ResponseEntity.status(HttpStatus.CREATED).body(ab);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getAll_bidder")
    public List<auctioneerEntity> getALl_auctioneer()
    {
        return (List<auctioneerEntity>) bidderDetailsServiceObj.getAllBidder();
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getAll_bidder/{id}")
    public Optional<bidderEntity> getId_auctioneer(@PathVariable ("id") int id) throws userNotFoundException {
        return bidderDetailsServiceObj.getBidderById(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/delete_bidder/{id}")
    public ResponseEntity<HashMap<String,String>> delete_auctioneer(@PathVariable ("id") int id) throws userNotFoundException {
        bidderDetailsServiceObj.deleteBidder(id);
        HashMap<String,String>ab=new HashMap<>();
        ab.put("Message","Success");
        return ResponseEntity.status(HttpStatus.OK).body(ab);
    }
}
