package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		Student[][] studentList = new Student[3][];
		// Dac course
		studentList[0] = new Student[4];

		// Dmc course
		studentList[1] = new Student[3];
		
		// Dbda course
		studentList[2] = new Student[2];
		
		//creating object of students for Dac course (0th index)
		studentList[0][0] = new Student(1,"akash",60);
		studentList[0][1] = new Student(2,"ganesh",70);
		studentList[0][2] = new Student(3,"rohan",50);
		studentList[0][3] = new Student(4,"rajiv",80);

		//creating object of students for Dmc course (1st index)
		studentList[1][0] = new Student(5,"nilesh",90);
		studentList[1][1] = new Student(6,"nitin",100);
		studentList[1][2] = new Student(7,"sarang",100);
		
		//creating object of students for Ddba course (2nd index)
		studentList[2][0] = new Student(8,"mukesh",30);
		studentList[2][1] = new Student(9,"anil",20);
		
		
		for(Student[] arr : studentList)
			for(Student student: arr)
				student.display();
		
		for(int i=0; i<studentList.length;i++) {
			for(int j=0; j<studentList[i].length;j++) {
				studentList[i][j] = new Student();
			}
		}
		
	}

}
