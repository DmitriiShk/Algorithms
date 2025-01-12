package Recursion;

public class CountUp {

    public static void main(String[] args) {

        countUp(0, 10);
    }

    public static void countUp(int current, int target){
        if(current>target) return;
        System.out.print(current + " ");
        countUp(current+1, target);
    }
}
