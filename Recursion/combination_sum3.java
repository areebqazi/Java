package Recursion;
import java.util.*;
public class combination_sum3 {
    static List<List<Integer>>ans=new ArrayList<>();
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        List<Integer>temp=new ArrayList<>();
        sum(0,45,9,arr,temp,0);
        for(List<Integer>a:ans)
        System.out.println(a);
    }
    public static void sum(int index,int target ,int k ,int arr[],List<Integer>result,int count){
        if(target==0 && count==k){
            ans.add(new ArrayList<>(result));
            return;
        }
        for(int i=index;i<arr.length;i++){
            if(arr[i]>target) break;
            result.add(arr[i]);
            System.out.println(arr[i]);
            sum(i+1,target-arr[i],k,arr,result,count+1);
            result.remove(result.size()-1);
        }
    }
}