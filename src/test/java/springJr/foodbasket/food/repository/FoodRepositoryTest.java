package springJr.foodbasket.food.repository;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import springJr.foodbasket.food.domain.model.Food;
import springJr.foodbasket.food.domain.model.fruit.Fruit;
import springJr.foodbasket.food.domain.model.vegetable.Vegetable;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class FoodRepositoryTest {

	@Autowired
	private FoodRepository foodRepository;

	@AfterEach
	void clearData() {
		foodRepository.deleteAll();
	}

	@DisplayName("DataBase 저장 테스트")
	@Test
	public void save() {
		//given
		List<Food> testDB = FoodTestDB.getTestDB();

		//when
		foodRepository.saveAll(testDB);

		//then
		List<Food> all = foodRepository.findAll();
		Food carrot = all.get(0);

		assertThat(all.size()).isEqualTo(10);
		assertThat(carrot).isInstanceOf(Vegetable.class);
		assertThat(carrot.getName()).isEqualTo("당근");
	}

}