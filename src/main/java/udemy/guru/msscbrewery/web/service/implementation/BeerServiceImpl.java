package udemy.guru.msscbrewery.web.service.implementation;

import java.util.UUID;

import org.springframework.stereotype.Service;

import udemy.guru.msscbrewery.web.model.BeerDto;
import udemy.guru.msscbrewery.web.service.BeerService;

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder()
				.id(UUID.randomUUID())
				.beerName("Galaxy Cat")
				.beerStyle("Pale Ale")
				.build();
	}

}
