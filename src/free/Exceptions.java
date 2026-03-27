package free;

public class Exceptions {
	public static void main(String [] args) {
		
		int a = 0;
		int b = 0;
		
		try {
			b = Integer.parseInt("12");
			a = Integer.parseInt("Hello");
		} catch (NumberFormatException e) {
			a = 12;
			b = 125;
		} finally {
			System.out.println(a+b);
		}
	}
}
