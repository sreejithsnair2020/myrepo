package stringexample;

public class BufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb=new StringBuffer("hello");
System.out.println(sb);
StringBuilder ss=new StringBuilder("world");
System.out.println(ss);
//append-merge strings
System.out.println(sb.append(ss));
//insert-value inserted by index value
System.out.println(sb.insert(4, "wheel"));
//replace-to replace a value
System.out.println(sb.replace(1, 4, "hai"));
//delete-to delete
System.out.println(ss.delete(2, 4));
	}

}
