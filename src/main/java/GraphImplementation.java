package main.java;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class GraphImplementation {

    Queue<Object> graph = new LinkedList<> ();

    public boolean isEmpty()
    {
        if (graph.size()==0)
            return true;
        return false;
    }

    //List<List<Node>> adj_list = new ArrayList<>();
    public List BFTraversal(Object originVertex)
    {
        Queue<Object> traversalOrder = new LinkedList<> ();
        Queue<Object> vertexQueue = new LinkedList<>();
        // originVertex=true; (somehow mark origin vertex as visited)
        traversalOrder.add(originVertex);
        //traversalOrder.enqueue(originVertex);

        vertexQueue.add(originVertex);

        while (!vertexQueue.isEmpty())
        {
            Object frontVertex = vertexQueue.remove(); //vertexQueue.dequeue();
        while ( frontVertex. )//frontVertex has a neighbor
        {
            nextNeighbor = next neighbor of frontVertex
        if (nextNeighbor==false)
            {
            } }
        }
        boolean nextNeighbor=true;
        traversalOrder.add(nextNeighbor);
        vertexQueue.add(nextNeighbor);
        return traversalOrder;
    }

    /**
     * method implementing depth first traversal of graph
     */
    public void DFTraversal()
    {
        Queue<Object> traversalOrder = new LinkedList<> (); //a new queue for the resulting traversal order
        Stack<Object> vertexStack = new LinkedList<> (); //a new stack to hold vertices as they are visited
        boolean originVertex=true;
        traversalOrder.enqueue(originVertex);
        vertexStack.push(originVertex);
        while (!vertexStack.isEmpty()) {
            topVertex = vertexStack.peek();
            if (topVertex has an unvisited neighbor) {
                nextNeighbor = next unvisited neighbor of topVertex
                boolean nextNeighbor=true; //Marks nextNeighbor as visited
                traversalOrder.enqueue(nextNeighbor);
                vertexStack.push(nextNeighbor);
            }
            else // All neighbors are visited
                vertexStack.pop();
        }
        return traversalOrder;
    }

}
