package methods_task2;

public class Alphabet {
    public char printalpha(char i){
        for (i= 'a'; i<='z'; i++) {
            System.out.println(i+"  ");
        } return i;
    }
    public static void main(String[]args){
        Alphabet alphabet = new Alphabet();
        alphabet.printalpha('b');
    }
}

