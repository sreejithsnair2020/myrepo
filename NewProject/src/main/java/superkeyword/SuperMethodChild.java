package superkeyword;

public class SuperMethodChild extends SuperMethodParent {
	public void child()

	{
		super.display();
		super.sum(5, 5);
		this.show();
		System.out.println("This is child class");
	}
public void show()
{
	System.out.println("show");
}
	public static void main(String[] args) {
		SuperMethodChild obj=new SuperMethodChild();
		obj.child();
		//obj.display();
		// TODO Auto-generated method stub

	}

}
