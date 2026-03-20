package learningBasics;

public class Car {
	private int Serial = 0;
	public String Brand = "";
	public String Model = "";
	private int Velocidad = 0;
	
	public Car() {
		this.Serial = 54321;
		this.Brand = "BMW";
		this.Model = "M3";
	}
	
	public Car(int S, String B, String M) {
		this.Serial = S;
		this.Brand = B;
		this.Model = M;
	}
	
	public void Acelerar() {
		this.Velocidad += 15;
		System.out.println("Se ha acelerado " + this.Model + "a " + Velocidad);
	}
	
	@Override
	public String toString() { // Re larga la cadena
		return "Car N°: " + Serial + ", " + Brand + " model: " +  Model + "\n Velocidad actual: " + Velocidad + "\n";
	}
}
