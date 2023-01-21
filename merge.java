public class merge{
    public static void conquer(int arr[],int s,int mid,int e){
        int merged[]=new int[e-s+1];
        int i1=s;
        int i2=mid+1;
        int x=0;
        while(i1<=mid && i2<=e){
            if(arr[i1]<arr[i2]){
                merged[x++]=arr[i1++];
            } else{
                merged[x++]=arr[i2++];
            }
        }
        while(i1<=mid){
            merged[x++]=arr[i1++];
        }
        while(i2<=e){
            merged[x++]=arr[i2++];
        }
        for(int i=0,j=s;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }
    public static void divide(int arr[],int s,int e){
        if(s>=e)
        return ;
        int mid =(s+e)/2;
        divide(arr,s,mid);
        divide(arr,mid+1,e);
        conquer(arr,s,mid,e);
    }
    public static void main(String args[]){
         int arr[]={4,3,4,456,465,4,6,45,654,6,546,5,3,9,6,8};
         divide(arr,0,arr.length-1);
         for(int i:arr)
         System.out.print(i+" ");
    }
}