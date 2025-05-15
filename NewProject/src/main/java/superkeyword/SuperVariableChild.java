package superkeyword;

public class SuperVariableChild extends SuperVariableParent {
	public void display()
	{
		System.out.println(super.color);
	}
	String color="Yellow";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SuperVariableChild obj=new SuperVariableChild();
System.out.println(obj.color);
obj.display();
	}

}
