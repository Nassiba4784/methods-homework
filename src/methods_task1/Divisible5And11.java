package methods_task1;

public class Divisible5And11 {
    // divible number by 5 and 11:
    public void devide5and11(int a) {
        if (a % 5 == 0 && a % 11 == 0) {
            System.out.println(a + "a divisible by 5 and 11");

        } else {
            System.out.println("a is not divisible by 5 and 11");
        }
    }

    public static void main(String[] args) {
        Divisible5And11 divisible5And11 = new Divisible5And11();
        divisible5And11.devide5and11(105);
    }
}

