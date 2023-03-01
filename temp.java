public class temp{
    public static void main(String args[]) {
        recur(9);
    }
    public static void recur(int no){
        if(no==0)
        return;
        System.out.println(no);
        recur(no-1);
    }
}