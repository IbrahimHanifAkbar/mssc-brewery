package udemy.guru.msscbrewery.web.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;
import udemy.guru.msscbrewery.web.model.BeerDto;
import udemy.guru.msscbrewery.web.service.BeerService;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
	
	private BeerService beerService;

	public BeerController(BeerService beerService) {
		super();
		this.beerService = beerService;
	}


	@GetMapping("/test")
	public ResponseEntity<BeerDto> test(){
		return new ResponseEntity<>(beerService.getBeerById(null), HttpStatus.OK);
	}
	
	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){
		return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
	}

}
