package com.sliit.mtit.microservice.paymentservice.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sliit.mtit.microservice.paymentservice.dto.PaymentRequest;
import com.sliit.mtit.microservice.paymentservice.dto.PaymentResponse;

@RestController
@RequestMapping("/payment")
public class PaymentConroller {
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	public @ResponseBody PaymentResponse makePayment(@RequestBody PaymentRequest request) {
		
		System.out.println("Payment Details : " +  request); 
		
		BigDecimal qty = new BigDecimal(request.getQty());
		
		BigDecimal totalAmount = (request.getAmount()).multiply(qty);
		
		PaymentResponse paymentResponse = new PaymentResponse();
		paymentResponse.setPaymentId(UUID.randomUUID().toString());
		paymentResponse.setPaymentDate(new Date());
		paymentResponse.setTotal(totalAmount);
		paymentResponse.setStatus("Make payment successfully!!!!");
		
		return paymentResponse;  		
	}

}
