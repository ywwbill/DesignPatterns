package yang.weiwei.creational.builder.item;

import yang.weiwei.creational.builder.packing.Packing;

public interface Item
{
	public String name();
	public Packing packing();
	public float price();
	public String toString();
}
