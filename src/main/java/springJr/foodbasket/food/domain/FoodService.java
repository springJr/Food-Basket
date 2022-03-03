package springJr.foodbasket.food.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import springJr.foodbasket.food.domain.model.Food;
import springJr.foodbasket.food.domain.model.dairy.DairyProduct;
import springJr.foodbasket.food.domain.model.fish.Fish;
import springJr.foodbasket.food.domain.model.fruit.Fruit;
import springJr.foodbasket.food.domain.model.meat.Meat;
import springJr.foodbasket.food.domain.model.vegetable.Vegetable;
import springJr.foodbasket.food.repository.FoodRepository;

@Slf4j
@RequiredArgsConstructor
@Service
public class FoodService {

	private final FoodRepository foodRepository;
	
	public List<Food> getAll() {
		List<Food> allFoods = foodRepository.findAll();
		return allFoods;
	}

	public List<Vegetable> getVegetables() {
		List<Vegetable> vegetables = new ArrayList<>();

		List<Food> foods = foodRepository.findVegetable();
		for (Food food : foods) {
			vegetables.add((Vegetable)food);
		}
		return vegetables;
	}

	public List<Meat> getMeats() {
		List<Meat> meats = new ArrayList<>();

		List<Food> foods = foodRepository.findMeats();
		for (Food food : foods) {
			meats.add((Meat)food);
		}
		return meats;
	}

	public List<Fruit> getFruit() {
		List<Fruit> fruits = new ArrayList<>();

		List<Food> foods = foodRepository.findFruits();
		for (Food food : foods) {
			fruits.add((Fruit)food);
		}
		return fruits;
	}

	public List<Fish> getFish() {
		List<Fish> fish = new ArrayList<>();

		List<Food> foods = foodRepository.findFish();
		for (Food food : foods) {
			fish.add((Fish)food);
		}
		return fish;
	}

	public List<DairyProduct> getDairyProducts() {
		List<DairyProduct> dairyProducts = new ArrayList<>();

		List<Food> foods = foodRepository.findDairyProduct();
		for (Food food : foods) {
			dairyProducts.add((DairyProduct)food);
		}
		return dairyProducts;
	}
}
