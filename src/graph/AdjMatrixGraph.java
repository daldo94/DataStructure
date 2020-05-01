package graph;

public class AdjMatrixGraph implements Graph {
    private int nodeSize;
    private int[][] adjMatrix;

    public AdjMatrixGraph(int nodeSize){
        this.nodeSize = nodeSize;
        this.adjMatrix = new int[nodeSize][nodeSize];
    }

    @Override
    public void addEdge(int from, int to) {
        from = from -1;
        to = to - 1;
        if(!isInside(from,to)){
            System.out.println("Check Graph Node Num : Index Out of Bound");
        }else{
            adjMatrix[from][to]=1;
            adjMatrix[to][from]=1;
        }
    }

    @Override
    public void addEdgeWithWeight(int from, int to, int weight) {
        from = from -1;
        to = to - 1;
        if(!isInside(from,to)){
            System.out.println("Check Graph Node Num : Index Out of Bound");
        }else{
            adjMatrix[from][to]=weight;
            adjMatrix[to][from]=weight;
        }
    }

    @Override
    public void deleteEdge(int from, int to) {
        from = from -1;
        to = to - 1;
        if(!isInside(from,to)){
            System.out.println("Check Graph Node Num : Index Out of Bound");
        }else if(!isLinked(from+1, to+1)){
            System.out.println("Check Graph Node Num : No Such Edge");
        }else{
            adjMatrix[from][to]=0;
            adjMatrix[to][from]=0;
        }
    }

    @Override
    public void printGraph() {
        System.out.println();
        for(int i=0; i<nodeSize; i++){
            for(int j=0; j<nodeSize; j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public boolean isInside(int nodeNum1, int nodeNum2) {
        return nodeNum1>=0 && nodeNum1<nodeSize && nodeNum2>=0 && nodeNum2<nodeSize;
    }

    @Override
    public boolean isLinked(int nodeNum1, int nodeNum2) {
        nodeNum1 = nodeNum1 -1;
        nodeNum2 = nodeNum2 -1;
        if(!isInside(nodeNum1,nodeNum2)){
            System.out.println("Check Graph Node Num : Index Out of Bound");
            return false;
        }else{
            if(adjMatrix[nodeNum1][nodeNum2]==0){
                return false;
            }else{
                return true;
            }
        }
    }
}
