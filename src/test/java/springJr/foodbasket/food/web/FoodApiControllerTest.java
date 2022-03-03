package springJr.foodbasket.food.web;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import springJr.foodbasket.food.domain.model.Food;
import springJr.foodbasket.food.domain.model.vegetable.Vegetable;
import springJr.foodbasket.food.repository.FoodTestDB;

class FoodApiControllerTest extends WebTest {

	@Test
	public void 전체_조회() {
		//given
		List<Food> testDB = FoodTestDB.getTestDB();
		String url = "http://localhost:" + port + "/foodbasket/foods";

		//when
		foodRepository.saveAll(testDB);

		//when
		Food[] foods = restTemplate.getForObject(url, Food[].class);
		List<Food> list = Arrays.asList(foods);

		//then
		assertThat(list.size()).isEqualTo(10);
	}

	@Test
	public void 선택_조회() {
		//given
		List<Food> testDB = FoodTestDB.getTestDB();
		String url = "http://localhost:" + port + "/foodbasket/foods/vegetable";

		//when
		foodRepository.saveAll(testDB);

		//when
		Vegetable[] vegetables = restTemplate.getForObject(url, Vegetable[].class);
		List<Vegetable> list = Arrays.asList(vegetables);

		//then
		assertThat(list.size()).isEqualTo(2);
	}

}