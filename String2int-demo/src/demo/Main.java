package demo;

public class Main {

	public static void main(String[] args) {
		string2int("abc573");
		string2int("a5b7c3"); 
	}
	
	private static void string2int(String target) {
		for (byte obj : target.getBytes()) {
			if (obj > 48 && obj < 57) {
				System.out.printf("%c", obj);
			}
		}
		System.out.println();
	}
}
