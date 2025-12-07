import DataStructures.LinkedList;

public class Main {
    public static void main(String[] args){
        // linked list implementation
        LinkedList<Integer> obj = new LinkedList<>();
        obj.insert(0,101);
        obj.add(202);
        obj.add(404);
        obj.insert(2,303);
        obj.insert(4,504);
        obj.deleteAt(2); // delete 303
        System.out.println("<==========================>");
        System.out.println("Head : "+obj.getHead());
        System.out.println("Tail : "+obj.getTail());
        System.out.println("LinkedList : " + obj.toString());



    }
}
