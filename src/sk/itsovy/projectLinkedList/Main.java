package sk.itsovy.projectLinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        Node<String> n1=new Node<>("Filip");
        Node<String> n2=new Node<>("Eva");
        Node<String> n3=new Node<>("Jaro");
        linkedList.addToFront(n1);
        linkedList.addToFront(n2);
        linkedList.addToFront(n3);
        //linkedList.print();

        Node<String> n4=new Node<>("Emil");
        Node<String> n5=new Node<>("Denisa");
        Node<String> n7=new Node<>("Robert");
        linkedList.addToEnd(n4);
        linkedList.addToEnd(n5);

        Node<String> n6=new Node<>("Bartolomej");
        linkedList.add(n6,1);
        linkedList.remove(n2);
        linkedList.remove(n7);
        linkedList.remove(null);
        linkedList.remove(linkedList.findByName("Jaro"));
        linkedList.print();

        LinkedList linkedList2=new LinkedList();

        Node<Integer> m1=new Node<>(45);
        Node<Integer> m2=new Node<>(10);
        linkedList2.addToFront(m1);
        linkedList2.addToFront(m2);
        linkedList2.findByName("15");
        linkedList2.print();
    }


}
