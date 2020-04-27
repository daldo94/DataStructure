package graph;

public interface Graph {
    void addEdge(int from, int to);
    void addEdgeWithWeight(int from, int to, int weight);
    void deleteEdge(int from, int to);
    void printGraph();
    boolean isInside(int nodeNum1, int nodeNum2);
    boolean isLinked(int nodeNum1, int nodeNum2);
}
