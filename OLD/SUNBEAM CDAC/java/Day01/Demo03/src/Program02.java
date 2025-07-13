import java.io.Console;

public class Program02 {

	// Will not execute in STS
	// It needs to be executed from the cmd prompt
	public static void main(String[] args) {
		 String email;
		String mobile;
		
		Console console = System.console();
		System.out.print("Enter the email - ");
		email = console.readLine();
		System.out.print("Enter the mobile - ");
		mobile = console.readLine();
		
		System.out.println("Email - "+email);
		System.out.println("Mobile - "+mobile);
		
	}

}
