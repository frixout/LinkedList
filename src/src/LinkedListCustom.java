public class LinkedListCustom<E> {
    int size=0;
    private Node head;
    private Node tail;

    public void add( E data){
        Node<E> newNode = new Node<>(data);
        if (head == null){
            head = newNode;
            tail = newNode;

        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public E get( int item) throws IndexOutsideTheList {
        try {
            if (item < 0 || item > size - 1) {
                throw new IndexOutsideTheList("За пределами List");
            } else if (item < size / 2) {
                Node<E> runNode = head;
                for (int i = 0; i < item; i++) {
                    runNode = runNode.next;
                }
                return (E) runNode.data;
            } else {
                Node<E> runNode = tail;
                for (int i = size - 1; i > item; i--) {
                    runNode = runNode.prev;
                }
                return (E) runNode.data;
            }
        }catch (IndexOutsideTheList e){
            e.printStackTrace();
            return null;
        }
    }
    public void set(int item, E data){
        try {
            if (item < 0 || item > size - 1) {
                throw new IndexOutsideTheList ("За пределами List");
            } else if (item < size / 2) {
                Node<E> runNode = head;
                for (int i = 0; i < item; i++) {
                    runNode = runNode.next;
                }
                runNode.data= (E) data;

            } else {
                Node<E> runNode = tail;
                for (int i = size - 1; i > item; i--) {
                    runNode = runNode.prev;
                }
                runNode.data= (E) data;
            }
        }catch (IndexOutsideTheList e){
            e.printStackTrace();
        }
    }

    public void remove(int item){
        Node<E> prev = null;
        try {
            if (item < 0 || item > size - 1) {
                throw new IndexOutsideTheList("За пределами List");
            } else if(item==0) {
                Node<E> runNodeNext = head.next;
                runNodeNext.prev = null;
                head = runNodeNext;
            } else if(item==size-1) {
                Node<E> runNodePrev = tail.prev;
                runNodePrev.next = null;
                tail = runNodePrev;
            } else if (item < size / 2) {
                Node<E> runNode = head;
                for (int i = 0; i < item; i++) {
                    runNode = runNode.next;
                }
                Node<E> runNodePrev = runNode.prev;
                Node<E> runNodeNext = runNode.next;
                runNodePrev.next = runNode.next;
                runNodeNext.prev = runNode.prev;

            } else {
                Node<E> runNode = tail;
                for (int i = size - 1; i > item; i--) {
                    runNode = runNode.prev;
                }
                Node<E> runNodePrev = runNode.prev;
                Node<E> runNodeNext = runNode.next;
                runNodePrev.next = runNode.next;
                runNodeNext.prev = runNode.prev;
            }
            size--;
        }catch (IndexOutsideTheList e){
            e.printStackTrace();
        }
    }


    public void printList(){
        Node<E> runNode = head;
        System.out.print("[");
        while (runNode.next !=null){
            System.out.print(runNode.data + ", ");
            runNode = runNode.next;
        }
        System.out.print(runNode.data + "]\n");
    }

}

