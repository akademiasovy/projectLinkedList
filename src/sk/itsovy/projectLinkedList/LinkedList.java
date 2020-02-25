package sk.itsovy.projectLinkedList;

public class LinkedList {
    private Node head;

    public Node getHead() {
        return head;
    }

    public LinkedList() {
        this.head = null;
    }

    public void addToEnd(Node node){
        if(node==null)
            return;

        if(head==null){
            head=node;
            return;
        }

        Node tmp=head;
        while(tmp.getNext()!=null)
            tmp=tmp.getNext();

        tmp.setNext(node);
    }

    public void addToFront(Node node){
        if(node==null)
            return;

        if(head==null)
            head=node;
        else
        {
            node.setNext(head);
            head=node;
        }
    }

    public void add(Node node, int index){
        if(node==null)
            return;
        if(index<=0)
            addToFront(node);
        else if(index>=getSize())
            addToEnd(node);
        else {
            Node tmp = head;
            for(int i = 1;i<index;i++)
                tmp=tmp.getNext();
                node.setNext(tmp.getNext());
                tmp.setNext(node);
        }
    }

    public void print(){
        if(head==null){
            System.out.println("Linked list is empty, no item to print !");
        }
        else {
            Node tmp=head;
            while(tmp!=null){
                System.out.println(tmp.getData());
                tmp=tmp.getNext();
            }
        }
    }

    public int getSize(){
        int count=0;
        Node tmp=head;
        while(tmp!=null){
            count++;
            tmp=tmp.getNext();
        }

        return count;
    }

    public void removeAll(){
        head=null;
    }

    public boolean remove(Node node){
        if (head == null|| node == null) {
            return false;
        }

        if(head==node) {
            head = node.getNext();
            return true;
        }

        Node tmp=head;
        while(tmp.getNext()!=node){
            tmp=tmp.getNext();

            if(tmp==null)
                return false;
        }

        tmp.setNext(tmp.getNext().getNext());

        return true;
    }

    public Node findByName(String name){
        if(name==null || head==null)
            return null;

        Node tmp=head;
        if(!(tmp.getData() instanceof String))
            return null;

        while(tmp!=null){
            if(tmp.getData().equals(name))
                return tmp;
            tmp=tmp.getNext();
        }

        return null;
    }

}
