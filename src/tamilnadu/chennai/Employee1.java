package tamilnadu.chennai;

public class Employee1 {
	public static void main(String[] args) {
		Office office = new Office();
		office.work();
		office.pay_salary();
		Employee1 emp = new Employee1();
		emp.study();
		office.plan_statergy();
	}

	public void study() {
		System.out.println("graduation");
	}
	
}
