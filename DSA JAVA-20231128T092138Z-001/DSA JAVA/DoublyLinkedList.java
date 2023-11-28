 class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }


public class DoublyLinkedList {

    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }
  // insert the element in the linked list 
   public void insert(int data) {
    Node newNode = new Node(data);
    newNode.prev = tail;
    if (head ==null) {
        head = newNode;
    }
    if (tail!=null) {
        tail.next = newNode;
    }
    tail = newNode;
    }

    // Inserts a new node at the beginning of the list.
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (tail == null) {
            tail = newNode;
        } 
        if (head!=null) {
            head.prev = newNode;
        }
        head = newNode;
    }
   

    // Inserts a new node at the end of the list.
    public void insertLast(int data) {
      Node newNode = new Node(data);
      newNode.prev = tail;
      if (head == null) {
         head = newNode;
      }
      if (tail!=null) {
        tail.next =newNode;
      }
     tail = newNode;
    }

    // Inserts a new node after the given node.
    public void insertAfter(Node node, int data) {
        Node newNode = new Node(data);
        newNode.next = node.next;
        node.next = newNode;
        newNode.prev = node;
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
    }

    // Deletes the first node from the list.
    public void deleteFirst() {
       if (head == null) {
          return;
       }
       Node newHead = head.next;
       if (newHead!=null) {
           newHead.prev = null;
       }
       head = newHead;
    }
    // Deletes the last node from the list.
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

    // Displays the contents of the list.
    public void display() {
      Node current = head;
      System.out.print("linked list is: ");
      while (current!=null) {
          System.out.print(current.data+" ");
          current = current.next;
      }
      System.out.println();
    }

    // A node in a doubly linked list.
   

    public static void main(String args[]){
        DoublyLinkedList list = new DoublyLinkedList();

list.insertFirst(5);
list.insert(1);
list.insert(2);
list.insert(3);
list.insertLast(4);

// Display the contents of the list.
list.display();

// Delete the first node from the list.
list.deleteFirst();
list.deleteLast();

// Display the contents of the list again.
list.display();

}
}