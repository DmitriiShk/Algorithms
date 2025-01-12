package Recursion;

public class Factorial {

    public static void main(String[] args) {


        int result = factorial(7);
        System.out.println("Factorial is " + result);

    }

    public static int factorial(int n){
        if(n==1) return 1;
        else return n*factorial(n-1);
    }

}
