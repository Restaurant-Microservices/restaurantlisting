package com.restaurant.restaurantlisting.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.restaurant.restaurantlisting.dto.RestaurantDTO;
import com.restaurant.restaurantlisting.entity.Restaurant;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RestaurantMapper {
	
	RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);
	
	Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO);
	RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant);

}
