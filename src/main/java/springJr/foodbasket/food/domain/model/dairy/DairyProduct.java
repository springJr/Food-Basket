package springJr.foodbasket.food.domain.model.dairy;

import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.Getter;
import springJr.foodbasket.food.domain.model.Food;

@Getter
@Entity
public class DairyProduct extends Food {

	private LocalDate expireAt;

	private FoodStatus foodStatus;
}
