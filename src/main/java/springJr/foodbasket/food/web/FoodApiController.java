package springJr.foodbasket.food.web;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import springJr.foodbasket.food.domain.FoodService;

@Slf4j
@RestController
@RequestMapping("/food-basket")
@RequiredArgsConstructor
public class FoodApiController {

	private FoodService foodService;

}
