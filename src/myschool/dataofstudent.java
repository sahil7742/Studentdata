package myschool;

import java.util.Scanner;

public class dataofstudent {

	public static void main(String[] args) {
		System.out.println("Enter registration no.  ");
		Scanner input = new Scanner(System.in);
		int registration = input.nextInt();

		// creating an object
		Student data1 = new Student("sahil", 9048, 94.5);
		Student data2 = new Student("kunal", 9056, 50.5);
		Student data3 = new Student("sweta", 9065, 95.5);
		Student data4 = new Student("kushab", 9024, 70.0);
		Student data5 = new Student("shub", 9038, 94.5);
		Student data6 = new Student("anshu", 9098, 99.5);
		Student data7 = new Student("sahil", 9048, 94.5);
		Student data8 = new Student("sahil", 9048, 94.5);

		switch (registration) {
		case 1:
			System.out.println("Name of student " + data1.name);
			System.out.println("ID : " + data1.id);
			System.out.println("Score obtained :" + data1.marks);
			System.out.println("_________________________________");
			break;
		case 2:

			System.out.println("Name of student " + data2.name);
			System.out.println("ID : " + data2.id);
			System.out.println("Score obtained :" + data2.marks);
			System.out.println("_________________________________");
			break;
		case 3:

			System.out.println("Name of student " + data3.name);
			System.out.println("ID : " + data3.id);
			System.out.println("Score obtained :" + data3.marks);
			System.out.println("_________________________________");
			break;
		case 4:

			System.out.println("Name of student " + data4.name);
			System.out.println("ID : " + data4.id);
			System.out.println("Score obtained :" + data4.marks);
			System.out.println("_________________________________");
			break;
		case 5:
			System.out.println("Name of student " + data5.name);
			System.out.println("ID : " + data5.id);
			System.out.println("Score obtained :" + data5.marks);
			System.out.println("_________________________________");
			break;
		case 6:

			System.out.println("Name of student " + data6.name);
			System.out.println("ID : " + data6.id);
			System.out.println("Score obtained :" + data6.marks);
			break;
		default:
			System.out.println("not in school");

		}

	}

}
