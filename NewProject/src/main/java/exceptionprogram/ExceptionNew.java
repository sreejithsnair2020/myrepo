package exceptionprogram;

public class ExceptionNew {

	public static void main(String[] args) 
	{
int a=10;
int b=0;
try
{ 
	int c=a/b;
}
catch(ArithmeticException ae)
{
	System.out.println("ExceptionHandled");
}
finally
{
	System.out.println("Exitcode");
}

//System.out.println(c);

	//}



//int a[]= {1,2,3,4};
//for(int i=0;i<=4;i++)
//{
		//System.out.println(a[i]);
//}


//String s=null;
	//System.out.println(s.length());
}
}
