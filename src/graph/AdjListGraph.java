package graph;


import java.util.ArrayList;

public class AdjListGraph implements Graph{
    private int nodeSize;
    private ArrayList<ArrayList<WeightNode>> adjList;
    private ArrayList test;

    private class WeightNode{
        int to;
        int weight;

        WeightNode(int to){
            this.to = to;
            this.weight = 0;
        }

        WeightNode(int to, int weight){
            this.to = to;
            this.weight = weight;
        }
    }

    public AdjListGraph(int nodeSize){
        this.nodeSize = nodeSize;
        this.adjList = new ArrayList<ArrayList<WeightNode>>();
        for(int i=0; i<nodeSize+1; i++) {
            //0번째 사용x
            adjList.add(new ArrayList<WeightNode>());
        }
    }

    @Override
    public void addEdge(int from, int to) {
        if(!isInside(from, to)){
            System.out.println("Check Graph Node Num : Index Out of Bound");
        }else{
            if(!isLinked(from,to)){
                adjList.get(from).add(new WeightNode(to));
                adjList.get(to).add(new WeightNode(from));
            }
        }
    }

    @Override
    public void addEdgeWithWeight(int from, int to, int weight) {
        if(!isInside(from, to)){
            System.out.println("Check Graph Node Num : Index Out of Bound");
        }else{

            if(!isLinked(from,to)){
                adjList.get(from).add(new WeightNode(to, weight));
                adjList.get(to).add(new WeightNode(from, weight));
            }else{
                int edgeSize = adjList.get(from).size();
                for(int i=0; i<edgeSize; i++){
                    if(adjList.get(from).get(i).to == to){
                        adjList.get(from).get(i).weight = weight;
                        return;
                    }
                }
            }
        }
    }

    @Override
    public void deleteEdge(int from, int to) {
        if(!isInside(from, to)){
            System.out.println("Check Graph Node Num : Index Out of Bound");
            return;
        }

        if(!isLinked(from, to)){
            System.out.println("No Such Edge");
            return;
        }

        int idx = getIndex(from, to);
        adjList.get(from).remove(idx);
        idx = getIndex(to, from);
        adjList.get(to).remove(idx);
    }

    @Override
    public void printGraph() {
        int edgeSize = 0;
        System.out.println(":::Graph:::");
        for(int i=1; i<nodeSize+1; i++) {
            System.out.print(i + "번 노드 : ");
            edgeSize = adjList.get(i).size();
            for(int j=0; j<edgeSize; j++){
                System.out.print(adjList.get(i).get(j).to + " ");
            }
            System.out.println();
        }
    }

    @Override
    public boolean isInside(int nodeNum1, int nodeNum2) {
        return nodeNum1>0 && nodeNum1<=nodeSize && nodeNum2>0 && nodeNum2<=nodeSize;
    }

    @Override
    public boolean isLinked(int nodeNum1, int nodeNum2) {
        int edgeSize = adjList.get(nodeNum1).size();
        for(int i=0; i<edgeSize; i++){
            if(adjList.get(nodeNum1).get(i).to==nodeNum2){
                return true;
            }
        }
        return false;
    }

    public int getIndex(int from, int to){
        int edgeSize = adjList.get(from).size();
        for(int i=0; i<edgeSize; i++){
            if(adjList.get(from).get(i).to == to){
                return i;
            }
        }
        return -1;
    }
}
