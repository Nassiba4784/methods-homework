package methods_task1;

public class EvenOdd {
    // get even and odd number:
    public void getevenodd(int a) {
        if (a % 2 == 0) {
            System.out.println("a is even number");
        } else {
            System.out.println("a is odd number");
        }
    }
    public static void main(String[] args){
        EvenOdd evenOdd = new EvenOdd();
        evenOdd.getevenodd(20);

    }
}
