package work;

public class Boy {
	public static void main(String[] args)
	{
	//Boy boy1 = new Boy();
	//new Boy - Anonymous Object
	String s = new Boy().enquire();
	System.out.println(s);
	System.out.println(new Boy().enquire());
	}

	String enquire()
	{
	return "correct address";
	}

}
