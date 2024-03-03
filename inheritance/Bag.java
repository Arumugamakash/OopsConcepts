package inheritance;

public class Bag extends Box implements Int2,Int3,Int4 {
	String name = "Safari bag";
	double price = 500;
	static String color = "orange";
	String state = "open";

	public void open1() {
		System.out.println("bag is " + state + "ing...OPen1 method");
	}

	public void close() {
		System.out.println("bag is "+state +"ing");
	}
	public void store() {
		System.out.println("Stores the books ,pen ,boxes ,notes..etc");
	}
	public void clean() {
		System.out.println("bag is not cleaning");
	}

}
