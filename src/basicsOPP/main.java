package basicsOPP;

public class main {

	public static void main(String[] args) {
		Clock c = new Clock(120000,10005);
		Clock d = Clock.newClock();
		
		System.out.println("Current time: " + (d.getTime()/1000));
		System.out.println("Set time: " + (c.getTime()/1000));
	}

}
