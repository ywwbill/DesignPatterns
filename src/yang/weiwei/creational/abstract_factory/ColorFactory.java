package yang.weiwei.creational.abstract_factory;

import yang.weiwei.creational.abstract_factory.color.Blue;
import yang.weiwei.creational.abstract_factory.color.Color;
import yang.weiwei.creational.abstract_factory.color.Green;
import yang.weiwei.creational.abstract_factory.color.Red;
import yang.weiwei.creational.abstract_factory.shape.Shape;

public class ColorFactory extends AbstractFactory
{
	@Override
	public Color getColor(String color)
	{
		if (color==null) return null;
		if (color.equalsIgnoreCase("RED")) return new Red();
		if (color.equalsIgnoreCase("GREEN")) return new Green();
		if (color.equalsIgnoreCase("BLUE")) return new Blue();
		return null;
	}

	@Override
	Shape getShape(String shape)
	{
		return null;
	}
}
