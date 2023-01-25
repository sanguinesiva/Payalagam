package tamilnadu.madurai;

import tamilnadu.chennai.Office;

public class Branch_Office extends Office
{
	public static void main(String[] args) {
		Branch_Office manager = new Branch_Office();
		manager.work();
		manager.pay_salary();
		manager.marketing();
//		manager.recuit(); not possible to access the private method even if its parent class
		manager.plan_statergy();
	}
	void marketing() {
		System.out.println("add promotion ");
		
	}

}
