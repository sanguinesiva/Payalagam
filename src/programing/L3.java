package programing;

public class L3 {
    public static void main(String[] args) {
        L3 lo = new L3();
        lo.find_square_root(25);
        lo.decimal_to_binary();
        lo.binary_2_dec();
        lo.find_power(1,3);
        lo.find_square_root1(10);
    }

    private void find_square_root(int no) {
        // TODO Auto-generated method stub
        int divisor = 2;
        while (divisor < no) {
            if (no / divisor == divisor) {
                System.out.println("Square Root is " + divisor);
                break;
            }
            divisor = divisor + 1;
        }

    }

    private void decimal_to_binary() {
        // TODO Auto-generated method stub
        int box = 65;
        String result = "";
        while (box > 0) {
            int rem = box % 2;
            result = rem + result;
            box = box / 2;
        }
        System.out.println("Binary is " + result);

    }
    private void binary_2_dec() {
        // TODO Auto-generated method stub
        int no = 110;
        int power = 0;
        L3 ll = new L3();
        while(no>0)
        {
            int rem = no % 10;
            int result = rem * ll.find_power(2, power);
            System.out.println(result);
            no = no/10;
            power = power + 1;
        }
    }
    public int find_power(int base, int power ) {
        // TODO Auto-generated method stub
        int result = 1;
        while(power>0)	{
            result = result * base;
            power = power - 1;
        }
        return result;
    }
    private static void find_square_root1(int no) {
        int divisor = 2;
        while(divisor<no)
        {
            if(no/divisor == divisor&&no%divisor==0)
            {
                System.out.println(no+"is perfect Square Root " );
                break;
            }
            divisor = divisor + 1;
        }

    }
}

//*private void binary_to_decimal() {
//		// TODO Auto-generated method stub
//		int no = 110;
//		int power = 0;
//		LearningLooping4 ll = new LearningLooping4();
//		int decimal = 0;
//		while(no>0)
//		{
//			int rem = no % 10;
//			int result = rem * ll.find_power(2, power);
//
////System.out.println
//(result);
//			decimal = decimal + result;
//			no = no/10;
//			power = power + 1;
//		}
//		System.out.println(decimal);
//	} */

