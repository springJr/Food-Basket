package springJr.foodbasket.food.domain.model.fish;

import java.time.LocalDateTime;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import springJr.foodbasket.food.domain.model.Food;
import springJr.foodbasket.food.domain.model.StoreLocation;

@NoArgsConstructor
@Getter
@DiscriminatorValue("fish")
@Entity
public class Fish extends Food {

	@Builder
	public Fish(String name, LocalDateTime storeAt,
		StoreLocation storeLocation, int quantity) {
		super.name = name;
		super.storeAt = storeAt;
		super.storeLocation = storeLocation;
		super.quantity = quantity;
	}
}
