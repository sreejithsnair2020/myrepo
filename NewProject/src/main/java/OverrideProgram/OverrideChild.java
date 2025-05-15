package OverrideProgram;

public class OverrideChild extends OverrideParent {
	public void display(int a,int b)

	{
		super.display(5, 5);
		//super.student(10, 5);
		int c=a*b;
		System.out.println(c);
	}
	public static void main(String[] args) {
	OverrideChild obj=new OverrideChild();
			obj.display(4,4);
			obj.student(10, 7);
	}
	@Override
	public void student(int a, int b) {
		int c=a+b;
		System.out.println(c);
		// TODO Auto-generated method stub
		super.student(10,7);
	
	}

}
