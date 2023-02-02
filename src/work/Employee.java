package work;

public class Employee implements Organization,Library {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.apply_leave();
		emp1. work();
		System.out.println( emp1.leaves);
		//emp1.leaves=100;can not over ride.
		System.out.println(Employee.leaves);
		
			
	}
	public void apply_leave()
	{
		System.out.println("Development");
		
	}
	public void work()
	{
		System.out.println("working");
		
	}
	public void lend() {
		
	}
	public void return_bool() {
		
	}

}
