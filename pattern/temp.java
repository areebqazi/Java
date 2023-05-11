class Solution {
    public int[] colorTheArray(int n, int[][] queries) {
        int result[]= new int[queries.length];
        int arr[]=new int[n];
        int count=0;
        for(int i=0;i<queries.length;i++){
            int index=queries[i][0];
            int color=queries[i][1];
            
            if((index+1<arr.length && arr[index+1]==color) || (index-1>=0 && arr[index-1]==color))
                count--;
            
            
            arr[queries[i][0]]=color;
            
            for(int x:arr)
                System.out.print(x+"  ");
            
            
            if((index-1>=0 && arr[index-1]==color) || (index+1<arr.length && arr[index+1]==color))
                count++;
            
            
            result[i]=count;
            System.out.println();
        }
        return result;
    }
}