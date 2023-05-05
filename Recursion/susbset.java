// Iteartion

import java.util.*;
public class susbset {
    public static void main(String[] args) {
        int ar[]={1,2,3};
        List<List<Integer>>a= sub(ar);
        for(List<Integer>b:a){
            System.out.println(b);
        }
    }
    public static List<List<Integer>> sub(int arr[]){
         List<List<Integer>>outer=new ArrayList<>();
         outer.add(new ArrayList<>());
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<outer.size();j++){
                List<Integer>inner=new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
         }
         return outer;
    }
}
