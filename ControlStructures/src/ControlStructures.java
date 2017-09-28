// completed by Ava DiPietro on 9/26/17
// unauthorized distribution of this material is prohibited >:(

public class ControlStructures {

	public static void main(String[] args) {
		primePrinter();
		System.out.println("");
		fooBarBaz();
	}
	
	public static void primePrinter() {
		int prime = 2;
		int counter = 0;
		for (prime = 2; counter < 50; prime++) {
			if (isPrime(prime)) {
				System.out.print(prime + " ");
				counter++;
				if (counter % 10 == 0) {
					System.out.println("");
				}
			}
		}
	}
	
	public static boolean isPrime(int prime) {
		int x = 2;
		for (x = 2; x <= (prime / 2); x++) {
			if (prime % x == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void fooBarBaz() {
		int x = 1;
		for (x = 1; x <= 500; x++) {
			if (x % 3 == 0) {
				System.out.print("foo");
				if (!(x % 7 == 0 || x % 10 == 0)) {
					System.out.println();
				}
			}
			if (x % 7 == 0) {
				System.out.print("bar");
				if (!(x % 10 == 0)) {
					System.out.println();
				}
			}
			if (x % 10 == 0) {
				System.out.println("baz");
			}
			if (!(x % 3 == 0 || x % 7 == 0 || x % 10 == 0)) {
				System.out.println(x);
			}
		}
	}
}