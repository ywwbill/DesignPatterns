package yang.weiwei.creational.builder;

public class BuilderDemo
{
	public static void main(String args[])
	{
		MealBuilder meanBuilder=new MealBuilder();
		
		Meal vegMeal=meanBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: "+vegMeal.getCost());
		
		Meal nonVegMeal=meanBuilder.prepareNonVegMeal();
		System.out.println("\nNon-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: "+nonVegMeal.getCost());
	}
}
