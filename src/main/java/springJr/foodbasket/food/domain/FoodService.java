package springJr.foodbasket.food.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import springJr.foodbasket.food.domain.model.Food;
import springJr.foodbasket.food.domain.model.vegetable.Vegetable;
import springJr.foodbasket.food.repository.FoodRepository;

@Slf4j
@Transactional
@RequiredArgsConstructor
@Service
public class FoodService {

	private final FoodRepository foodRepository;
	
	public List<Food> getAll() {
		List<Food> allFoods = foodRepository.findAll();
		return allFoods;
	}

	public List<Vegetable> findVegetables() {
		List<Vegetable> vegetables = new ArrayList<>();

		List<Food> foods = foodRepository.findVegetable();
		for (Food food : foods) {
			vegetables.add((Vegetable)food);
		}
		return vegetables;
	}
}
