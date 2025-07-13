
public class Program04 {

	public static void main(String[] args) {
		String s1 = "10"; // Non Primitive
		int n1 = Integer.parseInt(s1); // Primitive type -> UnBoxing
		
		String s2 = "11.25";
		double n2 = Double.parseDouble(s2); // UnBoxing
		
		int n3 = 30; // Primitive type
		String s3 = String.valueOf(n3); // Non Primitive type -> Boxing
		
		
	}				

}
