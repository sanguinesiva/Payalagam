package programing;

//looping
public class Condition2 {
	public static void main(String[] args) {
		Condition2 loop = new Condition2();
		loop.milk();
		loop.milk2();
		loop.dad_daughter();
		loop.dad_daughter2();
		loop.thenali();
		loop.thenali2();
		loop.temple();

	}
	private void milk2() {
		int expense =0;
		int day = 1;
		int milk=20;
		while(day<=28) {
			expense= expense+2;
			System.out.println("milk bought day "+ day);
			day=day+2;
		
		}
		System.out.println(expense);
	}

	private void milk() {
		int price = 0;
		int milk = 20;
		int day = 1;
		while (day <= 28) {
			price = price + milk;
			day = day + 1;

		}
		System.out.println(price);

	}

	private void dad_daughter() {
		int purse = 0;
		int day = 1;
		while (day <= 10) {
			purse = purse + day;
			day = day + 1;

		}
		System.out.println(purse);
	}

	private void dad_daughter2() {
		int purse = 0;
		int day = 1;
		while (day <= 10) {
			purse = purse + 5;
			day = day + 1;

		}
		System.out.println(purse);

	}

	private void thenali() {
		int slap = 1024;
		while (slap > 1) {
			System.out.println("guard gets slap " + (slap / 2));
			slap = slap / 2;

		}
		System.out.println("one slap for thenali");

	}

	private void thenali2() {
		int slap = 1024;
		int guard_count = 0;
		while (slap > 1) {
			System.out.println("guard gets " + (slap / 2));
			guard_count = guard_count + 1;
			slap = slap / 2;

		}
		System.out.println("one for thenali");
		System.out.println("total no of guards " + guard_count);

	}

	private void temple() {
		int temple = 7;
		int flower = 1;
		while (temple > 0) {
			flower = flower * 2;
			temple = temple - 1;

		}
		System.out.println("initially " + flower);

	}
}
