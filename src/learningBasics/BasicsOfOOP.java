package learningBasics;

public class BasicsOfOOP {

	public static void main(String[] args) {
		Car Carro = new Car();
		Car Coche = new Car(12345,"Volksvawen","SUV T-Cross");
		
		System.out.println(Carro);
		
		Coche.Acelerar();
		
		System.out.println(Coche);
	}

}
