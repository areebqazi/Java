package pattern;
 import java.util.*;
public class Pattern {
    
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int no=s.nextInt();
        int a[][]=new int[2*no-1][2*no-1] ;
        int m=0;int n=a.length-1;
        int nn=no;
        for(int k=1;k<=no;k++){
               for(int i=m;i<a.length-m;i++){
                for(int j=m;j<a.length-m;j++){
                    if(i==m||i==n||j==m || j==n)
                    a[i][j]=nn;
                }
               }
               m++;
               n--;
              nn--;
            }
            
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
            }
        s.close();
    }
}
        
