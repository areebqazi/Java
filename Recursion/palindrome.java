package Recursion;
public class palindrome {
        public static void main(String args[]){
            String s="aabbaa";
            System.out.println(rev(s));
        }
        public static boolean rev(String s){
            if(s.length()==0 || s.length()==1)
            return true;
            if(s.charAt(0)==s.charAt(s.length()-1)){
                return rev(s.substring(1,s.length()-1));
            }
            return false;
        }
    }
