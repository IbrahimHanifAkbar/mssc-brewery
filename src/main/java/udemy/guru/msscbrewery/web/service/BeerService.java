package udemy.guru.msscbrewery.web.service;

import java.util.UUID;

import udemy.guru.msscbrewery.web.model.BeerDto;

public interface BeerService {

	BeerDto getBeerById(UUID beerId);

}
