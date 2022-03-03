package springJr.foodbasket.food.domain.model.meat;

import java.time.LocalDateTime;

import javax.persistence.Column;
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
@DiscriminatorValue("meat")
@Entity
public class Meat extends Food {

	@Column(nullable = false)
	private int gram;

	@Enumerated(EnumType.STRING)
	private MeatType meatType;

	@Builder
	public Meat(String name, LocalDateTime storeAt,
		StoreLocation storeLocation, int quantity, int gram, MeatType meatType) {
		super.name = name;
		super.storeAt = storeAt;
		super.storeLocation = storeLocation;
		super.quantity = quantity;

		this.gram = gram;
		this.meatType = meatType;
	}
}
