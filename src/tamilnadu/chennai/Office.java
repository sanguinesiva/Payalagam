package tamilnadu.chennai;

public class Office {
	static String name = "abcd";
	protected int hike=10;

	public void work() {
		System.out.println("working");

	}

	private void recruit() {
		System.out.println("recruitment process ");
	}

	public void pay_salary() {
		System.out.println("getting paid");
	}

	protected void plan_statergy()// protected access modifier
	{
		System.out.println("secret plan ");
	}
}
