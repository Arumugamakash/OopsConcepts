package inheritance;

public class OverridingConcepts2 {
	public static void main(String[] args) {
		Int2 i2 = new Box();
		i2.close();
		i2.store();
		i2.theft();
		i2.write();
		System.out.println("*****************");
		Int2 i3 = new Bag();
		i3.close();
		i3.store();
//		i3.clean();
		i3.write();
		System.out.println("*****************");
		Int3 i4 = new Box();
		i4.write();
		i4.theft();
//		i4.clean();//does not override clean mtd because clean()only visible for bag obj
		System.out.println("*****************");
		Int3 i5 = new Pen();
		i5.write();
//		i5.clean();
		System.out.println("*****************");
	}
}
/*
 * Output: Store Something into the box box is stolen pen using for Writing
 *****************
 * bag is opening Stores the books ,pen ,boxes ,notes..etc pen using for Writing
 *****************
 * pen using for Writing box is stolen
 *****************
 * pen using for Writing
 *****************
 */
