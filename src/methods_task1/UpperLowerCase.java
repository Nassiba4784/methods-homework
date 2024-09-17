package methods_task1;

public class UpperLowerCase {
    // check the character if it's uppercase or lowercase:
    public void checkcaseAa(char a){
        if (a >= 'A' && a <= 'Z') {
            System.out.println(a+ " is uppercase");
        }else if (a >= 'a' && a <= 'z'){
            System.out.println(a+ " is lowercase");
        }
    }
    public static void main(String[]args){
        UpperLowerCase upperLowerCase = new UpperLowerCase();
        upperLowerCase.checkcaseAa('C');

    }
}

