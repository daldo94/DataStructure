public class DoublyLinkedList<T> {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList(){
        size = 0;
    }

    private class Node{
        private Node prev;
        private Node next;
        private T data;

        Node(T data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void addFirst(T data){
        Node newNode = new Node(data);

        if(head!=null){
            newNode.next = head;
            head.prev = newNode;
        }

        head = newNode;
        if(head.next == null){
            tail = head;
        }
        size++;
    }

    public void addLast(T data){
        if(size==0){
            addFirst(data);
        }else{
            Node newNode = new Node(data);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;
        }
    }

    public void add(int index, T data){
        if(index==0){
            addFirst(data);
        }else if(index == size -1){
            addLast(data);
        }else{
            Node newNode = new Node(data);
            Node prevNode = getNode(index - 1);
            Node nextNode = prevNode.next;

            newNode.prev = prevNode;
            newNode.next = nextNode;

            prevNode.next = newNode;
            nextNode.prev = newNode;

            size++;
        }
    }

    private Node getNode(int index){

        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index : " + index + ", Size : " + size);
        }

        if(index < size/2){
            Node node = head;
            for(int i=0; i<index; i++){
                node = node.next;
            }
            return node;
        }else{
            Node node = tail;
            for(int i=size -1; i>index; i--){
                node = node.prev;
            }
            return node;
        }
    }

    public T removeFirst(){
        if(size==0){
            return null;
        }else{
            Node removeNode = head;
            head = null;
            head = removeNode.next;
            head.prev = null;
            size--;

            return removeNode.data;
        }
    }

    public T removeLast(){
        if(size==0){
            return null;
        }else{
            Node removeNode = tail;
            tail = null;
            tail = removeNode.prev;
            tail.next = null;
            size--;

            return removeNode.data;
        }
    }

    public T remove(int index){
        if(size==0){
            return null;
        }

        if(index==0){
            return removeFirst();
        }else if(index == size -1){
            return removeLast();
        }else{
            Node removeNode = getNode(index);
            Node prevNode = removeNode.prev;
            Node nextNode = removeNode.next;

            prevNode.next = nextNode;
            nextNode.prev = prevNode;

            size--;

            return removeNode.data;
        }
    }

    public int size(){
        return size;
    }

    public String toString(){
        StringBuffer result = new StringBuffer("[");
        if(size!=0){
            Node node = head;
            result.append(head.data);

            while(node.next!=null){
                node = node.next;
                result.append(", ");
                result.append(node.data);
            }
        }
        result.append("]");
        return result.toString();
    }
}
