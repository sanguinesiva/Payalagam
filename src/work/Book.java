package work;

public class Book {
	int price;
	int discount;

	Book(int price)

	{
		this.price = price;
		this.discount = discount;

	}

	public Book(int price, int discount) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Book Book1 = new Book(50);
		Book Book2 = new Book(30);
		Book Book3 = new Book(1000, 500);
	
		Book1.sell();
		Book3.sell();
//		System.out.println(this.price);

	}

	void sell() {
		int price = 45;
		System.out.println(price);
		System.out.println(this.price); // dont use this key word inside the static method.
		System.out.println("discount is " + this.discount);

	}

}
