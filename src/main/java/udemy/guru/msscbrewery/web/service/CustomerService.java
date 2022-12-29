package udemy.guru.msscbrewery.web.service;

import java.util.UUID;

import udemy.guru.msscbrewery.web.model.CustomerDto;

public interface CustomerService {

	 public CustomerDto getCustomerByID(UUID customerId);

}
