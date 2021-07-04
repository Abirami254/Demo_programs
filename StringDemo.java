package hit.day13;

public class StringDemo {
	public static void main(String[] args) {
		String s="hello";
		String st=new String("hello");
		System.out.println(s.hashCode());
		System.out.println(st.hashCode());
		System.out.println(s==st);
		System.out.println(s.equals(st));
		
		String temp="hello new temp world"+s;
		System.out.println(temp);
		System.out.println(s);
		
		String mystore=s;
		
		s=s+"new value";
		System.out.println(s);
		
		System.out.println(mystore);	
		char c=s.charAt(2);
		System.out.println(c);
		System.out.println(s.substring(2, 4));
		System.out.println(mystore==st);
		System.out.println(mystore.equals(st));
	}

}
