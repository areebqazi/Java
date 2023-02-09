public class rev {
    
    static Node head;  
    class Node {
        int data;
        Node next;
    
        Node(int no) {
          this.data =no;
          this.next = null;
        }
      }

        void addFirst(int no) {
            Node n = new Node(no);
            if (head == null) {
              head = n;
              return;
            }
            n.next = head;
            head = n;
          }

          public void print(Node head){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" => ");
                temp=temp.next;
            }
            System.out.println("null");
          }

          public static Node rev(Node head){
            if(head==null || head.next==null){
              return head;
            }
            Node p= rev(head.next);
            head.next.next=head;
            head.next=null;
            return p;
          }

    public static void main(String args[]){
         rev ll=new rev();
         ll.addFirst(1);
         ll.addFirst(2);
         ll.addFirst(3);
         ll.addFirst(4);
         ll.addFirst(5);
         ll.addFirst(6);
         ll.print(head);
         ll.print(rev(head));
    }   
}
