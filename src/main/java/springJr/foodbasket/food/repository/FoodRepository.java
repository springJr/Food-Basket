package springJr.foodbasket.food.repository;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springJr.foodbasket.food.domain.FoodTestDB;
import springJr.foodbasket.food.domain.model.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {


}
