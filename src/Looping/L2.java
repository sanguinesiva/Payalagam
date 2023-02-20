package Looping;

public class L2 {
    int prime_count;
    public static void main(String[] args) {
        L2 Loop = new L2();

Loop.findprime();

    }
    private void findprime() {
//        private void find_prime_from_first20 () {
            // TODO Auto-generated method stub
            //LearnLooping2 ll = new LearnLooping2();
            int no = 2; //no = 2 prime_count=2
            while (prime_count < 20) //1 < 20
            {
                int div = 2;
                int count = 0;
                while (div < no) {
                    if (no % div == 0) {
                        count = count + 1;
                        break;

                    }
                    div = div + 1; //2 to 99

                }
                if (count == 0) {
                    System.out.println(no + " is Prime ");
                    prime_count = prime_count + 1;
                }//4
                no = no + 1; //5
            }

        }



    }