import java.util.*;
public class candies {
    static String ans;
    static int c=0;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test_case=sc.nextInt();
        int arr[]=new int[test_case];

        for(int i=0;i<test_case;i++){
            arr[i]=sc.nextInt();
        }
        for(int no:arr){
        ans="";
        find(3,1,no,"2 ");
        if(ans.length()>1){
            System.out.println(c);
            System.out.println(ans);
        }
        else{
            System.out.println(-1);
        }
        }
        sc.close();
    }
    public static int find(int no,int count,int find,String path){
        if(no==find){
            ans=new String(path);
            c=count;
            return find;
        }
        if(count>40 || no>find || no==-1){
            return -1;
        }
        int a =  find(2*no+1,count+1,find,path+"2 ");
        int b =  find(2*no-1,count+1,find,path+"1 ");
        if(a==find)
        return a;
        if(b==find)
        return b;
        return -1;
    }
}
