
public class Base_Conversion {
    public static void main(String args[]){
        String s=Decimal_to_Binary(233,"");
        System.out.println(s);
    }
    public static String Decimal_to_Binary(int no,String s) {
        if(no==0)
        return s;
        s=no%2+s;
        return Decimal_to_Binary(no/2, s);
    }

}
