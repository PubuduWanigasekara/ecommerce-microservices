package com.sliit.mtit.microservice.orderservice.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class MakePaymentResponse {
	
private String paymentId;
	
	private String customerId;
	
	private Date paymentDate;
	
	private BigDecimal total;
	
	private String status;

}
