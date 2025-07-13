
public class Program02 {

	public static void main(String[] args) {
		boolean status = false;
		// we cannot convert boolean value in any other type
		//int num1 = (int)status; // NOT OK

		int num1 = 10;
		double num2 = num1; // widening
		long num3 = num1; // widening
		short num4 =(short) num1; // narrowing
		
		char ch = 'a';
		int num5 = ch; // Type conversion
		byte b = 65;
		char ch2 =(char) b; // Type conversion
		byte b2 = (byte)ch; // Type conversion
		
		float f1 = 123.45f;
		long l1 = (long)f1; // narrowing
		
		long l2 = 9223372036854775807L;
		float f2 = l2; // widening
	}

}
