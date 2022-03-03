package springJr.foodbasket.food.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import springJr.foodbasket.food.domain.FoodService;
import springJr.foodbasket.food.domain.model.Food;
import springJr.foodbasket.food.domain.model.dairy.DairyProduct;
import springJr.foodbasket.food.domain.model.fish.Fish;
import springJr.foodbasket.food.domain.model.fruit.Fruit;
import springJr.foodbasket.food.domain.model.meat.Meat;
import springJr.foodbasket.food.domain.model.vegetable.Vegetable;

@Slf4j
@RestController
@RequestMapping("/foodbasket")
@RequiredArgsConstructor
public class FoodApiController {

	private final FoodService foodService;

	@GetMapping("/foods")
	public List<Food> allFoods() {
		return foodService.getAll();
	}

	@GetMapping("/foods/vegetable")
	public List<Vegetable> getVegetable() {
		return foodService.getVegetables();
	}

	@GetMapping("/foods/dairy")
	public List<DairyProduct> getDairyProduct() {
		return foodService.getDairyProducts();
	}

	@GetMapping("/foods/meat")
	public List<Meat> getMeat() {
		return foodService.getMeats();
	}

	@GetMapping("/foods/fruit")
	public List<Fruit> getFruit() {
		return foodService.getFruit();
	}

	@GetMapping("/foods/fish")
	public List<Fish> getFish() {
		return foodService.getFish();
	}
}
