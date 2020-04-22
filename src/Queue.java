public class Queue<T> {
    int front;
    int rear;
    int size;
    T[] queue;

    public Queue(int size){
        this.queue = (T[]) new Object[size];
        this.front = -1;
        this.rear = -1;
        this.size = size;
    }

    public boolean isFull(){
        if(rear==size-1) return true;
        else return false;
    }

    public boolean isEmpty(){
        if(front==rear) return true;
        else return false;
    }

    public void push(T data){
        if(!isFull()){
            queue[++rear] = data;
        }else{
            System.out.println("Queue Status : Full");
        }
    }

    public T pop(){
        if(!isEmpty()){
            T data = queue[++front];
            if(isEmpty()){
                rear = -1;
                front = -1;
            }else{
                int idx = 0;
                for(int i=front+1; i<=rear; i++){
                    queue[idx++] = queue[i];
                }
                front = -1;
                rear = idx - 1;
            }
            return data;
        }else{
            System.out.println("Queue Status : Empty");
            return null;
        }
    }

    public T peak(){
        if(isEmpty()){
            System.out.println("Queue Status : Empty");
            return null;
        }else {
            return queue[front + 1];
        }
    }

    public int size(){
        if(isEmpty()){
            return 0;
        }else {
            return rear+1;
        }
    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue Status : Empty");
        }else{
            System.out.println(":::Queue:::");
            for(int i=0; i<=rear; i++){
                System.out.println(queue[i]);
            }
        }
    }

}
