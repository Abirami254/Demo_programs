package hit.day14;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		System.out.println("Before Exception....");
		//Integer.parseInt - will convert a string to a number
		int num=0;
		try {
			num=Integer.parseInt(args[0]);
			int i=1/num;//the program gets terminated at this point....
			System.out.println("immediate line after exception...");
		}		

		finally {
			System.out.println("finally called...");
			num=1;
		}
		int i=1/num;
		System.out.println("value of i is...:"+num);
		System.out.println("After Exception....");
	}
}

