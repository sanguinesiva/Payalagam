package OOPs;

public class School {
	public static void main(String[] args) {
		
		School scienceTeacher = new School();
	scienceTeacher.teaches();	 // dot operator // method calling 
	
	int account= scienceTeacher.collect_fees();
	System.out.println("total amount " + account);
	
		
	}
	void teaches() // method decliration 
	{ 
		System.out.println("training students and teaching");
	}

	int collect_fees() {
		int fees1= 100;
		int fees2=20;
		int fees3= 50;
		return fees1+fees2+fees3;
		
	}
}
