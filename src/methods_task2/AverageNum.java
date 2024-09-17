package methods_task2;

public class AverageNum {
    public static void main(String[] args) {
        AverageNum averageNum = new AverageNum();
        int avg = averageNum.getavg(2, 8);
        System.out.println(avg + " ");
    }
    // get the average of all natural numbers between 2 and 8:
    public int getavg(int start, int end) {
        int sum = 0;
        int total = 7;
        for (int i = 2; i <= 8; i++) {
            sum = sum + i;
        }
        int avg = sum / 7;
        return avg;
    }
}

