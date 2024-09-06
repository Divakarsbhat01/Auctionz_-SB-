package com.Auctionz.Auctionz.Controller;

import com.Auctionz.Auctionz.Entity.auctioneerEntity;
import com.Auctionz.Auctionz.Schemas.auctioneerInput;
import com.Auctionz.Auctionz.Service.auctioneerDetailsService;
import com.Auctionz.Auctionz.errorContol.exceptions.userNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
public class auctioneerController
{
    @Autowired
    auctioneerDetailsService auctioneerDetailsServiceObj;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/create_auctioneer")
    public ResponseEntity<HashMap<String,String>> create_auctioneer(@RequestBody auctioneerInput auctioneerInputObj)
    {
        int x=auctioneerDetailsServiceObj.insertNewAuctioneer(auctioneerInputObj);
        HashMap<String,String>ab=new HashMap<>();
        ab.put("Message","Success");
        ab.put("Id", String.valueOf(x));
        return ResponseEntity.status(HttpStatus.CREATED).body(ab);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/update_auctioneer/{id}")
    public ResponseEntity<HashMap<String,String>> update_auctioneer(@PathVariable ("id") int id,@RequestBody auctioneerInput auctioneerInputObj) throws userNotFoundException {
        auctioneerDetailsServiceObj.updateNewAuctioneer(id,auctioneerInputObj);
        HashMap<String,String>ab=new HashMap<>();
        ab.put("Message","Success");
        return ResponseEntity.status(HttpStatus.CREATED).body(ab);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getAll_auctioneer")
    public List<auctioneerEntity> getALl_auctioneer()
    {
        return (List<auctioneerEntity>) auctioneerDetailsServiceObj.getAllAuctioneer();
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getAll_auctioneer/{id}")
    public Optional<auctioneerEntity> getId_auctioneer(@PathVariable ("id") int id) throws userNotFoundException {
        return auctioneerDetailsServiceObj.getAuctioneerById(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/delete_auctioneer/{id}")
    public ResponseEntity<HashMap<String,String>> delete_auctioneer(@PathVariable ("id") int id) throws userNotFoundException {
        auctioneerDetailsServiceObj.deleteAuctioneer(id);
        HashMap<String,String>ab=new HashMap<>();
        ab.put("Message","Success");
        return ResponseEntity.status(HttpStatus.OK).body(ab);
    }
}
