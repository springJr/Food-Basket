package springJr.foodbasket.food.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import springJr.foodbasket.food.domain.model.Food;
import springJr.foodbasket.food.domain.model.StoreLocation;
import springJr.foodbasket.food.domain.model.dairy.DairyProduct;
import springJr.foodbasket.food.domain.model.dairy.FoodStatus;
import springJr.foodbasket.food.domain.model.fish.Fish;
import springJr.foodbasket.food.domain.model.fruit.Fruit;
import springJr.foodbasket.food.domain.model.fruit.QuantityUnit;
import springJr.foodbasket.food.domain.model.meat.Meat;
import springJr.foodbasket.food.domain.model.meat.MeatType;
import springJr.foodbasket.food.domain.model.vegetable.Vegetable;

public class FoodTestDB {

	/**
	 * @return
	 * List of Foods
	 */

	private static LocalDateTime today = LocalDateTime.now();

	public static List<Food> getTestDB() {
		List<Food> foodTestDB = new ArrayList<>();
		foodTestDB.add(vegetable1());
		foodTestDB.add(vegetable2());
		foodTestDB.add(meat1());
		foodTestDB.add(meat2());
		foodTestDB.add(meat3());
		foodTestDB.add(fish1());
		foodTestDB.add(dairyProduct1());
		foodTestDB.add(dairyProduct2());
		foodTestDB.add(fruit1());
		foodTestDB.add(fruit2());

		return foodTestDB;
	}

	private static Food vegetable1() {
		return new Vegetable().builder()
			.name("당근")
			.storeAt(today)
			.storeLocation(StoreLocation.CHILL)
			.quantity(3)
			.build();
	}

	private static Food vegetable2() {
		return new Vegetable().builder()
			.name("양파")
			.storeAt(today)
			.storeLocation(StoreLocation.CHILL)
			.quantity(8)
			.build();
	}

	private static Food meat1() {
		return new Meat().builder()
			.name("삼겹살")
			.storeAt(today)
			.storeLocation(StoreLocation.CHILL)
			.quantity(1)
			.gram(300)
			.meatType(MeatType.PORK)
			.build();
	}

	private static Food meat2() {
		return new Meat().builder()
			.name("등심")
			.storeAt(today)
			.storeLocation(StoreLocation.CHILL)
			.quantity(1)
			.gram(100)
			.meatType(MeatType.BEEF)
			.build();
	}

	private static Food meat3() {
		return new Meat().builder()
			.name("LA갈비")
			.storeAt(today)
			.storeLocation(StoreLocation.FREEZER)
			.quantity(3)
			.gram(100)
			.meatType(MeatType.BEEF)
			.build();
	}

	private static Food dairyProduct1() {
		return new DairyProduct().builder()
			.name("바나나 우유")
			.storeAt(today)
			.storeLocation(StoreLocation.CHILL)
			.quantity(3)
			.expireAt(today.plusDays(3))
			.foodStatus(FoodStatus.NONE)
			.build();
	}

	private static Food dairyProduct2() {
		return new DairyProduct().builder()
			.name("요거트")
			.storeAt(today)
			.storeLocation(StoreLocation.CHILL)
			.quantity(6)
			.expireAt(today.plusDays(1))
			.foodStatus(FoodStatus.WARN)
			.build();
	}

	private static Food fish1() {
		return new
			Fish().builder()
			.name("고등어")
			.storeAt(today)
			.storeLocation(StoreLocation.CHILL)
			.quantity(2)
			.build();
	}

	private static Food fruit1() {
		return new Fruit().builder()
			.name("사과")
			.storeAt(today)
			.storeLocation(StoreLocation.CHILL)
			.quantity(2)
			.quantityUnit(QuantityUnit.COUNTABLE)
			.build();
	}

	private static Food fruit2() {
		return new Fruit().builder()
			.name("딸기")
			.storeAt(today)
			.storeLocation(StoreLocation.CHILL)
			.quantity(2)
			.quantityUnit(QuantityUnit.GRAM)
			.build();
	}



}
