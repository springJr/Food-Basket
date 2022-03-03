package springJr.foodbasket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springJr.foodbasket.food.domain.model.Food;
import springJr.foodbasket.food.domain.model.meat.Meat;

@SpringBootApplication
public class FoodbasketApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodbasketApplication.class, args);

	}

}
