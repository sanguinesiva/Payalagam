package work;

import java.util.zip.ZipEntry;

public class Calculator {
	
	static String Brand= "Casio";
	public static void main(String[] args) {
		
		Calculator calc= new Calculator();
		int no1 = 100, no2= 200;
		int result= calc.add(no1,no2);// method calling statement
		calc.add(100, 20.3f);
		calc.add(100, 200,300);
	}
	
		void add(int no1, float no2){
		System.out.println(no1+no2);
		}
		
		int add(int a, int b){
			System.out.println(a+b);
		return a+b;	
			}
		
		int add(int x, int y, int z) {
			System.out.println(x-y+z);
			return x+y+z;
		}

}
