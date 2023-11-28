import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class practice3{
    Node head;
    practice3(){
        head = null;
    }

 void insert(int data){
    Node current = head;
    Node newNode = new Node(data);
     if(head == null){
        head = newNode;
     }else{
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
     }
 }

 void display(){
    Node current = head;
    System.out.print("Linked list is : ");
    while (current != null) {
        System.out.print(current.data+" ");
        current=current.next;
    }System.out.println();
 }

 void insertAtFirst(int data){
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
 }

 void insertAtLast(int data){
     Node newNode = new Node(data);
     Node current = head;
 if (head== null) {
     head = newNode;
 }else{
     while (current.next!=null) {
        current = current.next;
     }
     current.next = newNode;
 }
}

    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
          practice3 p = new practice3();
          p.insertAtFirst(4);

         System.out.println("how much node you want! ");
            int n = sc.nextInt();
          for (int i = sc.nextInt(); i < n; sc.nextInt()) {
             p.insert(i);
          }
        //   p.insert(1);
        //   p.insert(2);
        //   p.insert(3);
           p.insertAtLast(6);
          p.display();
    }
}