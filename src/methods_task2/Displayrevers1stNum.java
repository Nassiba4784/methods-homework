package methods_task2;

public class Displayrevers1stNum {
    //display 10 first natural numbers in reverse:
    public void desreversnum(int a) {
        for (a = 10; a >= 1; a--) {
            System.out.println(a + " ");
        }
    }
    public static void main(String[] args) {
        Displayrevers1stNum displayFirstNum = new Displayrevers1stNum();
        displayFirstNum.desreversnum(10 );
    }
}

