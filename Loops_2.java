package coreJava;

public class Loops_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// For static array, length is the method to get the size of the array
		// If else

				int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

				for (int i = 0; i < arr1.length; i++) {

					if (arr1[i] % 2 == 0) {
						System.out.println(arr1[i] + " is multiple of 2");
					}else {
						System.out.println(arr1[i] + " is not multiple of 2");
					}
				}
				
				//to skip the loop break keyword can be used
				
				for (int i = 0; i < arr1.length; i++) {

					if (arr1[i] % 2 == 0) {
						System.out.println(arr1[i] + " is multiple of 2");
						break;
					}else {
						System.out.println(arr1[i] + " is not multiple of 2");
					}
				}
				
				// Reversing the check
				
				for (int i = arr1.length-1; i >= 0; i--) {

					if (arr1[i] % 3 == 0) {
						System.out.println(arr1[i] + " is multiple of 3");
					}else {
						System.out.println(arr1[i] + " is not multiple of 3");
					}
				}

	}

}
