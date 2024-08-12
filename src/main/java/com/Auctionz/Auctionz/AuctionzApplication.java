package com.Auctionz.Auctionz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuctionzApplication
{
//@EnableMongoRepositories(basePackageClasses =productsAndBiddersRepository.class
	public static void main(String[] args)
	{
		SpringApplication.run(AuctionzApplication.class, args);
	}

}