package programing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Exception ex = new Exception();
       ex.second();
      ex.first();

    }
    private void second(){

    }
    private void first() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        try
        {
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
            int[] ar = new int[no2];
            System.out.println(ar.length);

            System.out.println(no1/no2);

        }
        catch(ArithmeticException ae)
        {
            System.out.println("Please check no2");
        }
        catch(InputMismatchException ime){
            System.out.println("pleasecheck the input");
        }
        catch(NegativeArraySizeException neg){
            System.out.println(" please check the array length ");
        }
        finally
        {
            System.out.println("finally block");
        }
        System.out.println("Hello");
    }


}
/*try catch finally throw throws*/