package com.ashifshadab.basic;

public class ArrayIntroduction {

	public static void main(String args[]) {

		// Declare Array
		int[] myIntArray;
		int yourIntArray[];
		char[] myCharArray;
		char yourCharArray;
		String[] myStringArray;
		String yourStringArray;

		// Declare and initialize Array
		int[] mySecondIntArray = new int[5];
		int yourSecondIntArray[] = new int[5];
		char[] mySecondCharArray = new char[5];
		char yourSecondCharArray[] = new char[5];
		String[] mySecondStringArray = new String[5];
		String yourSecondStringArray[] = new String[5];
		Student[] studentArray = new Student[5];//Array Of Objects

		// Array Initialization
		mySecondIntArray[0] = 20;
		mySecondIntArray[1] = 30;
		mySecondIntArray[2] = 5;
		mySecondIntArray[3] = 90;
		mySecondIntArray[4] = 10;

		yourSecondStringArray[0] = "Sun";
		yourSecondStringArray[1] = "Mon";
		yourSecondStringArray[2] = "Tue";
		yourSecondStringArray[3] = "Wed";
		yourSecondStringArray[4] = "Thu";

		for (int i = 0; i < yourSecondIntArray.length; i++) {
			yourSecondIntArray[i] = i;
		}
		
		// One Way
		Student student1 = new Student(1, "Shyam");
		studentArray[0] = student1;
		// Another Way
		studentArray[1] = new Student(2, "Mohan");
		studentArray[2] = new Student(3, "Shoam");
		studentArray[3] = new Student(4, "Jack");
		studentArray[4] = new Student(5, "Tom");

		// Accessing specific index Elements of Array
		System.out.println("Array yourSecondStringArray 2 index element is " + yourSecondStringArray[2]);
		System.out.println("Array mySecondIntArray 0 index element is " + mySecondIntArray[0]);
		System.out.println("Array mySecondIntArray 4 index element is " + mySecondIntArray[4]);
		
		printLineSeprator();
		
		// Accessing All Elements of Array
		for (int i = 0; i < yourSecondIntArray.length; i++) {
			System.out.println("Array mySecondIntArray " + i + " index element is " + yourSecondIntArray[i]);
		}

		printLineSeprator();
		
		// Accessing All Elements of Array of Object
		for (int i = 0; i < studentArray.length; i++) {
			Student student = studentArray[i];
			System.out.println("Index " + i + " 's Student Details :: " + studentArray[i]);
		}
	}
	
	public static void printLineSeprator() {
		System.out.println("-------------------------------------------------------------------------------");
	}

}

class Student {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", name='" + name + '\'' + '}';
	}

}
