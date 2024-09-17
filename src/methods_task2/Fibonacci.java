package methods_task2;

public class Fibonacci {
    // print fibonacci serries:
    public int printfib(int limit) {
        int n = 0;
        int n1 = 1;
        while( n <= limit){
            System.out.println(n+" ");
            int next = n + n1;
            n = n1; n1 = next;

        }return limit;
    }
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int limit = fibonacci.printfib(10);
    }
}

