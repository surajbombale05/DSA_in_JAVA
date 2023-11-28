class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class practice2 {
    Node head;

    practice2() {
        head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        Node current = head;

        if (head == null) {
            head = newNode;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

    }

    public int search(int target) {
        Node current = head;
        int position = 0;
        while (current != null) {
            if (current.data == target) {
                return position;
            }
            current = current.next;
            position++;
        }

        return -1;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
       Node newNode = new Node(data);
       Node current = head ;
       if(head==null){
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
        
    }

    public void display() {
        Node current = head;
        if (head == null) {
            return;
        }
        System.out.print("Linked List is: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

    }

    public static void main(String ars[]) {
        practice2 p = new practice2();

        p.addFirst(4);

        p.insert(1);
        p.insert(2);
        p.insert(3);
        p.addLast(45);

        p.display();

        int targetKey = 3;
        int position = p.search(targetKey);

        if (position != -1) {
            System.out.println("element founded at " + position + " position");
        } else {
            System.out.println("element not founded ");
        }
    }
}
