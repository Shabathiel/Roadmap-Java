package learningBasics;

public class TypeCasting {

	public static void main(String[] args) {
		
		//Widening Conversion
	    int num = 50;

	    System.out.println("The integer value: " + num);

	    double data = num;

	    System.out.println("The double value: " + data);
	    
	    //Narrowing type conversion
	    double num2 = 50.55;

	    System.out.println("The double value: " + num2);


	    int data2 = (int)num2;

	    System.out.println("The integer value: " + data2);
	    
	    //Int to String
	    
	    int num3 = 50;

	    System.out.println("The integer value is: " + num3);


	    String data3 = String.valueOf(num3);

	    System.out.println("The string value is: " + data3);

	    //String to int
	    
	    String data4 = "50";

	    System.out.println("The string value is: " + data4);


	    int num4 = Integer.parseInt(data4);

	    System.out.println("The integer value is: " + num4);

	    //Orden para convertir (mas pequeño al mas grande)
	    //byte -> short -> char -> int -> long -> float -> double  
	}

}
