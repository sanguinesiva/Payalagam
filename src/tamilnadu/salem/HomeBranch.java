package tamilnadu.salem;

public class HomeBranch {


	public static void main(String[] args) {
		HomeBranch manager = new HomeBranch();
		manager.work();
		manager.pay_salary();
		manager.marketing();
//		manager.recuit(); not possible to access the private method even if its parent class
		manager.plan_statergy(); // not able to access protected method since its not child class.
	}
	void marketing() {
		System.out.println("add promotion ");
		
	}

}
