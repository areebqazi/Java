public class back{
    public static void main(String args[]){
        String s="ABC"; 
        print(s,"",0);
    }
    public static void print(String s,String perm,int ind){
        if(s.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<s.length();i++){
            char currChar=s.charAt(i);
            String str = s.substring(0,i)+s.substring(i+1);
            print(str,perm+currChar,ind+1);
        }
    }
}