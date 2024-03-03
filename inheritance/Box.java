package inheritance;

public class Box extends Pen implements Int2, Int3{
	String name = "MetalBox";
	static double price = 100;
	String color = "Red";
	static String state = "open";

	static void open() {
		System.out.println("box is " + state + "ing");
	}

	public void close() {
		System.out.println("box is "+state +"ing");
	}
	public void store() {
		System.out.println("Store Something into the box");
	}
	public void theft() {
		System.out.println("box is stolen");
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		
	}

}
