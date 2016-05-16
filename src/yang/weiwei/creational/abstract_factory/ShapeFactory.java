package yang.weiwei.creational.abstract_factory;

import yang.weiwei.creational.abstract_factory.color.Color;
import yang.weiwei.creational.abstract_factory.shape.Circle;
import yang.weiwei.creational.abstract_factory.shape.Rectangle;
import yang.weiwei.creational.abstract_factory.shape.Shape;
import yang.weiwei.creational.abstract_factory.shape.Square;

public class ShapeFactory extends AbstractFactory
{
	@Override
	Color getColor(String color)
	{
		return null;
	}

	@Override
	public Shape getShape(String shape)
	{
		if (shape==null) return null;
		if(shape.equalsIgnoreCase("CIRCLE")) return new Circle();
		if(shape.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
		if(shape.equalsIgnoreCase("SQUARE")) return new Square();
		return null;
	}
}
