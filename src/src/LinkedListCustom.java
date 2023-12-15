public class LinkedListCustom<E> {
    private int size=0;
    private Node<E> head;
    private Node<E> tail;

    public int getSize() {
        return size;
    }

    public void add(E data){
        Node<E> newNode = new Node<>(data);
        if (head == null){
            head = newNode;
            tail = head;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public E get( int item) {
        Node<E> runNode = getRunNode(item);
        return runNode.data;
    }
    public void set(int item, E data) throws IndexOutOfBoundsException {
        Node<E> runNode = getRunNode(item);
        runNode.data= data;
    }
    private Node<E> getRunNode(int item) {
        Node<E> runNode;
        if (item < 0 || item > size - 1) {
            throw new IndexOutOfBoundsException();
        } else {
            if (item < size / 2) {
                runNode = head;
                for (int i = 0; i < item; i++) {
                    runNode = runNode.next;
                }
            } else {
                runNode = tail;
                for (int i = size - 1; i > item; i--) {
                    runNode = runNode.prev;
                }
            }
        }
        return runNode;
    }

    public void remove(int item){
        if (item < 0 || item > size - 1) {
            throw new IndexOutOfBoundsException();
        } else if(item==0) {
            head = head.next;
        } else if(item==size-1) {
            Node<E> runNodePrev = tail.prev;
            runNodePrev.next = null;
            tail = runNodePrev;
        } else if (item < size / 2) {
            Node<E> runNode = head;
            for (int i = 0; i < item; i++) {
                runNode = runNode.next;
            }
            extracted(runNode);

        } else {
            Node<E> runNode = tail;
            for (int i = size - 1; i > item; i--) {
                runNode = runNode.prev;
            }
            extracted(runNode);
        }
        size--;
    }

    private void extracted(Node<E> runNode) {
        Node<E> runNodePrev = runNode.prev;
        Node<E> runNodeNext = runNode.next;
        runNodePrev.next = runNode.next;
        runNodeNext.prev = runNode.prev;
    }

    public void printList(){
        Node<E> runNode = head;
        if(runNode==null) {
            System.out.println("[]");
        }
        else{
            System.out.print("[");
            while (runNode.next !=null){
                System.out.print(runNode.data + ", ");
                runNode = runNode.next;
            }
            System.out.print(runNode.data + "]\n");
        }
    }
}