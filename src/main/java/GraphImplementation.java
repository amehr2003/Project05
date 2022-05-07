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
        graph.get((Integer) v).add(u);
        graph.get((Integer) u).add(v);
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

        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            o = queue.poll();
            System.out.print(o+" ");
    }
        

    /**
         * method implementing depth first traversal of graph
         */
        class DFT {
            int numvertices;
            private LinkedList<Integer> adj_list[];
            int node;

            void addEdge(int v, int w) {
                adj_list[v].add(w); // Add w to v's list.
            }

            void DFSUtil(int numvertices, boolean visited[]) {
                // Mark the current node as visited and print result
                if (visited[v] = true;) {
                    System.out.println(node);
                }
                System.out.print(v + " "); //spacing for formatting purposes
                Iterator<Integer> i = adj_list[v].listIterator();
                while (i.hasNext()) {
                    int next = i.next();
                    if (!visited[next])
                        DFSUtil(next, visited); //recursive function to get vertices adjacent to the vertex
                }
            }
            void DFS()
            {
                boolean visited[] = new boolean[v];
                
                for (int i = 0; i < v; ++i)
                    if (visited[i] == false)
                        DFSUtil(i, visited);
            }
            }
}
