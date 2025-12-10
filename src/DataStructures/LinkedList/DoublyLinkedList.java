package DataStructures.LinkedList;

public class DoublyLinkedList<E> {
    private Node Head;
    private Node Tail;
    public E getHead(){
        return this.Head == null ? null : this.Head.data;
    }
    public E getTail(){
        return this.Tail == null ? null : this.Tail.data;
    }
    private int size;
    private class Node{
        Node prev;
        E data;
        Node next;
        Node(E value){
            this.data = value;
            this.next = null;
        }
        Node(E value, Node nextNode){
            this.data = value;
            this.next = nextNode;
        }
        Node(Node prevNode, E value){
            this.prev = prevNode;
            this.data = value;
        }
        Node(Node prevNode, E value, Node nextNode){
            this.prev = prevNode;
            this.data = value;
            this.next = nextNode;
        }
    }
    public void add(E value){
        Node newNode = new Node(value);
        if (this.Head == null){
            this.Head = newNode;
            this.Tail = this.Head;
            this.size++;
            return;
        }
        newNode.prev = this.Tail;
        this.Tail.next = newNode;
        this.Tail = newNode;
        this.size++;
    }
    public void insertAt(int index, E value){
        if (index < 0 || index > size){
            System.out.println("Error indexing !");
            return;
        }
        Node newNode = new Node(value);
        if (this.Head == null) {
            this.Head = newNode;
            this.Tail = this.Head;
            this.size++;
            return;
        }
        else if (index == 0){
            this.Head.prev = newNode;
            newNode.next = this.Head;
            this.Head = newNode;
            this.size++;
        }
        else if (index == size){
            newNode.prev = this.Tail;
            this.Tail.next = newNode;
            this.Tail = newNode;
            this.size++;
        }
        else if (index < size / 2){
            Node tempNode = this.Head;
            for (int i = 0; i<index; i++){
                tempNode = tempNode.next;
            }
            Node prevNode = tempNode.prev;
            prevNode.next = newNode;
            newNode.prev = prevNode;
            newNode.next = tempNode;
            tempNode.prev = newNode;
            this.size++;
            return;
        }
        else{
            Node tempNode = this.Tail;
            for (int i = this.size - 1; i > index; i--) {
                tempNode = tempNode.prev;
            }
            Node prevNode = tempNode.prev;
            prevNode.next = newNode;
            newNode.prev = prevNode;
            newNode.next = tempNode;
            tempNode.prev = newNode;
            this.size++;
        }
        return;
    }
    public void delete(){
        if (this.Head == null) return;
        if (this.Head == this.Tail){
            this.Head = null;
            this.Tail = null;
        }
        else {
            Node prevNode = this.Tail.prev;
            prevNode.next = null;
            this.Tail = prevNode;
        }
        this.size--;
    }
    public void deleteAt(int index){
        if (this.Head == null || 0 > index || index >= this.size){
            System.out.println("Error indexing !");
            return;
        }
        if (this.Head == this.Tail){
            this.Head = null;
            this.Tail = null;
        }
        else if (index == 0){
            Node nextNode = this.Head.next;
            nextNode.prev = null;
            this.Head = nextNode;
        }
        else if (index == this.size-1) {
            Node prevNode = this.Tail.prev;
            prevNode.next = null;
            this.Tail = prevNode;

        }
        else if (index == this.size / 2){
            Node tempNode = this.Head;
            for (int i = 0; i<index; i++){
                tempNode = tempNode.next;
            }
            Node nextNode = tempNode.next;
            Node prevNode = tempNode.prev;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
        }
        else{
            Node tempNode = this.Tail;
            for (int i = 0; i<size-1-index; i++){
                tempNode = tempNode.prev;
            }
            Node nextNode = tempNode.next;
            Node prevNode = tempNode.prev;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
        }
        this.size--;
    }
    @Override
    public String toString(){
        if (this.Head == null) return null;

        Node tempNode = this.Head;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (tempNode != null){
            sb.append(tempNode.data + "<->");
            tempNode = tempNode.next;
        }
        sb.append("NULL]");
        return sb.toString();
    }
    
}
