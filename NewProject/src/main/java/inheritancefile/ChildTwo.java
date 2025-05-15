package inheritancefile;

public class ChildTwo extends ParentOne{
	public void printdetailstwo()
	{
		System.out.println("This is child two");
	}

	public static void main(String[] args) {
		ChildTwo obj=new ChildTwo();
		obj.printdetailstwo();
		obj.parentinfo();

	}

}
