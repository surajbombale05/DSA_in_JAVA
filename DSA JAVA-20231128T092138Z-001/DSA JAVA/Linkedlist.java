
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linkedlist {
    Node head;

    Linkedlist() {
        head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        Node current = head;
        if (head == null) {
            head = newNode;
        }else{ 
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

    }

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtend(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {

            current = current.next;

        }
        current.next = newNode;

    }

    public void deleteLastElement() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;

        }
    }

    public void deleteFirstElement() {
        if (head != null) {
            head = head.next;
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

    public void display() {
        Node current = head;
        System.out.print("Linked List is :");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Linkedlist linked = new Linkedlist();

        linked.insertAtFirst(5);

        linked.insert(1);
        linked.insert(2);
        linked.insert(3);

        linked.insertAtend(7);

        linked.display();

        linked.deleteFirstElement();
        linked.display();

        int targetedEle = 3;
        int position = linked.search(targetedEle);

        if (position != -1) {
            System.out.println("element at founded at the position of : " + position);
        } else {
            System.out.println("element is not founded  : ");
        }

    }

}