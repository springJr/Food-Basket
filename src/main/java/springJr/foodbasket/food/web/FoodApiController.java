package springJr.foodbasket.food.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import springJr.foodbasket.food.domain.FoodService;
import springJr.foodbasket.food.domain.model.Food;
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
		return foodService.findVegetables();

	}
}
