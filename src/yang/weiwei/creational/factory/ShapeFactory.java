package yang.weiwei.creational.factory;

import yang.weiwei.creational.factory.shape.Circle;
import yang.weiwei.creational.factory.shape.Rectangle;
import yang.weiwei.creational.factory.shape.Shape;
import yang.weiwei.creational.factory.shape.Square;

public class ShapeFactory
{
	public Shape getShape(String shapeType)
	{
		if (shapeType==null) return null;
		if(shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();
		if(shapeType.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
		if(shapeType.equalsIgnoreCase("SQUARE")) return new Square();
		return null;
	}
}
