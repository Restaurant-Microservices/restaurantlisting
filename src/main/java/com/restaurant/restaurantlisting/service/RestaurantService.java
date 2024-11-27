package com.restaurant.restaurantlisting.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.restaurant.restaurantlisting.dto.RestaurantDTO;
import com.restaurant.restaurantlisting.entity.Restaurant;
import com.restaurant.restaurantlisting.mapper.RestaurantMapper;
import com.restaurant.restaurantlisting.repo.RestaurantRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RestaurantService {

	@NonNull
	private final RestaurantRepo restaurantRepo;
	
	public List<RestaurantDTO> fetchAllRestaurants(){
		List<Restaurant> restaurants= restaurantRepo.findAll();
		return restaurants.stream().map(restaurant -> RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(restaurant)).collect(Collectors.toList());
	}
}
