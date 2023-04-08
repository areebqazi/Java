public class temp {
    public static void main(String[] args) {
        int no=143232;
        System.out.println(palin(no));
    }
    public static boolean palin(int no){
        return no==rev(no);
    }
    public static int rev(int no){
        return helper(no,0);
    }
    public static int helper(int no,int rev){
        if(no==0)
        return rev;
        return helper(no/10,rev*10+no%10);
    }
}
