public class LinkedListMain {
    public static void main(String[] args) throws Exception {
        MyLinkedList<Integer> myLinkedList= new MyLinkedList<>();

        myLinkedList.addElement(4);
        myLinkedList.addElement(2);
        myLinkedList.addElement(8);
        myLinkedList.addElement(1);
        myLinkedList.addElement(6);
        myLinkedList.addElement(9);

        myLinkedList.display();
        myLinkedList.reverseList();
        myLinkedList.display();
        }
}
