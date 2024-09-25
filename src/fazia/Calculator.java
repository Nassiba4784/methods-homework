package fazia;

public class Calculator {

    public void getCalculation(int num1, int num2, char ch) {

        int a = num1;
        int b= num2;
        switch (ch) {
            case ('+'):
                System.out.println(a + b);
                break;
            case ('-'):
                System.out.println(a - b);
                break;
            case ('*'):
                System.out.println(a * b);
                break;
            case ('/'):
                System.out.println(a / b);
                break;
            case ('%'):
                System.out.println(a % b);
                break;
            default:
                System.out.println(" invalid operator");

        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.getCalculation( 8,5,'-');
    }
}
