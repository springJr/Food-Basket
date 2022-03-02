package springJr.foodbasket.food.domain.model.dairy;

import java.time.LocalDateTime;

import javax.persistence.Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import springJr.foodbasket.food.domain.model.Food;
import springJr.foodbasket.food.domain.model.StoreLocation;

@NoArgsConstructor
@Getter
@Entity
public class DairyProduct extends Food {

	private LocalDateTime expireAt;
	private FoodStatus foodStatus;

	@Builder
	public DairyProduct(String name, LocalDateTime storeAt,
		StoreLocation storeLocation, int quantity, LocalDateTime expireAt, FoodStatus foodStatus) {
		super.name = name;
		super.storeAt = storeAt;
		super.storeLocation = storeLocation;
		super.quantity = quantity;

		this.expireAt = expireAt;
		this.foodStatus = foodStatus;
	}
}
