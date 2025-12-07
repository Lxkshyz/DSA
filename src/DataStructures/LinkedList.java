package DataStructures;


public class LinkedList<E>{
    class Node{
        E data;
        Node next;
        Node(E val){
            this.data = val;
            this.next = null;
        }
        Node(E val, Node newNode){
            this.data = val;
            this.next = newNode;
        }
    }

    private Node head;
    private Node tail;
    private int size;
    public LinkedList(){
        this.size = 0;
        this.head = null;
        this.tail = null;
    }


    public int getSize(){
        return this.size;
    }
    public E getHead(){
        return this.head == null ? null : this.head.data;
    }
    public E getTail(){
        return this.tail == null ? null : this.tail.data;
    }
    public void add(E data){
        Node newNode = new Node(data);
        if(this.size == 0){
            this.head = newNode;
            this.tail = newNode;
            this.size++;
        }
        else{
            this.tail.next = newNode;
            this.tail = newNode;
            this.size++;
        }
    }
    public void insert(int index, E data) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("Invalid index !");
        }
        if (index == 0) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            if (this.size == 0) {
                tail = newNode;
            }
            this.size++;
            return;
        }
        if (index == this.size) {
            add(data);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        if (newNode.next == null) {
            tail = newNode;
        }
    }
    public void delete() {
        if (size == 0) {
            return;
        }
        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
            return;
        }
        Node prevNode = head;
        for (int i = 0; i < size - 2; i++) {
            prevNode = prevNode.next;
        }
        tail = prevNode;
        tail.next = null;
        size--;
    }

    private Node find(int index){
        if (this.head == null){
            return null;
        }
        if (size == 1){
            return this.head;
        }
        Node temp = this.head;
        for (int i = 0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void deleteAt(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }

        Node prev = find(index - 1);
        Node toDelete = prev.next;
        prev.next = toDelete.next;
        size--;
        if (prev.next == null) {
            tail = prev;
        }
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "Null";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node temp = head;
        while (temp != null) {
            sb.append(temp.data).append(" -> ");
            temp = temp.next;
        }
        sb.append("NULL");
        sb.append("]");
        return sb.toString();
    }
}

