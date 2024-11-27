package com.restaurant.restaurantlisting.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RestaurantDTO {
	private long id;
	private String name;
	private String address;
	private String city;
	private String description;
}
