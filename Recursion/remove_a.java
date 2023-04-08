package Recursion;

import javax.swing.RepaintManager;

public class remove_a {
    public static void main(String[] args) {
        String s="abacad";
        System.out.println(remove(s,""));
        System.out.println(remove1(s));        
    }
    public static String remove(String s , String result){
        if(s.equals(""))
        return result;
        char k =s.charAt(0);
        if(k!='a')
        return remove(s.substring(1),result+k);
        else
        return remove(s.substring(1), result);
    }
    public static String remove1(String s){
        if(s.equals(""))
        return "";
        char ch=s.charAt(0);
        if(ch=='a')
        return remove1(s.substring(1));
        else
        return ch+remove1(s.substring(1));
    }
}
