package methods_task1;
// largest number:

public class LargestNumber {
        public int getLargest(int a, int b) {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        }
        public static void main(String[] args){
            LargestNumber largestNumber = new LargestNumber();
            System.out.println(largestNumber.getLargest(10,7));
        }
    }


