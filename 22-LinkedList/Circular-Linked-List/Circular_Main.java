public class Circular_Main {
    public static void main(String[] args) {

        Circular_LinkedList list = new Circular_LinkedList();
        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(75);
        list.display();
        list.delete(19);
        list.display();
    }
}
