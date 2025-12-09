package DataStructures.LinkedList;

public class DoublyLinkedList<E> {
    private Node Head;
    private Node Tail;
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
            for (int i = size - 1; i>index; i--){
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
