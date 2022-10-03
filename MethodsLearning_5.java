package coreJava;

public class MethodsLearning_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To reuse the same code again and again, method can be used and can be called as and when required.
		// To avoid writing repetition codes again and again.
		//Methods should not be created inside the main method. it should be under the class.
		// method might and might not be needed. so write a method under class and call from main method as required
		
		MethodsLearning_5 obj = new MethodsLearning_5();
		MethodsLearning_6 obj1 = new MethodsLearning_6();
		
		obj.getData();
		obj.getString();
		System.out.println(obj.getString());
		
		String name = obj1.getName();
		System.out.println(name);
		
		MethodsLearning_5.getStaticethod();
		getStaticethod();
		
		

	}
	//public modifier let's this method to be accessed by another class also
	//Private modifier will allow respective method or variable within the class
	//Default modifier will allow method or variable within the package
	//class can have only public and default as a modifier.
	// void means what this method returns
	
	public void getData() {
		System.out.println("This is my first method");
		
	}
	//If method returns something, then void has to be changed with respective data type
	public String getString() {
		String name = "Dharanisankar";
		System.out.println("HI, this is string method");
		return name;
		
	}
	// Method static is added to the method, it means this method belong to class and not belong to obj. 
	//So this method can be called directly without creating an object
	public static void getStaticethod() {
		System.out.println("This is Static method");
		
	}

}
