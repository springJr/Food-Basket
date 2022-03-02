package springJr.foodbasket.food.domain.model.meat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Getter;
import springJr.foodbasket.food.domain.model.Food;

@Entity
public class Meat extends Food {

	@Column(nullable = false)
	private String partition;

	@Enumerated(EnumType.STRING)
	private MeatType meatType;

}
