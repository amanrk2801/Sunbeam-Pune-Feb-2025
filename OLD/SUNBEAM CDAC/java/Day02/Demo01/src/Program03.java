
public class Program03 {

	public static void main(String[] args) {
		int n1 = 10; // Primitive type
		Integer i1 = new Integer(n1);	// Non Primitive type -> Boxing
		System.out.println("Value of i1 - "+i1);
		
		Integer i2 = new Integer(20); // Non primitive type
		int n2 = i2.intValue(); // Primitive type -> UnBoxing
		System.out.println("Value of n2 - "+n2);
		
		int n3 = 30;
		Integer i3 = n3; //Auto Boxing
		
		Integer i4 = new Integer(40);
		int n4 = i4; // Auto UnBoxing
	}				

}
