

class LL {

    class node {
        String data;
        node next;

        node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    node head;

    public void firstAdd(String data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;

    }
    //add element in last 

    public static void main(String[] args) {
        LL list = new LL();
        list.firstAdd("a");
        list.firstAdd("i am");
    }
}





