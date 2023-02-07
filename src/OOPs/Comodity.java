package OOPs;

public class Comodity {
	int gold_price= 4500;
	private int petrol_price=104;
	private int diesel_price=100;
	
public int get_petrol_price() {
	return this.petrol_price;
}
public int get_diesel_price() {
	return this.diesel_price;
	
}
public void set_petrol_price(int ltrs)
{
	if(ltrs>100) {
		this.petrol_price=100;
	}
}
}
