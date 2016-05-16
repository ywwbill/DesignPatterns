package yang.weiwei.behavioral.visitor.computer_part;

import yang.weiwei.behavioral.visitor.ComputerPartVisitor;

public class Computer implements ComputerPart
{
	ComputerPart parts[];
	
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor)
	{
		for (int i=0; i<parts.length; i++)
		{
			parts[i].accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}
	
	public Computer()
	{
		parts=new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
	}
}
