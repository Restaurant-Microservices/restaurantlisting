package com.restaurant.restaurantlisting.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantDTO {
	private long id;
	@NotNull(message = "Name should not be empty!")
	private String name;
	private String address;
	private String city;
	private String description;
}
