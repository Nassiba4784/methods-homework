package methods_task1;

public class PositiveNegative {
    //print positive or negative number:
    public void getpostvnegative(int a){
        if (a > 0){
            System.out.println(a+ "is positive number");
        }else {
            System.out.println(a+ "a is a negative number");
        }
    }
    public static void main(String[]args){
        PositiveNegative positiveNegative = new PositiveNegative();
       positiveNegative.getpostvnegative(-54);
    }
}

