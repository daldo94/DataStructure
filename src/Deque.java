public class Deque<T> {
    private int front;
    private int rear;
    private T[] deque;
    private int dequeSize;
    private int itemCount;

    public Deque(int dequeSize){
        this.dequeSize = dequeSize;
        this.itemCount = 0;
        this.front = 0;
        this.rear = 1;
        deque = (T[]) new Object[dequeSize];
    }

    public boolean isFull(){
        return dequeSize==itemCount;
    }

    public boolean isEmpty(){
        return itemCount==0;
    }

    public void push_front(T data){
        if(isFull()) System.out.println("Deque Status : Full");
        else{
            deque[front] = data;
            front = (front-1+dequeSize)%dequeSize;
            itemCount++;
        }
    }

    public void push_back(T data){
        if(isFull()) System.out.println("Deque Status : Full");
        else{
            deque[rear] = data;
            rear = (rear+1)%dequeSize;
            itemCount++;
        }
    }

    public T pop_front(){
        if(isEmpty()){
            System.out.println("Deque Status : Empty");
            return null;
        }else{
            front = (front+1)%dequeSize;
            itemCount--;
            return deque[front];
        }
    }

    public T pop_back(){
        if(isEmpty()){
            System.out.println("Deque Status : Empty");
            return null;
        }else{
            rear = (rear-1+dequeSize)%dequeSize;
            itemCount--;
            return deque[rear];
        }
    }

    public T front(){
        if(isEmpty()){
            System.out.println("Deque Status : Empty");
            return null;
        }else{
            return deque[(front+1)%dequeSize];
        }
    }

    public T back(){
        if(isEmpty()){
            System.out.println("Deque Status : Empty");
            return null;
        }else{
            return deque[(rear-1+dequeSize)%dequeSize];
        }
    }

    public int size(){
        return itemCount;
    }

    public void printDeque(){
        int tempFront = front;
        System.out.println(":::Deque:::");
        for(int i=0; i<itemCount; i++){
            tempFront = (tempFront+1)%dequeSize;
            System.out.print(deque[tempFront] + " ");
        }
        System.out.println();
    }

}
