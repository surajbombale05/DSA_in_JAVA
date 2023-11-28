import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Doubly {
    Node head;
    Node tail;

    Doubly() {
        head = null;
        tail = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.prev = tail;
        if (head == null) {
            head = newNode;
        }
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (tail == null) {
            tail = newNode;
        }
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        newNode.prev = tail;
        if (head == null) {
            head = newNode;
        }
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        Node newHead = head.next;
        if (newHead != null) {
            newHead.prev = null;
        }
        head = newHead;
    }

    public void deleteLast() {
      if(tail==null){
        return;
      }
      Node newTail = tail.prev;
      if (newTail!=null) {
          newTail.next = null;
      }
      tail = newTail;
    }

     //display
    public void display() {
        Node current = head;
        System.out.print("this is lilnked list: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        Doubly d = new Doubly();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of node : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("enter " + (i + 1) + " node");
            int data = sc.nextInt();
            d.insert(data);
        }
        d.display();

        System.out.println("enter the node data for insert first: ");
        int f = sc.nextInt();
        d.insertFirst(f);
        System.out.println("enter the node data for insert last: ");
        int ff = sc.nextInt();
        d.insertLast(ff);
        d.display();

        d.deleteFirst();
        d.deleteLast();
        d.display();

    }
}