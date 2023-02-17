package assignment;
///8Assignment 0: 

//1. Create a class called Theatre
//2. Have main method in it. 
//3. Create an instance[object] called raja of Theatre class. 
//4. Call method bookTicket(200) eg. raja.bookTicket(100)
//5. Have method signature for bookTicket method with necessary arguments for handling the input 200. 
//6. Define bookTicket method as below. 
//    1. Declare a local variable ticket_price in int datatype. 
//    2. Assign 120 as value for ticket_price variable. 
//    3. Subtract 120 from method argument (200)
//    4. Store result of above line into another variable called balance of int datatype. 
//    5. return this balance to main method. 
//7. In main method, receive this balance as int balance
//8. In main method, print as below. 
//System.out.println("After booking ticket " + balance);

public class Theater {
	static int balance;

	public static void main(String[] args) {
		Theater raja = new Theater();
		int ticket_price = raja.bookTicket();

		System.out.println("After booking ticket " + balance);

	}

	public int bookTicket() {

		int ticket_price = 120;
		int balance = 200 - ticket_price;
		System.out.println(balance);

		return ticket_price;
	}

}
