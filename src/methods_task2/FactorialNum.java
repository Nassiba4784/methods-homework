package methods_task2;

public class FactorialNum {
    // find the factorial of given number:
    public int getfactorial(int i){
        int fact = 1;
        int num = 15;
        for (i = 1; i <=15; i++){
            fact = fact * i;
        }return fact;
    }
    public static void main(String[]args){
        FactorialNum factorialNum = new FactorialNum();
        int fact = factorialNum.getfactorial(15);
        System.out.println(fact);
    }
}

