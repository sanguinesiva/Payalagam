package OOPs;

public class Employee extends Parent implements Organization,Library {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.apply_leave();
		emp1. work();
		System.out.println( emp1.leaves);
		//emp1.leaves=100;can not over ride.
		System.out.println(Employee.leaves);
				Organization manager = new Employee();
				manager.apply_leave();
				manager.work();
//				manager.lend();
//				manager.return
				
				Library librarian = new Employee();
				librarian.lend();
				librarian.return_book();
	}
	public void study() {
		System.out.println("study book");
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
	public void return_book() {
		
	}

}
