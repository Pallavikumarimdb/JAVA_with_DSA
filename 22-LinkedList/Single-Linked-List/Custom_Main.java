public class Custom_Main {


    // Here Custom LinkedList will be initialised with size 0;

    public static void main(String[] args) {
        Custom_LinkedList list=new Custom_LinkedList();

        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(8);
        list.insertFirst(24);
        list.insertFirst(48);
        list.insertLast(100);
        list.insert(78 ,4);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
    }
}
