package tree;


import java.util.ArrayList;

public class Tree<T> {
    private Node root;
    private int depth;

    private class Node{
        T data;
        int level;
        Node parent;
        ArrayList<Node> child;

        Node(T data){
            this.data = data;
            this.level = 0;
            this.parent = null;
            this.child = new ArrayList<>();
        }
    }

    public Tree(T data){
        this.root = new Node(data);
        this.root.level = 0;
        this.depth = 0;
    }

    public void addChild(T parentData, T childData){

        if(root.data == parentData){
            Node newNode = new Node(childData);
            root.child.add(newNode);
            newNode.parent = root;
            newNode.level = root.level + 1;
            if(newNode.level > depth) depth = newNode.level;

        }else{
            ArrayList<Node> tempChild = new ArrayList<>();
            tempChild.addAll(root.child);

            int childSize = tempChild.size();

            while(childSize!=0){

                if(tempChild.get(0).data == parentData){
                    //Child 추가
                    Node newNode = new Node(childData);
                    tempChild.get(0).child.add(newNode);
                    newNode.parent = tempChild.get(0);
                    newNode.level = tempChild.get(0).level + 1;
                    if(newNode.level > depth) depth = newNode.level;
                    break;
                }else{
                    tempChild.addAll(tempChild.get(0).child);
                    tempChild.remove(0);
                    childSize = tempChild.size();
                }
            }
        }
    }

    public void printDataUsingLevel(int level){
        System.out.println(":::Level : "+ level + ":::");
        if(level==0){
            System.out.println(root.data);
        }else{
            ArrayList<Node> tempChild = new ArrayList<>();
            tempChild.addAll(root.child);
            int childSize = tempChild.size();
            while(true){
                if(tempChild.get(0).level==level){
                    break;
                }else{
                    for(int i=0; i<childSize; i++){
                        tempChild.addAll(tempChild.get(0).child);
                        tempChild.remove(0);
                    }
                    childSize = tempChild.size();
                }
            }

            childSize = tempChild.size();
            for(int i=0; i<childSize; i++){
                System.out.print(tempChild.get(i).data + " ");
            }
            System.out.println();
        }

    }

    public void printTree(){
        ArrayList<Node> tempChild = new ArrayList<>();
        tempChild.addAll(root.child);
        System.out.println(":::Tree:::");
        System.out.println(root.data);
        int childSize = tempChild.size();
        while(childSize!=0){
            for(int i=0; i<childSize; i++){
                System.out.print(tempChild.get(0).data + " ");
                tempChild.addAll(tempChild.get(0).child);
                tempChild.remove(0);
            }
            System.out.println();
            childSize = tempChild.size();
        }
    }

    public int getTreeDepth(){
        return this.depth;
    }

}
