package inheritancefile;

public class SuperParent {
	public SuperParent(int a,int b)
	{
		System.out.println("This is parentclass");
		int c=a+b;
		System.out.println(c);
	}
public SuperParent(int a,int b, int c)
{
	int d=a+b+c;
	System.out.println(d);
}
}
