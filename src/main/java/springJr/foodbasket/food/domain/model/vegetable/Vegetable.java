package springJr.foodbasket.food.domain.model.vegetable;

import java.time.LocalDateTime;

import javax.persistence.Entity;

import lombok.Builder;
import lombok.NoArgsConstructor;
import springJr.foodbasket.food.domain.model.Food;
import springJr.foodbasket.food.domain.model.StoreLocation;

@NoArgsConstructor
@Entity
public class Vegetable extends Food {

	@Builder
	public Vegetable(String name, LocalDateTime storeAt,
		StoreLocation storeLocation, int quantity) {
		super.name = name;
		super.storeAt = storeAt;
		super.storeLocation = storeLocation;
		super.quantity = quantity;
	}
}
