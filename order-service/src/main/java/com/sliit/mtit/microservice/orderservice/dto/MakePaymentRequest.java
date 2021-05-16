package com.sliit.mtit.microservice.orderservice.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class MakePaymentRequest {
	
private String cardNo;
	
	private String cardType;
	
	private BigDecimal amount;
	
	private Long qty;

}
