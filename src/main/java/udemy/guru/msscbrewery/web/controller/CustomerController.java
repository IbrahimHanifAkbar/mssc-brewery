package udemy.guru.msscbrewery.web.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import udemy.guru.msscbrewery.web.model.CustomerDto;
import udemy.guru.msscbrewery.web.service.CustomerService;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {
	
	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping("/{customerId}")
	public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId){
		return new ResponseEntity<CustomerDto>(customerService.getCustomerByID(customerId), HttpStatus.OK);
	}
	
	
	
	

}
