package com.sunbeam;

interface I1{
	int num = 10;
}

interface I2 {
	
}

interface I3{
	
}

class C1{
	
	C1(){
		
	}
	
}

class C2 implements I1,I2 {
		
}

class C3  extends C1  implements I1,I2{
	
}

public class Program02 {

	public static void main(String[] args) {
		// C2 extends C1 // OK
		// C3 extends C1,C2 // NOT OK
		// C2 implements C1 // NOT OK
		
		// I2 extends I1 // OK
		// I3 implements I1 // NOT OK
		// I3 extends I1,I2 // OK
		
		// I2 extends C1 // NOT OK
		// I2 implements C1 // NOT OK
		
		// C1 implements I1 // OK
		// C1 implements I1,I2 // OK
		// C1 extends I1 // NOT OK
		
		// C3  extends C1  implements I1,I2 // OK
		// C3  implements I1,I2  extends C1  // NOT OK
		
	}

}
