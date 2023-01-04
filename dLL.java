public class dLL{
    node head;
    node tail;
    class node{
        int data;
        node next;
        node prev;
        node(int no){
            data=no;
            next=null;
            prev=null;
        }
    }
    void add(int no){
        node n=new node(no);
        if(head==null){
             head=n;
             tail=n;
             head.prev=null;
             tail.next=null;
             return;
        }
        tail.next=n;
        n.prev=tail;
        tail=n;
        tail.next=null;
    }
    void print(){
        node n=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        while(n!=null){
            System.out.print(n.data+" -> <-");
            n=n.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]) {
        dLL d=new dLL();
        d.add(12);
        d.add(13);
        d.add(14);
        d.print();
    }
}