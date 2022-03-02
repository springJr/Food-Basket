package springJr.foodbasket.food.domain.model.fruit;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Getter;
import springJr.foodbasket.food.domain.model.Food;

@Getter
@Entity
public class Fruit extends Food {

	@Enumerated(EnumType.STRING)
	private QuantityUnit quantityUnit;
}
