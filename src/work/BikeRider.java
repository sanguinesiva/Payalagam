package work;

public class BikeRider {
	public static void main(String[] args) {
		Comodity gas = new Comodity();
//		System.out.println(gas.petrol_price);
//		System.out.println(gas.diesel_price);
		//gas.petrol_price=50;
//		gas.diesel_price=30;
//		System.out.println(gas.petrol_price);
//		System.out.println(gas.diesel_price);
		
		int petrol= gas.get_petrol_price();
			System.out.println(petrol);
			
			int diesel= gas.get_diesel_price();
			System.out.println(diesel);
			gas.set_petrol_price(1000);
			petrol=gas.get_petrol_price();
			System.out.println(petrol);
	}
}
