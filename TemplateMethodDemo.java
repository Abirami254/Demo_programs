package hit.day13;

public class TemplateMethodDemo {
	public static void main(String[] args) {
		Sam samHotel=new SamsivRestaurant();
		samHotel.process();
	}

}
abstract class Sam{
	public final void uniform() {
		System.out.println("uniform defined by sam");
	}
	public final void serve() {
		System.out.println("sam defines how to serve");
	}
	public abstract void makeIdly();
	
	public final void createIdlyPlate() {
		System.out.println("sam define how to create a idly plate");
	}
	public final void charge() {
		System.out.println("sam define how much to charge");
	}
	public final void process() {//Template method...
		uniform();
		makeIdly();
		createIdlyPlate();
		serve();
		charge();
	}
}
class SamsivRestaurant extends Sam{
	@Override
	public void makeIdly() {
		System.out.println("my grandma makes the idly in my hotel");
	}
}