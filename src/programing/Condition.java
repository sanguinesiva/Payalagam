package programing;

public class Condition {
	public static void main(String[] args) {
		Condition li = new Condition();
		li.ifelse();
		li.ifelse1();
		li.ifelse3();
		li.ifelse4();
		li.ifelse5();
		li.ifelse6();
	}

	private void ifelse() {
		int age1 = 12;
		int age2 = 10;
		if (age1 > age2) {
			System.out.println("first boy is elger");
		} else {
			System.out.println("second boy is elger");
		}

	}

	private void ifelse1() {
		int age1 = 12;
		int age2 = 10;
		if (age1 > age2) {
			System.out.println("boy one elder ");

		} else if (age2 > age1) {
			System.out.println("boy2 is elder");
		} else {
			System.out.println("both are same");
		}

	}

	private void ifelse3() {
		int age1 = 12;
		int age2 = 10;
		if (age1 > age2) {
			System.out.println("boy one elder ");

		} else if (age2 == age1)// comparison operator
		{
			System.out.println("boy2 is elder");
		} else {
			System.out.println("both are same");
		}

	}

	private void ifelse4() {
		int math = 100, science = 100;
		if (math == 100) {
			if (science == 100) {
				System.out.println("chco");

			} else {
				System.out.println("pen");
			}
		} else {
			System.out.println("");
		}

	}
	private void ifelse5(){
		int math=100;
		int science=100;
		if(math==100&& science==100) {
			System.out.println("both are same");
		}
		else {
			System.out.println("not same");
		}
		
	}
	private void ifelse6(){
		int math=100;
		int science=99;
		if(math==100 || science==100) {
			System.out.println("both are same");
		}
		else {
			System.out.println("not same");
		}
		
	}
	
	
}
