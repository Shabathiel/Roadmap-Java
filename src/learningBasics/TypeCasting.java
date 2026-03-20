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

	    System.out.println("The double value: " + num);


	    int data2 = (int)num2;

	    System.out.println("The integer value: " + data);
	    
	    //Int to String
	    
	    int num3 = 50;

	    System.out.println("The integer value is: " + num);


	    String data3 = String.valueOf(num3);

	    System.out.println("The string value is: " + data);

	    //String to int
	    
	    String data4 = "50";

	    System.out.println("The string value is: " + data);


	    int num4 = Integer.parseInt(data4);

	    System.out.println("The integer value is: " + num);

	    //Orden para convertir (mas pequeño al mas grande)
	    //byte -> short -> char -> int -> long -> float -> double  
	}

}
