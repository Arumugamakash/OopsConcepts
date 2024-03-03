package inheritance;

public class Pen implements Int1,Int3{
	public static String name = "INK pen";
	double price = 30;
	String color = "Black";
	static String state = "open";

	static void open() {
		System.out.println("Pen is " + state + "ing");
	}

	public void close() {
		System.out.println("pen is "+state +"ing");
	}

	public void write() {
		System.out.println("pen using for Writing");
	}

	@Override
	public void theft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		
	}
}
