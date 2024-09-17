package methods_task1;

public class VowelConsonant {
    // vowel or consonant character:
    public void checkvowel(char b){
        if (b == 'a' && b == 'o' && b == 'u' && b == 'e' && b == 'i'){
            System.out.println("b is a vowel");
        } else {
            System.out.println("b is a consonant");
        }
    }
    public static void main(String[]args){
        VowelConsonant vowelConsonant = new VowelConsonant();
        vowelConsonant.checkvowel( 'u');
    }
}

