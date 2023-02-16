package programing;

public class Loop4 {
	public static void main(String[] args) {
		Loop4 lo = new Loop4();
//		lo.find_palindrome(12321);
		lo.find_armstrong(153);
	}

	private void find_palindrome(int plate1) {
		// TODO Auto-generated method stub
		int plate3 = plate1;
		int plate2 = 0; // 12345

		while (plate1 > 0) {
			int rem = plate1 % 10; // 4
			plate2 = (plate2 * 10) + rem;
			plate1 = plate1 / 10; // 1234
		}
		System.out.println(plate1);
		System.out.println(plate2);
		if (plate3 == plate2) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not Palindrome");
		}

	}

	private void find_armstrong(int plate1) {
		// TODO Auto-generated method stub
		int plate3 = plate1;
		int plate2 = 0; // 12345

		while (plate1 > 0) {
			int rem = plate1 % 10; // 4
			plate2 = plate2 + (rem * rem * rem); // 27 + 125 + 1
			plate1 = plate1 / 10; // 1234
		}
		System.out.println("plate1 " + plate1);
		System.out.println("plate2 " + plate2);
		if (plate3 == plate2) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}

	}
}
