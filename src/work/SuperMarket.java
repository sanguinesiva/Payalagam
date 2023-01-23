package work;

public class SuperMarket {
	static String shop_name = "walmart";
	String product_name;
	int product_price;
	boolean expired;
	float discount;

	public SuperMarket(String product_name, int product_price) {
		// TODO Auto-generated constructor stub
//	System.out.println("siva");
		this.product_name = product_name;
		this.product_price = product_price;
		// this is used to initialize non static variables.
		// it is same as class name
		// it has no return datatype.

	}

	public static void main(String[] args) {

		SuperMarket product1 = new SuperMarket("biscuit ", 30);
		SuperMarket product2 = new SuperMarket("bread ", 10);
		product1.sell();
		product2.pack();
		System.out.println(product1.expired);
		System.out.println(product2.discount);

//		product1.product_name= "biscuit";
//		product2.product_price=30;
	}

	private void pack() {
		// TODO Auto-generated method stub
		System.out.println("selling " + product_name + product_price);

	}

	private void sell() {
		// TODO Auto-generated method stub
		System.out.println("packing " + product_name + product_price);

	}

}
