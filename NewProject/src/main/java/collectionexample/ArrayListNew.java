package collectionexample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListNew 
{

	public static void main(String[] args) 
	{
ArrayList <String> obj= new ArrayList <String>();
obj.add("red");
obj.add("green");
obj.add("black");
System.out.println(obj);

ArrayList <String> obj2= new ArrayList <String>();
obj2.add("car");
obj2.add("bike");
obj2.add("motorcycle");
System.out.println(obj2);
System.out.println(obj.addAll(obj2));
System.out.println(obj);
System.out.println(obj.containsAll(obj2));
Iterator<String>i =obj.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}
i.remove();
	System.out.println(obj);


	}

}
//addAll()-combine two collection
//conmtainAll()