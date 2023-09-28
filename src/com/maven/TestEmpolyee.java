package com.maven;

class Empolyee {
	int id;
	String name;
	float salary;

	void insert(int i, String n, float f) {
		id = i;
		name = n;
		salary = f;
	}

	void display() {
		System.out.print(id + " " + name + " " + salary);
	}

}

   public class TestEmpolyee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empolyee e1 = new Empolyee();
		e1.insert(23, "vilas", 50000);
		e1.display();

	}

}
