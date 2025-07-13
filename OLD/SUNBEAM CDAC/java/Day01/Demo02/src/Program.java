
public class Program {
	public static void main(String[] args) {
		System.out.println("Hello from main(String []args)");
	}
	
	public static void main() {
		System.out.println("Hello from main()");
	}
	
// 	NOT OK -> Return type is not considered during overloading
//	public static int main() {
//		System.out.println("Hello from main()");
//	}
	
// 	NOT OK -> Modifiers are not considered during overloading	
//	 void main() {
//		System.out.println("Hello from main()");
//	}
}
