public class reverse {
    public static void main(String args[]) {
        String s="abccba";
        int j=s.length()-1;
        boolean flag=true;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(j--)){
            System.out.println("No");
            flag=false;
            break;
        }
    }
        if(flag)
        System.out.println("Yes");
    }
}
