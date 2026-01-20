package com.generics.mealplan;

class HighProteinMeal implements MealPlan {

	// Returns meal type
	public String getMealType() {
		return "High-Protein";
	}

	// Returns calorie count
	public int getCalories() {
		return 2500;
	}
}