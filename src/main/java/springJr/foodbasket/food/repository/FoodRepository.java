package springJr.foodbasket.food.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import springJr.foodbasket.food.domain.model.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {

	@Query("SELECT f FROM Food f WHERE TYPE(f) = Vegetable")
	List<Food> findVegetable();

}
