package hit.day13;

public class AbstractDemo {
	public static void main(String[] args) {
		new Child();
	}

}
abstract class GrandParent{
	public abstract void met();
}
abstract class Parent extends GrandParent{
	//condition 2 - Can I have a constructor inside abstract class
	//ans: yes you can have....
	final int i=10;//its a constant
	public Parent() {
		System.out.println("abstract class Parent cons called...");
	}
	public abstract void yoursSayHello();
	public void mySayHello() {//final methods cannot be overriden
		System.out.println("saying hello as per the abstract class norms...");
	}
}
//when you create an object of child class, the parent abstract class constructor gets called
class Child extends Parent{
	public void met(){}
	public Child() {
		System.out.println("child class of abstract parent object created...");
	}
	@Override
	public void yoursSayHello() {
		System.out.println("say hello as per the child class logic....or norms...");
	}
	@Override
	public void mySayHello() {
		System.out.println("write my own logic..");
	}
}