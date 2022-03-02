package springJr.foodbasket.food.domain;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import springJr.foodbasket.food.repository.FoodRepository;

@RequiredArgsConstructor
@Service
public class FoodService {

	private FoodRepository foodRepository;


}
