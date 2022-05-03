package main.java;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class GraphImplementation {
/**
 this is old code

 private LinkedList<Integer> adj_list[];

    Queue<Object> traversalOrder = new LinkedList<> ();
    Queue<Object> vertexQueue = new LinkedList<>();

    /*
    GraphImplementation(int v)
    {
        int V = v;
        adj_list = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj_list[i] = new LinkedList();
    }
 **/

    //new code
    Queue<Object> traversalOrder = new LinkedList<> ();
    Queue<Object> vertexQueue = new LinkedList<>();
    ArrayList<ArrayList<Object>> graph = new ArrayList<>();
    int v;

    GraphImplementation(int numNodes)
    {
        v=numNodes;
        for (int i=0; i<v; ++i)
            graph.add(new ArrayList<Object>());
    }
    
    public void addEdge(Object v, Object u)
    {
        graph.get(v).add(u);
        graph.get(u).add(v);
    }

    public List BFTraversal(Object originVertex, int o)
    {
        boolean visited[] = new boolean[v];

        originVertex=true; //(somehow mark origin vertex as visited)
        LinkedList<Integer> queue = new LinkedList<Integer>()
        queue.add(o);
        traversalOrder.add(originVertex);
        //traversalOrder.enqueue(originVertex);

        vertexQueue.add(originVertex);

//        while (!vertexQueue.isEmpty())
//        {
//            Object frontVertex = vertexQueue.remove(); //vertexQueue.dequeue();

        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            o = queue.poll();
            System.out.print(o+" ");
        while (frontVertex. )//frontVertex has a neighbor
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
