package methods_task1;

public class AlphaChar {
    // print alphabet character:
    public boolean findalphabet(char i) {
        if (i >= 'a' && i <= 'z') {
            boolean c = true;
            return true;
        } else {
            return false;
        }
    }
    public static void main (String[]args){
        AlphaChar alphaChar = new AlphaChar();
        System.out.println(alphaChar.findalphabet('m'));

    }
}

