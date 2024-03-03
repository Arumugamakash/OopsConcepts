package inheritance;

public class Main1 {

	public static void main(String[] args) {
		Pen p = new Pen();

		System.out.println("*************");
		System.out.println(p.name);
		System.out.println(p.price);
		System.out.println(p.color);
		p.open();
		p.state = "clos";
		p.close();
		p.write();/// pen method only visible for pen object only;
		System.out.println("*************");
		Box b = new Box();
		System.out.println(b.name);
		System.out.println(b.price);
		System.out.println(b.color);
		b.open();
		b.state = "clos";
		b.close();
		b.store();
		b.theft();
		b.write();
		System.out.println("*************");
		Bag bg = new Bag();
		System.out.println(bg.name);
		System.out.println(bg.price);
		System.out.println(bg.color);
		bg.open1();
		bg.state = "clos";
		bg.close();
		bg.clean();
		bg.store();
		bg.theft();/// theif method visiblity of bag object because of extends the Box;
		bg.write();/// write mtd visiblity of bag obj because of box extends Pen and bag extends
					/// Box so...;
	}

}
/*
/**************
INK pen
30.0
Black
Pen is opening
pen is closing
pen using for Writing
*************
MetalBox
100.0
Red
box is opening
box is closing
Store Something into the box
box is stolen
pen using for Writing
*************
Safari bag
500.0
orange
bag is opening...OPen1 method
bag is closing
bag is not cleaning
Stores the books ,pen ,boxes ,notes..etc
box is stolen
pen using for Writing
*/