package Recursion;

public class Countdown {

    public static void main(String[] args) {

        countdown(10);

    }

    public static void countdown(int n){
        if(n<0) return;
        System.out.print(n + " ");
        countdown(n-1);
    }

}
