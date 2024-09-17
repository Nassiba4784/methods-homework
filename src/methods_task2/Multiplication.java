package methods_task2;

public class Multiplication {
    // multiplication of natural numbers between 1 and 10:
    public int findmul(int s, int e){
        int mul = 1;
        for ( int i = 1; i<=10; i++){
            mul = mul * i;
        }return mul;
    }
    public static void main(String[]args){
        Multiplication multiplication = new Multiplication();
        int mul = multiplication.findmul(1, 10);
        System.out.println(mul+" ");
    }
}

