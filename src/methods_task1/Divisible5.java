package methods_task1;

public class Divisible5 {
    // check divisible number by 5:
    public void devide5(int a, int b) {
        if (a % 5 == 0) {
            System.out.println(a + "is divisible by 5");
        } else {
            System.out.println(a + "is not divisible by 5");
        }
    }

    public static void main(String[] args) {
        Divisible5 divisible5 = new Divisible5();
        divisible5.devide5(46, 5);
    }
}

