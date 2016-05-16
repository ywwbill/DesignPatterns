package yang.weiwei.creational.builder;

import yang.weiwei.creational.builder.item.ChickenBurger;
import yang.weiwei.creational.builder.item.Coke;
import yang.weiwei.creational.builder.item.Pepsi;
import yang.weiwei.creational.builder.item.VegBurger;

public class MealBuilder
{
	public Meal prepareVegMeal()
	{
		Meal meal=new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal()
	{
		Meal meal=new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
