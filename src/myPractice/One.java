package myPractice;

public class One {
	String name = "siva";
	int num = 10;
	private int salary = 2000;
	public int profits = 10;
	static float height = 6.11f;
	static long phone_no = 123456789;
	boolean male = true;
	private String nationality = "chinese";

	public static void main(String[] args) {
		One obj = new One();
		obj.salary = 500;
		obj.male = false;
		obj.profits = 5;

		obj.method1();
	}

	void method1() {
		System.out.println(this.num + " " + this.salary + " " + this.name + " " + this.male);
		System.out.println(One.phone_no);
		System.err.println(phone_no);
		System.out.println(name);
	}

}
