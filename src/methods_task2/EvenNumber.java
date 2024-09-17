package methods_task2;

public class EvenNumber {
    // display even number from 10-30:
    public void findevennum(int a, int e){
        for(a=10; a <=30; a++)
            if (a % 2 == 0){
                System.out.println(a+" , ");
            }
    }
    public static void main(String[]args){
        EvenNumber evenNumber = new EvenNumber();
        evenNumber.findevennum(14,30);
    }
}

