//recursion
package Recursion;

import java.util.ArrayList;
import java.util.*;

public class subset1 {
    public static void main(String[] args) {
        List<Integer>result=new ArrayList<>();
        int arr[]={3,2,1};
        subset(0,result,arr,arr.length);
    }
    public static void subset(int index,List<Integer>result,int arr[],int n){
        if(index==n){
            System.out.println(result);
            return;
        }
        result.add(arr[index]);
        subset(index+1,result, arr, n);
        result.remove(result.size()-1);
        subset(index+1,result,arr,n);
    }
}
