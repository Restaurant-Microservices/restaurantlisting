package com.restaurant.restaurantlisting.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.restaurantlisting.dto.RestaurantDTO;
import com.restaurant.restaurantlisting.service.RestaurantService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/restaurant")
@RequiredArgsConstructor
@Validated
public class RestaurantController {
	
	@NonNull
	private final RestaurantService restaurantService;
	
	@GetMapping("/fetchAllRestaurants")
	public ResponseEntity<List<RestaurantDTO>> fetchAllRestaurants(){
		List<RestaurantDTO> allRestaurants = restaurantService.fetchAllRestaurants();
		return new ResponseEntity<>(allRestaurants, HttpStatus.OK);
	}
	
	@GetMapping("/fetchRestaurantById/{restaurantId}")
	public ResponseEntity<RestaurantDTO> fetchRestaurantById(@PathVariable Integer restaurantId){
		RestaurantDTO allRestaurants = restaurantService.fetchRestaurantById(restaurantId);
		return new ResponseEntity<>(allRestaurants, HttpStatus.OK);
	}
	
	@PostMapping("/addRestaurant")
	public ResponseEntity<RestaurantDTO> saveRestaurant(@Valid @RequestBody RestaurantDTO restaurantDTO){
		RestaurantDTO restaurantAdded = restaurantService.addRestaurantInDB(restaurantDTO);
		return new ResponseEntity<>(restaurantAdded, HttpStatus.CREATED);
	}

}
