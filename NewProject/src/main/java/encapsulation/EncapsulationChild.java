package encapsulation;

public class EncapsulationChild
{

	public static void main(String[] args)
	{
	EncapsulationParent obj=new EncapsulationParent();
	obj.setage(25);
    int a=obj.getage();
    System.out.println(a);
    obj.setmark(30);
    System.out.println(obj.getmark());

	}

}
