public class Doubly_Main {


    public static void main(String[] args) {

        Custom_Doubly_LinkedList list=new Custom_Doubly_LinkedList();
        list.insertFirst(3);
        list.insertFirst(9);
        list.insertFirst(4);
        list.insertFirst(46);
        list.insertFirst(75);
        list.insertLast(100);
        list.insert(3, 456);
        list.display();

    }
}
