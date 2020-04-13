public class CircularLinkedList<T> {
    private Node CL;
    private int size;

    public CircularLinkedList(){
        this.CL = null;
        this.size = 0;
    }
    private class Node{
        private Node next;
        private T data;

        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(T data){

        if(CL==null){
            Node newNode = new Node(data);
            CL = newNode;
            newNode.next = newNode;
        }else{
            Node currentNode = CL;
            Node newNode = new Node(data);
            while(currentNode.next != CL){
                currentNode = currentNode.next;
            }

            newNode.next = CL;
            currentNode.next = newNode;
            CL = newNode;
        }
        size++;
    }

    public void addLast(T data){
        if(CL==null){
            addFirst(data);
        }else{
            Node currentNode = CL;
            Node newNode = new Node(data);
            while(currentNode.next!=CL){
                currentNode = currentNode.next;
            }

            newNode.next = CL;
            currentNode.next = newNode;
            size++;
        }
    }

    public void add(int index, T data){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index : " + index + ", Size : " + size);
        }

        if(index==0){
            addFirst(data);
        }else if(index == size-1){
            addLast(data);
        }else{
            Node currentNode = CL;
            Node newNode = new Node(data);
            int currentIdx = 0;

            while(currentIdx!=index-1){
                currentNode = currentNode.next;
                currentIdx++;
            }

            newNode.next = currentNode.next;
            currentNode.next = newNode;
            size++;
        }
    }


    public T deleteFirst(){
        if(CL==null){
            throw new IndexOutOfBoundsException("Size : " + size);
        }

        Node currentNode = CL;
        Node firstNode = CL;

        if(currentNode.next==currentNode){
            CL = null;
            return currentNode.data;
        }else{

            while(currentNode.next!=CL){
                currentNode = currentNode.next;
            }

            currentNode.next = CL.next;
            CL = CL.next;
            size--;

            return firstNode.data;
        }


    }

    public T deleteLast(){
        if(CL==null){
            throw new IndexOutOfBoundsException("Size : " + size);
        }else if(size==1){
            return deleteFirst();
        }else{

            Node currentNode = CL;
            Node lastNode = null;
            while(currentNode.next.next != CL){
                currentNode = currentNode.next;
            }

            lastNode = currentNode.next;
            currentNode.next = CL;
            size--;

            return lastNode.data;
        }
    }

    public T delete(int index){
        if(CL==null){
            throw new IndexOutOfBoundsException("Size : " + size);
        }
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index : " + index + ", Size : " + size);
        }
        if(index==0){
            return deleteFirst();
        }else if(index==size-1){
            return deleteLast();
        }else{
            Node currentNode = CL;
            Node deleteNode = null;
            int currentIndex = 0;


            while(currentIndex!=index-1){
                currentNode = currentNode.next;
                currentIndex++;
            }

            deleteNode = currentNode.next;
            currentNode.next = currentNode.next.next;
            size--;

            return deleteNode.data;
        }
    }

    public int size(){
        return size;
    }

    public String toString(){
        StringBuffer result = new StringBuffer("[");
        Node node = CL;

        if(node!=null){
            result.append(node.data);
            node = node.next;

            while(node != CL){
                result.append(", ");
                result.append(node.data);
                node = node.next;
            }


        }
        result.append("]");
        return result.toString();
    }

}
