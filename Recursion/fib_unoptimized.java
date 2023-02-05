package Recursion;

public class fib_unoptimized {
    public static void main(String args[]){
        System.out.println(fib(45));
    }
    public static int fib(long no) {
        if(no==0 || no==1)
        return 1;
        return fib(no-1)+fib(no-2);
    }
}
