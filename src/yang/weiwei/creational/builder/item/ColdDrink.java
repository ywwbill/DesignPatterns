package yang.weiwei.creational.builder.item;

import yang.weiwei.creational.builder.packing.Bottle;
import yang.weiwei.creational.builder.packing.Packing;

public abstract class ColdDrink implements Item
{
	@Override
	public Packing packing()
	{
		return new Bottle();
	}

	@Override
	public abstract float price();
	
	@Override
	public String toString()
	{
		return "Item: "+name()+", Packing: "+packing().pack()+", Price: "+price();
	}
}
