package DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() { // Constructor
        head = null;
        tail = null;
        size = 0;
    }

    class Node {
        private Object data;
        private Node next;
        private Node prev;

        private Node(Object val){
            this.data = val;
            this.next = null;
            this.prev = null;
        }

        public String toString(){
            return String.valueOf(this.data);
        }
    }

    public void addFirst(){

    }

    public void addlast(){
        Node newNode = new Node(val);



    }

    public void add(){

    }

    public void deleteFirst(){

    }

    public void deleteLast(){

    }

    public void delete(){

    }

    public int get(){

    }

    public int size(){
        return size;
    }


}
