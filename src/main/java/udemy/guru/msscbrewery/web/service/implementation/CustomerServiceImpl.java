package udemy.guru.msscbrewery.web.service.implementation;

import java.util.UUID;

import org.springframework.stereotype.Service;

import udemy.guru.msscbrewery.web.model.CustomerDto;
import udemy.guru.msscbrewery.web.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerByID(UUID customerId) {
			return CustomerDto.builder()
					.id(UUID.randomUUID())
					.name("Ibrahim")
					.build();
	}

}
