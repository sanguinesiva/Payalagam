package programing;

public class L4 {
    public static void main(String[] args) {
        L4 loop = new L4();
        loop.swap(124, 112);
//        loop.swap_without_third(154,356);
//        loop.fibonaaccidemo(0);
//        loop.fibonacci();

    }

    private void swap_without_third(int ch1, int ch2) {
        // TODO Auto-generated method stub
        System.out.println("Before Swapping: ");
        System.out.println(ch1 + " " + ch2);
        ch2 = ch2 + ch1; // ch2 = 300
        ch1 = ch2 - ch1; // ch1 = 200;
        ch2 = ch2 - ch1; // ch2 = 100;
        System.out.println("After Swapping: ");
        System.out.println(ch1 + " " + ch2);
    }

    private void swap(int no3, int no4) {
        System.out.println("before swapping ");
        System.out.println(no3 + "" + no4);

        no3 = no4 + no3;
        no4 = no4 - no3;
        no4 = no4 - no3;

        System.out.println("after swpping ");
        System.out.println(no3 + "" + no4);

    }

    private void fibonacci() {
        // TODO Auto-generated method stub
        int first = 0, second = 1;
        while (first <= 13) {
            System.out.println(first);
            int third = first + second;

            first = second;
            second = third;

        }

    }

    public void fibonaaccidemo(int no) {
        int first_no = 0;
        int second_no = 1;
        System.out.println(first_no);
        System.out.println(second_no);
        while (first_no <= no) {
            int third_no = first_no + second_no;
            System.out.println(third_no);
            first_no = second_no;
            second_no = third_no;

        }
    }
}
