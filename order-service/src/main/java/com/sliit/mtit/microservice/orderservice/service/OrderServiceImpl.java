package com.sliit.mtit.microservice.orderservice.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sliit.mtit.microservice.orderservice.dto.OrderRequest;
import com.sliit.mtit.microservice.orderservice.dto.OrderResponse;
import com.sliit.mtit.microservice.orderservice.dto.MakePaymentRequest;
import com.sliit.mtit.microservice.orderservice.dto.MakePaymentResponse;

@Service
public class OrderServiceImpl {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public OrderResponse makePayment(OrderRequest orderRequest) {
		
		MakePaymentRequest makePaymentRequest = new MakePaymentRequest(); 
		makePaymentRequest.setCardNo(orderRequest.getCardNo());
		makePaymentRequest.setCardType(orderRequest.getCardType());
		makePaymentRequest.setAmount(orderRequest.getAmount());
		makePaymentRequest.setQty(orderRequest.getQty());
		
		ResponseEntity<MakePaymentResponse> makePaymentResponse =  restTemplate.postForEntity("http://localhost:8080/payment", makePaymentRequest , MakePaymentResponse.class); 
		
		OrderResponse orderResponse = new OrderResponse();
		orderResponse.setCustomerId(UUID.randomUUID().toString());
		orderResponse.setPaymentId(makePaymentResponse.getBody().getPaymentId());
		orderResponse.setMessage("Create order successfully"); 
		
		return orderResponse;
		
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {  
		return builder.build();
	}

}
