package main.java;

public interface GraphInterface<T>
{
    public boolean addVertex(T vertexLabel);
    public boolean addEdge (T begin, T end, double edgeWeight);
    public boolean addEdge (T begin, T end);
    public boolean hasEdge (T begin, T end);
    public boolean isEmpty();
    public int getNumberOfVerticies();
    public int getNumberOfEdges();
    public void clear();
}
