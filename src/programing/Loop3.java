package programing;

public class Loop3 {
	public static void main(String[] args) {
		Loop3 L3 = new Loop3();
		L3.reverse();
		L3.count_dig(12345);
		L3.sum_dig(15234);
		L3.sum_alternate(1452637);

	}

	private void reverse() {
		int no = 1986;
		while (no > 0) {
			System.out.println(no % 100);
			no = no / 100;
		}

	}

	private void count_dig(int no) {
		int count = 0;
		while (no > 0) {
//			System.out.println(count%100);
			count = count + 1;
			no = no / 10;
		}
		System.out.println("dig count is " + count);
	}

	private void sum_dig(int no) {
		int count = 0;
		int sum = 0;
		while (no > 0) {
			int rem = no % 10;
			sum = sum + rem;
//			System.out.println(count%100);
//			count= no +1;
			no = no / 10;
		}
		System.out.println("sum is  " + sum);

		/*
		 * int count_of_digits = 0; int sum = 0; while(plate>0) { int rem = plate%10;
		 * sum = sum + rem;
		 * 
		 * plate = plate / 10; count_of_digits = count_of_digits + 1; }
		 * System.out.println("Digits count is " + count_of_digits);
		 * System.out.println("Sum of Digits is "+ sum);
		 */
		/*
		 * int sum=0; while(plate>0) { int rem =plate%10; if (rem%2==0) { sum=sum+rem; }
		 * 
		 * plate=plate/10; } System.out.println(sum); }
		 */
		/*
		 * class sumofdigits{ public static void main(String args[]) { int
		 * count_of_digits = 0; int a=1452237; int sum=0; while(a>0) {
		 * 
		 * int b=a%10; sum=sum+b;
		 * 
		 * a = a / 100; } System.out.println(sum); } }
		 */
		/*
		 * private void reverse_number(int num) { int reverse=0; while (num>0) { int
		 * no=num%10; reverse=(reverse*10)+no; num=num/10; }
		 * System.out.println(reverse); }
		 */
		/*
		 * int plate1 = 12345; int plate2 = 0;
		 * 
		 * while(plate1>0){ int rem = plate1%10; //5 plate2 = (plate2*10) + rem; plate1
		 * = plate1/10; //1234 } System.out.println(plate2);
		 */
		/*
		 * private void even_position_sum(int plate) { int sum=0; while (plate>0) { int
		 * no=plate/10; int rem=no%10; sum=sum+rem; no=no/10; plate=no;
		 * 
		 * } System.out.println(sum); }
		 */
		/*
		 * private void sunOfDigit4238(int plate) { // TODO Auto-generated method stub
		 * int count=0; while(plate>0) { int rem=plate%10;//8
		 * 
		 * System.out.println(rem); count=count+rem; plate=plate/100;//1452637
		 * }System.out.println(count);
		 */
		/*
		 * public void sumofmulofthree(int num) { int sum=0; while(num>0){ int
		 * rem=num%10; if(rem%3==0) { sum=sum+rem; } num=num/10; }
		 * System.out.println(sum); }
		 */
	}

	private void sum_alternate(int no) {

		int count = 0;
		while (no > 0) {

		}
	}
}
