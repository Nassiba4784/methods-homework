package fazia;
// Write a program to check whether a number is divisible by 5 and 11 or not
public class DivisibleByFiveAndEleven {
    public boolean isDivisible(int num) {
        if (num % 5 == 0 && num % 11 == 0) {
            return true;

        } else {
            return false;
        }

    }
        public static void main (String[]args){
            DivisibleByFiveAndEleven divisibleByFiveAndEleven = new DivisibleByFiveAndEleven();
            System.out.println(divisibleByFiveAndEleven.isDivisible(55));



        }
    }

