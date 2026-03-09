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

    public void addFirst(Object val){
        Node newNode = new Node(val);

        if (size == 0){
            head = newNode;
            tail = newNode;
            size++;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            size++;
        }

    }

    public void addLast(Object val){
        Node newNode = new Node(val);

        if (size == 0){
            addFirst(val);
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
            size++;
        }
    }

    public String toString(){
        if(head == null) {
            return "";
        }
        Node temp = head;
        String str = "[";
        while (temp.next != null){
            str += temp.data + " | ";
            temp = temp.next;
        }
        str += temp.data;
        return str + "]";
    }

    public void add(int index, Object val){
        if (index == 0){
            addFirst(val);
        }
        if (index == size){
            addLast(val);
        } else {
            Node temp1 = head;
            for (int i = 0; i < index;i++){
                temp1 = temp1.next;
            }

            Node temp2 = temp1.next;

            Node newNode = new Node(val);
            temp1.next = newNode;
            newNode.prev = temp1;
            newNode.next = temp2;
            temp2.prev = newNode;
            size++;
        }
    }

    public void deleteFirst(){
        if (size == 0){

        }
    }

    public void deleteLast(){

    }

    public void delete(){

    }

    public Object get(int index){
        Node n = head;
        for (int i=0; i < index; i++){
            n = n.next;
        }
        return n;
    }

    public int size(){
        return size;
    }


}
