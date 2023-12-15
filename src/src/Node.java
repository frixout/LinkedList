public class Node<E> {
    E data;
    Node<E> next;
    Node<E> prev;
    Node(){

    }
    Node(E d){
        data = d;
        next = null;
        prev =null;
    }
}
