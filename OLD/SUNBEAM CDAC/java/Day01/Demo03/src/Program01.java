import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		int empid;
		String name;
		double salary;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter empname - ");
		name = sc.nextLine();
		System.out.print("Enter id - ");
		empid = sc.nextInt();
		System.out.print("Enter salary - ");
		salary = sc.nextDouble();
		
		System.out.println("Empname - "+name);
		System.out.println("Empid - "+empid);
		System.out.println("EmpSalary - "+salary);
	}

}
