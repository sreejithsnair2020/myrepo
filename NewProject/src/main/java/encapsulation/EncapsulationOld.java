package encapsulation;

public class EncapsulationOld 
{
	public static void main(String[] args)
	{
	EncapsulationNew obj=new EncapsulationNew();
	obj.setUsername("sreejith");
System.out.println(obj.getUsername());
obj.setPassword(123);
System.out.println(obj.getPassword());
}
}