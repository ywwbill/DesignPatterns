package yang.weiwei.creational.builder.item;

import yang.weiwei.creational.builder.packing.Packing;
import yang.weiwei.creational.builder.packing.Wrapper;

public abstract class Burger implements Item
{
	@Override
	public Packing packing()
	{
		return new Wrapper();
	}

	@Override
	public abstract float price();
	
	@Override
	public String toString()
	{
		return "Item: "+name()+", Packing: "+packing().pack()+", Price: "+price();
	}
}
