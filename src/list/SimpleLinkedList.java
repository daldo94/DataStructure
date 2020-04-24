package list;

public class SimpleLinkedList<T> {
    private Node header;
    private int size;

    public SimpleLinkedList(){
        header = new Node(null);
        size = 0;
    }

    private class Node{
        private T data;
        private Node nextNode;

        Node(T data){
            this.data = data;
            this.nextNode = null;
        }
    }

    public T get(int index){
        return getNode(index).data;
    }

    private Node getNode(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index : " + index + ", Size : " + size);
        }

        Node node = header.nextNode;
        for(int i=0; i<index; i++){
            node = node.nextNode;
        }

        return node;
    }

    public T getFirst(){
        return get(0);
    }

    public int getNodeIndex(T t){
        if(size<=0){
            return -1;
        }

        int index = 0;
        Node node = header.nextNode;
        T nodeData = node.data;


        while(!t.equals(nodeData)){
            node = node.nextNode;

            if(node == null){
                return -1;
            }

            nodeData = node.data;
            index++;
        }
        return index;
    }

    public void addFirst(T data){
        Node newNode = new Node(data);
        newNode.nextNode = header.nextNode;
        header.nextNode = newNode;
        size++;
    }

    public void add(int index, T data){
        if(index==0){
            addFirst(data);
            return;
        }

        Node previous = getNode(index-1);
        Node next = previous.nextNode;

        Node newNode = new Node(data);
        previous.nextNode = newNode;
        newNode.nextNode = next;
        size++;
    }

    public void addLast(T data){
        add(size, data);
    }

    public void add(T data){
        addLast(data);
    }

    public T removeFirst(){
        Node firstNode = getNode(0);
        header.nextNode = firstNode.nextNode;
        size--;
        return firstNode.data;
    }

    public T remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index : " + index + ", Size : " + size);
        }else if(index == 0){
            return removeFirst();
        }

        Node previous = getNode(index-1);
        Node removeNode = previous.nextNode;
        Node next = removeNode.nextNode;
        previous.nextNode = next;
        size--;

        return removeNode.data;
    }

    public boolean remove(T data){
        int nodeIndex = getNodeIndex(data);

        if(nodeIndex==-1){
            return false;
        }else{
            remove(nodeIndex);
            return true;
        }
    }

    public T removeLast(){
        return remove(size - 1);
    }

    public int size(){
        return size;
    }

    public String toString(){
        StringBuffer result = new StringBuffer("[");
        Node node = header.nextNode;

        if(node!=null){
            result.append(node.data);
            node = node.nextNode;

            while(node != null){
                result.append(", ");
                result.append(node.data);
                node = node.nextNode;
            }
        }
        result.append("]");
        return result.toString();
    }


}
