package yang.weiwei.j2ee.composite_entity;

public class CompositeEntity
{
	private CoarsedGrainedObject cgo=new CoarsedGrainedObject();
	
	public void setData(String data1, String data2)
	{
		cgo.setData(data1, data2);
	}
	
	public String[] getData()
	{
		return cgo.getData();
	}
}
