package Recursion;
public class string_rev{
    public static void main(String args[]){
        String s="Areeb";
        System.out.println(rev(s));
    }
    public static String rev(String s){
        if(s.equals(""))
        return "";
        return rev(s.substring(1))+s.charAt(0);
    }
}