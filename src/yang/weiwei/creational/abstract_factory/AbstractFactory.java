package yang.weiwei.creational.abstract_factory;

import yang.weiwei.creational.abstract_factory.color.Color;
import yang.weiwei.creational.abstract_factory.shape.Shape;

public abstract class AbstractFactory
{
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);
}
