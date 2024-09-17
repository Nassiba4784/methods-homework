package methods_task2;

public class OddNumber {
    // display odd number from 0-20:
    public void displayodd(int i){
        for (i = 0; i <=20; i++)
            if (i % 2 == 1){
                System.out.println(i+" ");
            }
    }
    public static void main(String[]args){
        OddNumber oddNumber = new OddNumber();
        oddNumber.displayodd(5);
    }
}

