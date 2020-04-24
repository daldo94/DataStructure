package queue;

public class CircularQueue<T> {
    private int front;
    private int rear;
    private T[] queue;
    private int size;

    public CircularQueue(int size){
        size = size + 1;
        this.size = size;
        this.queue = (T[]) new Object[size];
        this.rear = 0;
        this.front = 0;
    }

    public boolean isFull(){
        return front == (rear+1)%size;
    }
    public boolean isEmpty(){
        return front == rear;
    }
    public void push(T data){
        if(isFull()){
            System.out.println("queue.Queue Status : Full");
        }else{
            rear = (++rear)%size;
            queue[rear] = data;
        }
    }
    public T pop(){
        if(isEmpty()){
            System.out.println("queue.Queue Status : Empty");
            return null;
        }else{
            T data = null;
            front = (++front)%size;
            data = queue[front];
            queue[front] = null;
            return data;
        }
    }
    public T peak(){
        return queue[front+1];
    }

    public int size(){
        if(isEmpty()){
            return 0;
        }
        if(isFull()){
            return size -1;
        }

        return (front+1)+size-rear;

    }

    public void printQueue(){

        System.out.println(":::queue.Queue:::");
        for(int i=0; i<size; i++){
            System.out.println(queue[i]);
        }
    }
}
