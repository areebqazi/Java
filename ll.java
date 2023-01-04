class ll {


  //dhsd
  Node head;
  private int size;

  ll() {
    this.size = 0;
  }

  class Node {

    String data;
    Node next;

    Node(String str) {
      this.data = str;
      this.next = null;
      size++;
    }
  }

  // Add First

  void addFirst(String s) {
    Node n = new Node(s);
    if (head == null) {
      head = n;
      return;
    }
    n.next = head;
    head = n;
  }

  // Add At Middle

  void addMiddle(int index, String s) {
    Node n = new Node(s);
    if (head == null) {
      head = n;
      return;
    }
    Node currNode = head;
    while (index != 1) {
      currNode = currNode.next;
      index--;
    }
    n.next = currNode.next;
    currNode.next = n;
  }

  // Add Last

  void addLast(String s) {
    Node n = new Node(s);
    if (head == null) {
      head = n;
      return;
    }
    Node currNode = head;
    while (currNode.next != null) {
      currNode = currNode.next;
    }
    currNode.next = n;
  }

  // Delete First

  void deleteFirst() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    size--;
    head = head.next;
  }

  // Delete Last

  void deleteLast() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    size--;
    if (head.next == null) {
      head = null;
      return;
    }
    Node secondLast = head;
    Node lastNode = head.next;
    while (lastNode.next != null) {
      secondLast = secondLast.next;
      lastNode = lastNode.next;
    }
    secondLast.next = null;
  }

  // Delete At Miidle

  void deleteMiddle(int index) {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    Node currNode = head;

    if(index==0){
      head=currNode.next;
      return;
    }
    while (index != 1) {
      currNode = currNode.next;
      index--;
    }
    Node temp = currNode.next.next;
    currNode.next = temp;
  }

  // Print

  void print() {
    Node currNode = head;
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    while (currNode != null) {
      System.out.print(currNode.data + " -> ");
      currNode = currNode.next;
    }
    System.out.println("Null");
  }

  // Size

  int getSize() {
    return size;
  }

  // Data in a Node

  String data_Node(int positionFromTail){
    int size=0;
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
        size++;
    }
    temp=head;
    size-=positionFromTail;
    while(size!=0){
        temp=temp.next;
        size--;
    }
    return temp.data;
  }

  public static void main(String args[]) {
    ll linked_list = new ll();
    linked_list.addFirst("areeb");
    linked_list.addLast("aaaa");
    linked_list.addLast("fvfv");
    linked_list.addLast("cshdewjf");
    linked_list.addFirst("sfef");
    linked_list.print();
    linked_list.deleteFirst();
    linked_list.print();
    linked_list.deleteLast();
    linked_list.print();
    System.out.println(linked_list.getSize());
    linked_list.addFirst("HELLO");
    linked_list.print();
    System.out.println(linked_list.getSize());
    linked_list.addMiddle(2, "uuuuuuuuuuuuuuuuuuu");
    linked_list.print();
    linked_list.deleteMiddle(0);
    linked_list.print();
    System.out.println(linked_list.data_Node(1));

  }
}
