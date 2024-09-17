package methods_task1;

public class Multiple5 {
    // check given intiger is multiple 5:
    public void checkmultipe5(int a ){
        if (a % 5 == 0){
            System.out.println(a+"a is multiple 5");
        }else {
            System.out.println(a+ "a is not multiple 5");
        }
    }
    public static void main(String[]args){
        Multiple5 multiple5 = new Multiple5();
        multiple5.checkmultipe5(105);
    }
}

