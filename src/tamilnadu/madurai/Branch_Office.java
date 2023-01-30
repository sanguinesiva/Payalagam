package tamilnadu.madurai;

import javax.xml.transform.Source;

import tamilnadu.chennai.Office;
import work.SuperMarket;

public class Branch_Office extends Office
{
	public int hike= 20;
	public static void main(String[] args) {
		Branch_Office manager = new Branch_Office();
		manager.work();
		manager.pay_salary();
		manager.marketing();
//		manager.recuit(); not possible to access the private method even if its parent class
		manager.plan_statergy();
		Office Off_obj = new Office();
		Off_obj.work();
	}
	
	
	void marketing() {
		super.pay_salary();
		System.out.println("add promotion ");
		
	}
//	method overridden method.  usually the access should not be reduced. 
	public void work()
	{
		System.out.println(super.hike);
		System.out.println(this.hike);
		super.work();
		super.plan_statergy();
		System.out.println("Dev and testing");

	}

}
