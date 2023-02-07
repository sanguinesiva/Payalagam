package tamilnadu.madurai;

import javax.xml.transform.Source;

import OOPs.SuperMarket;
import tamilnadu.chennai.Office;

public class Branch_Office extends Office
{
	final int salary= 100;
//	public int hike= 20;
	
	public Branch_Office() //Constructor
	{
	System.out.println("child - Zero Args ");
	} 
	
	public Branch_Office(int id) //Constructor
	{
		super(id);
	System.out.println("child - single Args constructor ");
	} 
	public static void main(String[] args) {
		Branch_Office manager = new Branch_Office(1234);
		System.out.println(manager.hike);
//		manager.salary=200;
//		manager.hike=30;
//		manager.work();
//		manager.pay_salary();
//		manager.marketing();
////		manager.recuit(); not possible to access the private method even if its parent class
//		manager.plan_statergy();
//		Office Off_obj = new Office();
//		Off_obj.work();
		manager.readingBook();
		System.out.println("only 2hrs");
		
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

