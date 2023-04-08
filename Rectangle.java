class ak
{
    static int lenght;
    static int breath;
    static int a;
     ak(int l, int b) {
        lenght = l;
        breath = b;
    }
    public int area()
    {
       a=lenght*breath;
        return a;
    }
}

public class Rectangle {
    public static void main(String args[]) {
        int d,e;
        ak obj = new ak(4,5);
        ak  sc = new ak(7,8);
        d= obj.area();
        e = sc.area();
        System.out.println("The area of Rectangle is"+d);
        System.out.println("The area of Rectangle is"+e);}}