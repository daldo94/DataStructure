package deque;

public class ListDeque<T> implements Deque<T> {
    private Node head;
    private Node tail;
    private int size;

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

    public ListDeque(){
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void push_front(T data) {
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

    @Override
    public void push_back(T data) {
        if(isEmpty()){
            push_front(data);
        }else{
            Node newNode = new Node(data);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;
        }
    }

    @Override
    public T pop_front() {
        if(isEmpty()){
            System.out.println("Deque Status : Empty");
            return null;
        }else{
            Node popNode = head;
            head = null;
            head = popNode.next;

            if(head!=null){
                head.prev = null;
            }else{
                tail=null;
            }

            size--;
            return popNode.data;
        }
    }

    @Override
    public T pop_back() {
        if(isEmpty()){
            System.out.println("Deque Status : Empty");
            return null;
        }else{
            Node popNode = tail;
            tail = null;
            tail = popNode.prev;

            if(tail!=null){
                tail.next = null;
            }else{
                head=null;
            }

            size--;
            return popNode.data;
        }
    }

    @Override
    public T front() {
        if(isEmpty()){
            System.out.println("Deque Status : Empty");
            return null;
        }else {
            return head.data;
        }
    }

    @Override
    public T back() {
        if(isEmpty()){
            System.out.println("Deque Status : Empty");
            return null;
        }else {
            return tail.data;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printDeque() {

        Node curNode = head;

        System.out.println(":::Deque:::");

        if(size!=0){
            System.out.print(curNode.data + " ");
            while(curNode.next!=null){
                curNode = curNode.next;
                System.out.print(curNode.data + " ");
            }
        }
        System.out.println();
    }








}
