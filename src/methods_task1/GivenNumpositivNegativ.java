package methods_task1;

public class GivenNumpositivNegativ {
    // check the given number positive or negative
        public int getpostivenegative(int a) {
            if (a > 0) {
                System.out.println( a + "is positive");
            } else {
                System.out.println(a + "is negative");
            }
            return a;
        }
        public static void main(String[] args) {
           GivenNumpositivNegativ givenNumpositivNegativ = new GivenNumpositivNegativ();
            System.out.println(givenNumpositivNegativ.getpostivenegative(10));

        }
    }

