package coreJava;

import java.util.ArrayList;

public class ArrayList_4 {
	
	public static void main(String[] args) {
		
		//Arraylist can used to store data in an array dynamically. Size of the can be increased dynamically
		// with array(static array), size of array will be fixed at the beginning.
		//ArrayList is class in Java
		// to access method from a class, object of the class has to be created
		ArrayList<Integer> a = new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.remove(2);
		// To get a value from array list Get method can be used
		
		System.out.println(a.get(1));
		
		
		// to coverrt is as a string array
		ArrayList<String> b = new ArrayList();
		//using add method values can be added dynamically
		b.add("Dharani");
		b.add("Sankar");
		b.add("Muthusamy");
		b.add("Lakshmi");
		b.add("Nandhini");
		b.remove("Dharani");
		b.remove(1);
		System.out.println(b.get(2));
		//Size is the method which give length of array list
		for(int i=0; i<b.size();i++) {
			System.out.println(b.get(i));
		}
		
		//String is an Object that represents sequence of characters. two ways to create string object
		// one - String a = "Dharani"
		// String <Variablename> = new String("value")
		//String literal - in below case it will not create new memory for variable m as n is also same. it will allocate
		// same memory for both variables. in case new keyword used, it will create new variables.
		//String n = "Dharanisankar";
		//String m = "Dharanisankar";
		
		// New memory allocate operator
		
		String name = new String("Dharanisankar Muthusamy");
		
		// Split method to split the strings. when strings are splitted into parts, it creates an array
		String[] name1 = name.split(" ");
		System.out.println(name1[0]);
		System.out.println(name1[1]);
		//System.out.println(name);
		
		for(int i=0; i<name1.length; i++) {
			System.out.println(name1[i]);
		}
		
		String name2 = new String("Dharani sankar Muthusamy");
		
		String[] name3 = name2.split("sankar");
		System.out.println(name3[0]);
		System.out.println(name3[1]);
		//System.out.println(name);
		
		for(int i=0; i<name3.length; i++) {
			System.out.println(name3[i]);
		}
		
		// to remove the whitespaces trim method can be used
		
		for(int i=0; i<name3.length; i++) {
			System.out.println(name3[i].trim());
		}
		
		// to loop through the string charAt can be used. this method will return the character present in the specfic position
		
		for(int i=0; i<name.length();i++) {
			System.out.println(name.charAt(i));
		}
		
		// to print string in the reverse order
		
		for(int i=name.length()-1; i>=0;i--) {
			System.out.println(name.charAt(i));
		}
	}	
	
	
	
	
	
	

}
