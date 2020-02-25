import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sk.itsovy.projectLinkedList.LinkedList;
import sk.itsovy.projectLinkedList.Node;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getSizeTest() {
        LinkedList list = new LinkedList();
        assertEquals(0,list.getSize(),"Has to be 0");
        Node<String> node1=new Node<>("Test node 1");
        Node<String> node2=new Node<>("Test node 2");
        Node<String> node3=new Node<>("Test node 3");
        list.addToFront(node1);
        assertEquals(1,list.getSize(),"Has to be 1");
        list.addToEnd(node2);
        assertEquals(2,list.getSize(),"Has to be 2");
        list.add(node3,1);
        assertEquals(3,list.getSize(),"Has to be 3");
        list.remove(node1);
        assertEquals(2,list.getSize(),"Has to be 2 after remove");
        list.removeAll();
        assertEquals(0,list.getSize(),"Has to be 0");
    }

    @Test
    void addTest(){
        LinkedList list=new LinkedList();
        Node<String> node1=new Node<>("Test node 1");
        Node<String> node2=new Node<>(null);
        Node<String> node3=new Node<>("");
        Node<Integer> node4=new Node<>(10);
        Node<Date> node5=new Node<>(new Date());
        Node<String> node6=new Node<>("Test node 2");
        Node<String> node7=new Node<>("Test node 7");

        assertEquals(0,list.getSize(),"Has to be 0");
        list.addToFront(node1);
        assertNotNull(list.findByName("Test node 1"));
        assertNull(list.findByName("Test node 2"));
        list.addToFront(null);
        list.addToEnd(null);
        list.add(null,1);
        assertEquals(1,list.getSize(),"Has to be 1");
        list.addToFront(node2);
        assertEquals(2,list.getSize(),"Has to be 2");
        list.addToFront(node5);
        assertEquals(node5,list.getHead());
        list.addToFront(node6);
        assertNotEquals(node5,list.getHead());

        list.addToEnd(node4);
        Node tmp=list.getHead();
        while(tmp.getNext()!=null)
            tmp=tmp.getNext();
        assertEquals(node4,tmp);
        list.addToEnd(node7);
        tmp=list.getHead();
        while(tmp.getNext()!=null)
            tmp=tmp.getNext();
        assertNotEquals(node4,tmp);
        assertEquals(node7,tmp);

        Node<String> node10=new Node<>("Test node 10");
        Node<String> node11=new Node<>("Test node 11");
        Node<String> node12=new Node<>("Test node 12");
        Node<String> node13=new Node<>("Test node 13");
        Node<String> node14=new Node<>("Test node 14");
        Node<String> node15=new Node<>("Test node 15");
        Node<String> node16=new Node<>("Test node 16");

        list.removeAll();
        assertNull(list.getHead());
        list.addToFront(node10);
        list.addToFront(node11);
        list.add(node12,0);
        assertEquals(node12,list.getHead());
        list.add(node13,-987456);
        assertEquals(node13,list.getHead());
        list.add(node14,745631);
        tmp=list.getHead();
        while(tmp.getNext()!=null)
            tmp=tmp.getNext();
        assertEquals(node14,tmp);
        list.add(node15,2);
        assertEquals(node15,list.getHead().getNext().getNext());

        list.removeAll();
        list.add(node16,524);
        assertEquals(node16,list.getHead());
    }

    @Test
    void removeTest(){
           // To do
    }

    @Test
    void removeAllTest(){
            // To do
    }
}