
public class Program01 {

	public static void main(String[] args) {
	
		int num1 = 10;
		System.out.println("Size of int - "+Integer.BYTES);
		System.out.println("Max value of int - "+Integer.MAX_VALUE);
		System.out.println("Min value of int - "+Integer.MIN_VALUE);

		// we cannot check the size of boolean using the wrapper class
		//System.out.println("Size of boolean - ");
		
		System.out.println("Size of float - "+Float.BYTES);
		System.out.println("Max value of float - "+Float.MAX_VALUE);
		System.out.println("Min value of float - "+Float.MIN_VALUE);
		
		
		System.out.println("Size of long - "+Long.BYTES);
		System.out.println("Max value of long - "+Long.MAX_VALUE);
		System.out.println("Min value of long - "+Long.MIN_VALUE);
		// TODO - Perform the same for remaning primitive datatypes
		
	}

}
