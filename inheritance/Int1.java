package inheritance;

public interface Int1 {
	public void close();
	public void write();
	//public void open();
	public static void main(String[] args) {
		Int1 i=new Pen();
		i.close();
		i.write();
		//i.open();//this method not over ride because open mtd is static
	}
}
/* output:
pen is opening
pen using for Writing
*/