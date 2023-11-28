import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class practice{
  Node head ;
      practice(){
        head = null;
      }
     
      public void insert(int data){
       Node newNode = new Node(data);
       Node current = head;
       if (head == null) {
           head = newNode;
       }
       else{
        while (current.next!=null) {
            current = current.next;
        }
        current.next = newNode;
       }
     }

     public void insertFirst(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
     }
     public void insertlast(int data){
        Node newNode = new Node(data);
        Node current = head;
        if (head==null) {
            head = newNode;
        }
        else{
          while (current.next!=null) {
              current = current.next;
          }
          current.next = newNode;
        }
     }

     public void deleteFirst(){
        if (head!=null) {
            head = head.next;
        }
     }
      
     public void deleteLast(){
        Node current = head;
        if (head==null ||  head.next==null) {
            head = null;
            return;
        }
        while (current.next.next!=null) {
            current = current.next;
        }
        current.next = null;
     }


     public void display(){
        Node current = head;
        System.out.print("this is linked list: ");
        while (current!=null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
     }

    public static void main(String args[]){
        practice p = new practice();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of node you want to add : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("enter "+(i+1)+" node");
             int data = sc.nextInt();
             p.insert(data);
        }
        p.display();
        System.out.println("enter the number for adding first element in linkedllist");
        int first = sc.nextInt();
        p.insertFirst(first);
         System.out.println("enter the number for adding last element in linkedllist");
         int last = sc.nextInt();
          p.insertlast(last);


         p.display();
        p.deleteFirst();
        p.deleteLast();
        p.display();

    }
}