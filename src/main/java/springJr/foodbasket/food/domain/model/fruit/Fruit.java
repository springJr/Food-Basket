package springJr.foodbasket.food.domain.model.fruit;

import java.time.LocalDateTime;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import springJr.foodbasket.food.domain.model.Food;
import springJr.foodbasket.food.domain.model.StoreLocation;

@NoArgsConstructor
@Getter
@DiscriminatorValue("fruit")
@Entity
public class Fruit extends Food {

	@Enumerated(EnumType.STRING)
	private QuantityUnit quantityUnit;

	@Builder
	public Fruit(String name, LocalDateTime storeAt,
		StoreLocation storeLocation, int quantity, QuantityUnit quantityUnit) {
		super.name = name;
		super.storeAt = storeAt;
		super.storeLocation = storeLocation;
		super.quantity = quantity;

		this.quantityUnit = quantityUnit;
	}
}
