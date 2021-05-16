package com.sliit.mtit.microservice.orderservice.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class OrderRequest {
	
	private String fullName;
	
	private String address;
	
	private Long phoneNo;
	
	private String email;
	
	private String cardNo;
	
	private String cardType;
	
	private BigDecimal amount;
	
	private Long qty;

}
