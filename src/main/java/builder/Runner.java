package builder;

public class Runner {
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg meal:");
		vegMeal.showItems();
		System.out.println("Veg meal cost: " + vegMeal.getCost());
		
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("NonVeg meal:");
		nonVegMeal.showItems();
		System.out.println("NonVeg meal cost: " + nonVegMeal.getCost());
	}
}
