package inheritance;

public class Overridingconcepts {
	public static void main(String[] args) {
		Pen p = new Box();// Upcasting
		System.out.println("*************");
		System.out.println(p.name);
		System.out.println(p.price);
		System.out.println(p.color);
		p.open();//
		p.state = "clos";
		p.close();// in this case Box Class close() is called because of Upcasting Override the
					// parent(pen) method(Method is Nonstatic)
		p.write();
		Box bx = new Bag();
		System.out.println("*************");
		bx.open();
		bx.state = "clos";
		bx.close();// in this case Bag Class close() is called because of Upcasting Override the
					// parent(Box) method(Method is Nonstatic)
		bx.write();
		System.out.println("*************");
		Pen p1 = new Bag();
		p1.open();// static mtd so not override
		p1.state = "clos";
		p1.close();
		p1.write();// does not have write () in bag class so not overriden

	}

}
/*
 *************
 * INK pen 30.0 Black Pen is opening box is opening pen using for Writing
 *************
 * box is opening bag is opening pen using for Writing
 *************
 * Pen is closing bag is opening pen using for Writing
 * 
 */
