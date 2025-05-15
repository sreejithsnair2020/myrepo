package collectionexample;

import java.util.HashSet;
import java.util.Set;

public class SetProgram 
{

	public static void main(String[] args) 
	{
Set<String>obj= new HashSet<String>();
obj.add("bike");
obj.add("car");
obj.add("truck");
System.out.println(obj);

Set<String>obj2= new HashSet<String>();
obj2.add("bus");
obj2.add("train");
obj2.add("ship");
System.out.println(obj2);
System.out.println(obj.addAll(obj2));
System.out.println(obj);
System.out.println(obj.containsAll(obj2));
System.out.println(obj.remove("bike"));
System.out.println(obj);
System.out.println(obj.isEmpty());
System.out.println(obj.size());
obj.clear();
System.out.println(obj);
	}

	}


