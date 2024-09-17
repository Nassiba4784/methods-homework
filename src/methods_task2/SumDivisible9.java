package methods_task2;

public class SumDivisible9 {
    // print numbers and sum between 100 & 200:
    public void getsumdiv9(int start, int end) {
        int sum = 0;
        int i;
        for (i = 100; i <= 200; i++) {
            if (i % 9 == 0) {
                sum = 1 + sum;
                System.out.println(i+ " ");
            }
        }
    }
    public static void main(String[]args){
        SumDivisible9 sumDivisible9 = new SumDivisible9();
        sumDivisible9.getsumdiv9(100, 200);

    }
}


