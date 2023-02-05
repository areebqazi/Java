package Recursion;

public class sum {
    public static void main(String args[]){
    System.out.println(add(5));
    }
    public static int add(int no){
        if(no==1)
        return 1;
        
        return no+add(no-1);
    }
}
