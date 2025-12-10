import DataStructures.LinkedList.SinglyLinkedList;
import DataStructures.LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args){
        // Linked List implementation
        SinglyLinkedList<Integer> Ll = new SinglyLinkedList<>();
        Ll.insert(0,101);
        Ll.add(202);
        Ll.add(404);
        Ll.insert(2,303);
        Ll.insert(4,504);
        Ll.deleteAt(2); // delete 303
        System.out.println("<==========================>");
        System.out.println("LinkedList : " + Ll.toString());

        // Doubly Linked List implementation
        DoublyLinkedList<Integer> Dll = new DoublyLinkedList<>();
        Dll.add(1);
        Dll.add(2);
        Dll.add(3);
        Dll.add(4);
        Dll.add(5);
        Dll.add(7);
        Dll.insertAt(5, 6);
        Dll.deleteAt(0);
        System.out.println("<==========================>");
        System.out.println("LinkedList : " + Dll.toString());

    }
}
