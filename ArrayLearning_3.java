package coreJava;

public class ArrayLearning_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array learning
		// Array is a collection of data
		// to store more than one value in a variable, array can be used
		// two ways to create arrays
		// first one - Datatype[] variablename = New Datatype[no of variables]
		// New key word to create a memory to n number of data
		int[] array = new int[5];
		// to assign value in an array index can be used.
		// In array index starts from 0

		array[0] = 3;
		array[1] = 5;
		array[2] = 4;
		array[3] = 6;
		array[4] = 7;

		// array can also be created form of below

		// when directly prints array it will give address of memory where that variable
		// is stored.

		// to print the array index can be used

		int[] arra2 = { 1, 2, 3, 4, 5 };
		// System.out.println(arra2);
		System.out.println(array[1]);

		// To display the data from array Loop can be used

		for (int i = 0; i < arra2.length; i++) {

			System.out.println("Array2" + arra2[i]);
			// System.out.println("Array2");
			System.out.println("Array1" + array[i]);

		}

		String[] name = { "dhrani", "sankar", "m" };

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

		// Other way to write a forloop aka enhanced for loop systax

		for (String s : name) {
			System.out.println(s);
		}

		

	}

}
