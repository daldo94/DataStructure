package list;

public class DoublyCircularLinkedList<T> {
    private Node head;
    private int size;

    public DoublyCircularLinkedList(){
        this.head = null;
        this.size = 0;
    }

    private class Node{
        private T data;
        private Node prev;
        private Node next;

        Node(T data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void addFirst(T data){
        if(head==null){
            Node newNode = new Node(data);
            head = newNode;
            head.next = head;
            head.prev = head;
        }else{
            Node lastNode = head.prev;
            Node newNode = new Node(data);

            lastNode.next = newNode;
            newNode.prev = lastNode;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(T data){
        if(head==null){
            addFirst(data);
        }else{
            Node lastNode = head.prev;
            Node newNode = new Node(data);

            lastNode.next = newNode;
            newNode.prev = lastNode;
            newNode.next = head;
            head.prev = newNode;
            size++;
        }
    }

    public void add(int index, T data){
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("Index : " + index + ", Size : " + size);
        }

        if(index==0){
            addFirst(data);
        }else if(index==size){
            addLast(data);
        }else{
            Node currentNode = head;
            Node newNode = new Node(data);
            int currentIndex = 0;

            while(currentIndex!=index-1){
                currentNode = currentNode.next;
                currentIndex++;
            }
            currentNode.next.prev = newNode;
            newNode.next = currentNode.next;
            newNode.prev = currentNode;
            currentNode.next = newNode;
            size++;
        }
    }

    public T deleteFirst(){
        if(head == null){
            throw new IndexOutOfBoundsException("Size : " + size);
        }

        Node lastNode = head.prev;
        T data  = head.data;

        lastNode.next = head.next;
        head.next.prev = lastNode;
        head = head.next;
        size--;

        return data;
    }

    public T deleteLast(){
        if(head == null){
            throw new IndexOutOfBoundsException("Size : " + size);
        }

        Node lastNode = head.prev;
        T data = lastNode.data;

        lastNode.prev.next = head;
        head.prev = lastNode.prev;
        size--;

        return data;
    }

    public T delete(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index : " + index + ", Size : " + size);
        }

        if(index == 0){
            return deleteFirst();
        }else if(index==size-1){
            return deleteLast();
        }else{
            Node currentNode = head;
            int currentIdx = 0;

            while(currentIdx!=index){
                currentNode = currentNode.next;
                currentIdx++;
            }

            currentNode.next.prev = currentNode.prev;
            currentNode.prev.next = currentNode.next;
            size--;

            return currentNode.data;
        }
    }

    public int size(){
        return size;
    }

    public String toString(){
        StringBuffer result = new StringBuffer("[");
        Node node = head;

        if(node!=null){
            result.append(node.data);
            node = node.next;

            while(node != head){
                result.append(", ");
                result.append(node.data);
                node = node.next;
            }
        }
        result.append("]");
        return result.toString();
    }
}
