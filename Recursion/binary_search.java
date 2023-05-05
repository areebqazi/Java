
public class binary_search {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println(binary(arr,0,arr.length-1,7));
    }
    public static int binary(int arr[],int left,int right,int target){
        if(left>right)
        return -1;
        int mid=(left+right)/2;
        if(arr[mid]==target)
        return mid;
        if(target<arr[mid])
        return binary(arr, left, mid-1, target);
        else
        return binary(arr, mid+1, right, target);
    }
}
