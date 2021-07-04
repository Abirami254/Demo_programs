package hit.day10;

public class AssDemo {
	public void eatLaddu(Laddu laddu ){
		System.out.println("Laddu is eaten");
		laddu.setSize(5);
	}
	public static void main(String[] args) {
		Laddu laddu=new Laddu(); //Association-AssDemo has knowledge of laddu 
		laddu.setSize(10);
		System.out.println("Before eating laddu size: "+laddu.size);
		
		AssDemo obj=new AssDemo();
		obj.eatLaddu(laddu);
		System.out.println("After eating laddu size: "+laddu.size);
		
	}

}
class Laddu{
	int size;
	public void setSize(int size){
		this.size=size;
	}
	
}
