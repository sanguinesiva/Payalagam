package Looping;

public class L1 {
    public static void main(String[] args) {
        L1 lo = new L1();
        lo.armstrong(153);
//		lo.find_palindrome(12321);
//            lo.find_armstrong(153);
//            int output= lo.find_power(4,5);
//           System.out.println(output);
//        lo.find_common_divisors(50, 65);
        lo.find_lcm(5,52);
    }
//    ======================================================
    private void find_lcm(int no1, int no2) {
        // TODO Auto-generated method stub
        int big = no1>no2? no1: no2;
        while(true)
        {
            if(big%no1 ==0 && big%no2==0)
            {
                System.out.println("LCM is " + big);
                break;
            }
            big = big + 1;
        }

    }
//    ======================================================
    private void find_common_divisors(int no1, int no2) {
        // TODO Auto-generated method stub
        int div = 2;
        // Ternary Operator
        int small = no1 < no2 ? no1 : no2;

//	if(no1<no2)
//	{
//	small = no1;
//	}
//	else
//	{
//	small = no2;
//	}
        int gcd = 0;
        while (div <= small) {
            if (no1 % div == 0 && no2 % div == 0) {

//System.out.println(div);
                gcd = div;
            }
            div = div + 1;
        }
        System.out.println("GCD is " + gcd);

    }

    private int find_power(int base, int power) {
        int result = 1;
        while (power > 0) {
            result = result * base;
            power = power - 1;
        }
        return result;
    }
//===========================================================
    private void find_palindrome(int plate1) {
        // TODO Auto-generated method stub
        int plate3 = plate1;
        int plate2 = 0; // 12345

        while (plate1 > 0) {
            int rem = plate1 % 10; // 4
            plate2 = (plate2 * 10) + rem;
            plate1 = plate1 / 10; // 1234
        }
        System.out.println(plate1);
        System.out.println(plate2);
        if (plate3 == plate2) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not Palindrome");
        }

    }
//==============================================================
    private void find_armstrong(int plate1) {
        // TODO Auto-generated method stub
        int plate3 = plate1;
        int plate2 = 0; // 12345

        while (plate1 > 0) {
            int rem = plate1 % 10; // 4
            plate2 = plate2 + (rem * rem * rem); // 27 + 125 + 1
            plate1 = plate1 / 10; // 1234
        }
        System.out.println("plate1 " + plate1);
        System.out.println("plate2 " + plate2);
        if (plate3 == plate2) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

    }
//=================================================================
    private void armstrong(int num) {
        int sum = 0;
        int count = 0;
        int sum1 = 1;
        int num1 = num;
        int num2 = num;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        int count1 = count;
        while (num1 > 0) {
            int rem = num1 % 10;
            while (count > 0) {
                sum1 = sum1 * rem;
                count--;
            }
            num1 = num1 / 10;
            sum = sum + sum1;
            sum1 = 1;
            count = count1;
        }
        System.out.println(sum);

        if (num2 == sum) {
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }
//    ==========================================================
}


