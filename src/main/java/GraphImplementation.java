package main.java;
import java.util.*;


public class GraphImplementation {
// This class represents a directed graph using adjacency list
// representation
    class Graph {
        private int numvertices; // No. of vertices
        private LinkedList<Integer> adj_list[]; //Adjacency Lists

        // Constructor
        Graph(int v) {
            numvertices = v;
            adj_list = new LinkedList[v];
            for (int i = 0; i < v; ++i)
                adj_list[i] = new LinkedList();
        }

        // Function to add an edge into the graph
        void addEdge(int v, int w) {
            adj_list[v].add(w);
        }

        // prints BFS traversal from a given source s
        void BFS(int s) {
            // Mark all the vertices as not visited(By default
            // set as false)
            boolean visited[] = new boolean[numvertices];

            // Create a queue for BFS
            LinkedList<Integer> queue = new LinkedList<Integer>();

            // Mark the current node as visited and enqueue it
            visited[s] = true;
            queue.add(s);

            while (queue.size() != 0) {
                // Dequeue a vertex from queue and print it
                s = queue.poll();
                System.out.print(s + " ");

                // Get all adjacent vertices of the dequeued vertex s
                // If a adjacent has not been visited, then mark it
                // visited and enqueue it
                Iterator<Integer> i = adj_list[s].listIterator();
                while (i.hasNext()) {
                    int n = i.next();
                    if (!visited[n]) {
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
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

            void DFSUtil(int numvertices, boolean[] visited) {
                // Mark the current node as visited and print result
                if (visited[v] == true) {
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
                boolean[] visited = new boolean[v];
                
                for (int i = 0; i < v; ++i)
                    if (!visited[i])
                        DFSUtil(i, visited);
            }
            }
            return graph;
}
}
