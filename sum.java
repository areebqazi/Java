public class sum{
    public static void main(String args[]){
        System.out.println(sum(5));
    }
    static int sum(int no){
        if(no==1)
        return 1;
        return no+sum(no-1);
    }
}