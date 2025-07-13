package com.sunbeam.p1;
// before java 5
class Box{
	private Object data;
	
	public void setData(Object data) {
		this.data = data;
	}
	
	public Object getData() {
		return data;
	}
}

public class Program {
	public static void main(String[] args) {
		Box b1 = new Box();
		b1.setData(new Integer(10));
		Integer i1 =(Integer) b1.getData();
		System.out.println("i1 - "+i1);
		
		Box b2 = new Box();
		b2.setData(new String("sunbeam"));
		String s1 = (String) b2.getData();
		System.out.println("s1 - "+s1);
		
		Box b3 = new Box();
		b3.setData("12.24");
		Double d1 =(Double) b3.getData(); // ClassCaseException
		System.out.println("d1 - "+d1);
		
		
	}

}
