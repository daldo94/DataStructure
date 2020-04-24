package stack;

public class Stack<T> {
    int top;
    T[] stack;
    int size;

    public Stack(int size){
        this.top = -1;
        this.stack = (T[]) new Object[size];
        this.size = size;
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public boolean isFull(){
        return (top==size-1);
    }

    public void push(T item){
        if(isFull()){
            System.out.println("stack.Stack Status : full");
        }else{
            stack[++top] = item;
        }
    }

    public T pop(){
        if(isEmpty()){
            System.out.println("stack.Stack Status : empty");
            return null;
        }else{
            return stack[top--];
        }
    }

    public void delete(){
        if(isEmpty()){
            System.out.println("stack.Stack Status : empty");
        }else{
            top--;
        }
    }

    public T peek(){
        if(isEmpty()){
            System.out.println("stack.Stack Status : empty");
            return null;
        }else{
            return stack[top];
        }
    }

    public void printStack(){
        if(isEmpty()){
            System.out.println("stack.Stack Status : empty");
        }else{
            System.out.println("<< stack.Stack >>");
            for(int i=top; i>-1; i--){
                System.out.println(stack[i]);
            }
            System.out.println();
        }
    }
}
