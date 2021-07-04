package hit.day10;

public class InherDemo {
	public static void main(String[] args) {
		Employee e=new Engineer();
		Engineer eng=new Engineer();
		
		e.met(4);
		eng.met(2);
	}

}

class Employee{
	protected void met(int i){
		System.out.println("Met method of employee called...");
	}
	
}
class Engineer extends Employee{
	public void met(int i){//method override
		System.out.println("Engineering met method called...");
		super.met(2);
	}
	
}
class Attender extends Employee{
	public void met(){
		System.out.println("Attender met method called...");
	}
	
}
