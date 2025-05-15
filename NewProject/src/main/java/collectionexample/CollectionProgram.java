package collectionexample;

import java.util.ArrayList;
import java.util.List;

public class CollectionProgram 
{

	public static void main(String[] args) 
	{

List <String> obj=new ArrayList();
obj.add("green");
obj.add("blue");
obj.add("red");

	System.out.println(obj);
	System.out.println(obj.set(2, "yellow"));
	System.out.println(obj.set(1, "yellow"));
	System.out.println(obj);
	System.out.println(obj.indexOf("yellow"));
	System.out.println(obj.lastIndexOf("yellow"));
	System.out.println(obj.contains("orange"));
	System.out.println(obj.contains("red"));
	System.out.println(obj.isEmpty());
	System.out.println(obj.get(1));
	System.out.println(obj.remove(1));
	System.out.println(obj);
	System.out.println(obj.size());
	for(int i=0;i<obj.size();i++)
	{
		System.out.println(obj.get(i));
	}
	for(String cl:obj)
	{
		System.out.println(cl);
	}
	}
}
//indexOf-
//lastIndexOf
	//contains
	//isEmpty
	//get- to get the particular elements using index
	//size-to get size of array

