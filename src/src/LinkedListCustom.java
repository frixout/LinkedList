public class LinkedListCustom<E> {
    int size=0;
    private Node head;
    private Node tail;

    public void add( E data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;

        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        this.size++;
    }

    public E get( int item) throws IndexOutsideTheList {
        try {
            if (item < 0 || item > size - 1) {
                throw new IndexOutsideTheList("Вышли за пределы List");
            } else if (item < size / 2) {
                Node runNode = head;
                for (int i = 0; i < item; i++) {
                    runNode = runNode.next;
                }
                return (E) runNode.data;
            } else {
                Node runNode = tail;
                for (int i = size - 1; i > item; i = i - 1) {
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
                throw new IndexOutsideTheList("За пределами List");
            } else if (item < size / 2) {
                Node runNode = head;
                for (int i = 0; i < item; i++) {
                    runNode = runNode.next;
                }
                runNode.next= (Node) data;

            } else {
                Node runNode = tail;
                for (int i = size - 1; i > item; i = i - 1) {
                    runNode = runNode.prev;
                }
                //runNode.next = (Node) data;
            }
        }catch (IndexOutsideTheList e){
            e.printStackTrace();
        }
    }

    public void printList(){
        Node runNode = head;
        System.out.print("[");
        while (runNode.next !=null){
            System.out.print(runNode.data + ", ");
            runNode = runNode.next;
        }
        System.out.print(runNode.data + "]\n");
    }

}

