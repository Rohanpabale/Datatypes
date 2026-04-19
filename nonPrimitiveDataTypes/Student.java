package nonPrimitiveDataTypes;

import java.util.Scanner;

public class Student {
	int id;
	String name;
	String address;

	public Student getStudentData(int id, String name, String address) {
		Scanner sc = new Scanner(System.in);

		System.out.println("eneter your id");
		int id1 = sc.nextInt();

		System.out.println("eneter your name");
		String name1 = sc.next();

		System.out.println("enter your address");
		String address1 = sc.next();

		id = id1;
		name = name1;
		address = address1;

		return new Student();
	}
}
