package methods_task2;

public class DivisibleNumber {
    // print numbers divisible by 3 & 5 from 0-100:
    public void printnumber(int a, int z) {
        for (a = 0; a <= 100; a++)
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println(a);
            }
    }
    public static void main(String[]args){
        DivisibleNumber divisibleNumber = new DivisibleNumber();
        divisibleNumber.printnumber(0,99);
    }
}

