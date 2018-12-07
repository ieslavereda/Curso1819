package examen;

import java.util.Scanner;

public class Eje456 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int students = 0;
		String[][] grades;

		System.out.println("How many students do you want to store:");

		try {

			students = entrada.nextInt();

		} catch (Exception e) {
			System.out.println("Error!");
		}

		grades = new String[students][2];

		fillArray(grades);

		System.out.println("List of approved students");
		System.out.println("-------------------------");
		showApproved(grades);

		System.out.println("Sorted list of approved students");
		System.out.println("-------------------------");
		seleccion(grades);
		showApproved(grades);
	}

	public static void showApproved(String[][] students) {
		for (int student = 0; student < students.length; student++) {
			if (Integer.parseInt(students[student][1]) >= 5)
				System.out.println("Name:" + students[student][0] + "\tGrade: " + students[student][1]);
		}
	}

	public static void fillArray(String[][] students) {

		Scanner entrada = new Scanner(System.in);

		for (int student = 0; student < students.length; student++) {
			System.out.println("Gime me the name of the student nº" + student);
			students[student][0] = entrada.next();
			System.out.println("Gime me the grade for " + students[student][0] + ":");
			students[student][1] = entrada.next();
		}
	}

	public static void seleccion(String[][] vector) {

		int positionHight;

		for (int j = 0; j < vector.length; j++) {
			positionHight = j;
			for (int i = j; i < vector.length; i++) {
				if (Integer.parseInt(vector[i][1]) > Integer.parseInt(vector[positionHight][1])) {
					positionHight = i;
				}
			}
			swap(vector, j, positionHight);
		}
	}
	public static void swap(String[][] array ,int j,int k) {
		
		String[] buffer = new String[2];
		
		buffer[0] = array[j][0];
		buffer[1] = array[j][1];
		array[j][0] =array[k][0]; 
		array[j][1] =array[k][1];
		array[k][0] =buffer[0]; 
		array[k][1] =buffer[1]; 
				
	}

}
