package list;

public class ArrayList<T> {
    private final int DEFAULT_SIZE = 3;
    private Object[] element;
    private int index;
    private int size;

    public ArrayList(){
        element = new Object[DEFAULT_SIZE];
        index = 0;
        size = DEFAULT_SIZE;
    }

    public boolean add(T t){
        if(index == size){
            sizeUp();
        }

        this.element[index] = t;
        index++;

        return true;
    }

    public void add(int idx, T t){
        if(index == size){
            sizeUp();
        }

        for(int i=this.index; i>idx; i--){
            this.element[i] = this.element[i-1];
        }
        this.element[idx] = t;
        index++;
    }

    public T get(T t){
        int idx = indexOf(t);
        if(idx==-1) return null;
        return (T) element[idx];
    }
    public T get(int idx){
        if(idx>=index){
            return null;
        }else {
            return (T) element[idx];
        }
    }

    public boolean delete(T t){
        int idx = indexOf(t);

        if(idx==-1){
            return false;
        }

        delete(idx);
        return true;
    }

    public void delete(int idx){
        for(int i=idx; i<index-1; i++){
            element[i]=element[i+1];
        }
        index--;
    }

    public int indexOf(T t){
        int idx = -1;
        for(int i=0; i<index; i++){
            if(element[i]==t){
                idx = i;
                break;
            }
        }
        return idx;
    }

    //원소의 갯수가 아니라 배열의 크기
    public int size(){
        return this.size;
    }

    private void sizeUp(){
        Object[] old = this.element;
        int newSize = size * 2;
        this.element = new Object[newSize];
        this.size = newSize;

        for(int i=0; i<this.index; i++){
            element[i] = old[i];
        }
    }



}
