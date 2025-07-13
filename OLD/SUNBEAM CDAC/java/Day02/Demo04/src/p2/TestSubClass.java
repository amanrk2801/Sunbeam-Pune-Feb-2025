package p2;

import p1.Test;

public class TestSubClass extends Test {

	public void displayTestSubClass() {
		System.out.println(num1);// NOT OK
		System.out.println(num2);// NOT OK
		System.out.println(num3);
		System.out.println(num4);
	}
}
