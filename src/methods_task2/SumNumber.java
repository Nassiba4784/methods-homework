package methods_task2;

public class SumNumber {
    // find of natural numbers between 1 and 10:
    public int findsum1(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[]args){
        SumNumber sumNumber = new SumNumber();
        int i = sumNumber.findsum1(1,10);
        System.out.println(i);

    }
}

