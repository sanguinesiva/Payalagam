package tamilnadu.chennai;

public /*final*/ class Office {
	static String name = "abcd";
	protected final int hike=10;

	public Office() //line 6-9
	{
	System.out.println("Parent - Zero Args ");
	} 
	
	public Office(int id ) //line 11-14
	{
	System.out.println("Parent - Single Args ");
	} 
	
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
	public final void readingBook() {
		System.out.println("8 Hours only");
		
	}
}
