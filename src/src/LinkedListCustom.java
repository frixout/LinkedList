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

    public E get( int item){

        if (item < 0 || item >= size) {
            throw new IndexOutOfBoundsException();
        } else if(item<size/2){
            Node runNode = head;
            for (int i = 0; i < item; i++){
                runNode =runNode.next;
            }
            return (E) runNode.data;
        } else {
            Node runNode = tail;
            for (int i = size; i < item; i--) {
                runNode = runNode.prev;
            }
            return (E) runNode.data;
        }
    }
    public void set(int item, E data){
        if (item < 0 || item >= size) {
            throw new IndexOutOfBoundsException();
        } else if(item<size/2){
            Node runNode = head;
            for (int i = 0; i < item; i++){
                runNode =runNode.next;
            }
        } else {
            Node runNode = tail;
            for (int i = size; i < item; i--) {
                runNode = runNode.prev;
            }

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

