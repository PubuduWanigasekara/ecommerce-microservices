package com.sliit.mtit.microservice.paymentservice.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class PaymentResponse {
	
	private String paymentId;
	
	private Date paymentDate;
	
	private BigDecimal total;
	
	private String status;

}
