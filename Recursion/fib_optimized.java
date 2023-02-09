package Recursion;
import java.util.*;

public class fib_optimized {
    static HashMap<Long ,Long>map=new HashMap<>();
    public static void main(String args[]){
        map.put((long)0,(long)1);
        map.put((long)1,(long)1);
        System.out.println(fib(200));
    }
    public static long fib(long no) {
        if(map.containsKey(no)){
            return map.get(no);
        }
        long result=fib(no-1)+fib(no-2);
        map.put(no,result);
        return result;
    }
}
