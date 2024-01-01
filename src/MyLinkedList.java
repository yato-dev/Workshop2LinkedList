public class MyLinkedList<E> {
    private Node<E> head;

    public void addElement(E element){
        Node<E> newNode=new Node<>(element);
        if(head==null)
        head=newNode;
        else{
            Node<E> temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    public void display(){
        Node<E> temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void reverseList()
    {
        Node<E> prev=null;
        Node<E> current=head;
        Node<E> next=null;

        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }



}
