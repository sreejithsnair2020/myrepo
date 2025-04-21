package stringexample;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hell";
		System.out.println(a);
		String b=new String("Article");
		System.out.println(b);
		char c[]= {'A','B','C'};
		String d=new String(c);
		System.out.println(c);
		//length method:-to find length of string
		System.out.println(a.length());
		//concat()-to merge the method
		System.out.println(a.concat(b));
		//touppercase-to change uppercase
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		//equals-check whether two strings are same
		String f="java";
		String g="java";
		String h="Java";
		String i="selenium";
		System.out.println(f.equals(g));
		System.out.println(f.equals(h));
		System.out.println(h.equals(i));
		//equalsIgnoreCase-
		System.out.println(f.equalsIgnoreCase(h));
		//valuOf()-one type to another type conversion
		//isEmpty
		System.out.println(a.isEmpty());
		String k="";
		System.out.println(k.isEmpty());
		int v=10;
		String s="";
		String m=s.valueOf(v);
		System.out.println(m);
		int x=10;
		String z="";
		String y=String.valueOf(x);
		System.out.println(y);
		//contains()- to check whether character or word present in string
		String o="Have a nice day";
		System.out.println(o.contains("van"));
		String str="good evening";
		String q=new String("java");
		System.out.println(f==g);
		System.out.println(q==f);// there checks reference
		System.out.println(g.equals(q));
			}
		}
	
