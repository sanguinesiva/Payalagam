package tamilnadu.chennai;

/**
 * @author Siva
 *
 */
public class Calculator implements Rules {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(100,200);
		cal.add(10.5, 200);
	}
private void add(int no1, int no2) {
	System.out.println(no1+no2);
	return;
}
private void add(Double no1, int no2) {
	System.out.println(no1+no2);
	return;

}
@Override// Annotation: meta data
public void rules() {
	System.out.println();
	
}
}
