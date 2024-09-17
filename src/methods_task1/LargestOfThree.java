package methods_task1;

public class LargestOfThree {
    //largest amount among three number:
    public int findlargest(int a, int b, int c) {
        if (a > b && a > c)
            return a; // a is the largest:
        else if ( b > a && b > c) {
            return b; // b is the largest:
        } else {
            return c; // c is the largest:
        }
    }
    public static void main (String[]args){
        LargestOfThree largestofthree = new LargestOfThree();
        System.out.println(largestofthree.findlargest(89, 39, 115));
    }
}
