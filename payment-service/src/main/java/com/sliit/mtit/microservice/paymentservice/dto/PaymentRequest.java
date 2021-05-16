package com.sliit.mtit.microservice.paymentservice.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class PaymentRequest {
	
	private String cardNo;
	
	private String cardType;
	
	private BigDecimal amount;
	
	private Long qty;

}
