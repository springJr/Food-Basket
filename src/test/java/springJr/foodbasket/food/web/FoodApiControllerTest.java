package springJr.foodbasket.food.web;

import static org.assertj.core.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import springJr.foodbasket.food.domain.model.Food;
import springJr.foodbasket.food.domain.model.StoreLocation;
import springJr.foodbasket.food.domain.model.dairy.DairyProduct;
import springJr.foodbasket.food.domain.model.dairy.FoodStatus;
import springJr.foodbasket.food.domain.model.meat.Meat;
import springJr.foodbasket.food.domain.model.meat.MeatType;
import springJr.foodbasket.food.domain.model.vegetable.Vegetable;

class FoodApiControllerTest extends WebTest {

	private final LocalDateTime today = LocalDateTime.now();

	@Test
	public void 전체_조회() {
		//given
		Vegetable carrot = new Vegetable().builder()
			.name("당근")
			.storeAt(today)
			.storeLocation(StoreLocation.CHILL)
			.quantity(3)
			.build();

		Meat porkBelly = new Meat().builder()
			.name("삼겹살")
			.storeAt(today)
			.storeLocation(StoreLocation.CHILL)
			.quantity(1)
			.gram(300)
			.meatType(MeatType.PORK)
			.build();

		String url = "http://localhost:" + port + "/foodbasket/foods";

		//when
		foodRepository.save(carrot);
		foodRepository.save(porkBelly);
		Food[] response = restTemplate.getForObject(url, Food[].class);
		List<Food> foods = Arrays.asList(response);

		//then
		assertThat(foods.size()).isEqualTo(2);
	}

	@Test
	public void 선택_조회_채소() {
		//given
		String vegetableName = "당근";
		Vegetable carrot = new Vegetable().builder()
			.name(vegetableName)
			.storeAt(today)
			.storeLocation(StoreLocation.CHILL)
			.quantity(3)
			.build();

		Meat porkBelly = new Meat().builder()
			.name("삼겹살")
			.storeAt(today)
			.storeLocation(StoreLocation.CHILL)
			.quantity(1)
			.gram(300)
			.meatType(MeatType.PORK)
			.build();
		String url = "http://localhost:" + port + "/foodbasket/foods/vegetable";

		//when
		foodRepository.save(carrot);
		foodRepository.save(porkBelly);
		Vegetable[] response = restTemplate.getForObject(url, Vegetable[].class);
		List<Vegetable> vegetables = Arrays.asList(response);

		//then
		assertThat(vegetables.size()).isEqualTo(1);
		assertThat(vegetables.get(0).getName()).isEqualTo(vegetableName);
		assertThat(vegetables.get(0)).isInstanceOf(Vegetable.class);
	}

	@Test
	public void 선택_조회_유제품() {
		//given
		Vegetable carrot = new Vegetable().builder()
			.name("당근")
			.storeAt(today)
			.storeLocation(StoreLocation.CHILL)
			.quantity(3)
			.build();

		String dairyName = "바나나 우유";
		DairyProduct bananaMilk = new DairyProduct().builder()
			.name(dairyName)
			.storeAt(today)
			.storeLocation(StoreLocation.CHILL)
			.quantity(3)
			.expireAt(today)
			.foodStatus(FoodStatus.NONE)
			.build();
		String url = "http://localhost:" + port + "/foodbasket/foods/dairy";

		//when
		foodRepository.save(carrot);
		foodRepository.save(bananaMilk);
		DairyProduct[] response = restTemplate.getForObject(url, DairyProduct[].class);
		List<DairyProduct> dairyProducts = Arrays.asList(response);

		//then
		assertThat(dairyProducts.size()).isEqualTo(1);
		assertThat(dairyProducts.get(0).getName()).isEqualTo(dairyName);
		assertThat(dairyProducts.get(0)).isInstanceOf(DairyProduct.class);
	}

}