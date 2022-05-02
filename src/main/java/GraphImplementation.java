package main.java;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class GraphImplementation {

    List<List<Node>> adj_list = new ArrayList<>();
    public graph BFTraversal(originVertex)
    {
            //traversalOrder = a new queue for the resulting traversal order
            //vertexQueue = a new queue to hold vertices as they are visited
            // Mark originVertex as visited
            // traversalOrder.enqueue(originVertex)
            // vertexQueue.enqueue(originVertex)
        while (!vertexQueue.isEmpty())
        {
            frontVertex = vertexQueue.dequeue()
        while (frontVertex has a neighbor) {
            nextNeighbor = next neighbor of frontVertex if (nextNeighbor is not visited)
            {
            } }
        }
        Mark nextNeighbor as visited
        traversalOrder.enqueue(nextNeighbor)
        vertexQueue.enqueue(nextNeighbor)
        return traversalOrder;
    }

    public void DFTraversal()
    {
        traversalOrder = a new queue for the resulting traversal order
        vertexStack = a new stack to hold vertices as they are visited
        Mark originVertex as visited traversalOrder.enqueue(originVertex)
        vertexStack.push(originVertex)
        while (!vertexStack.isEmpty()) {
            topVertex = vertexStack.peek()
            if (topVertex has an unvisited neighbor) {
                nextNeighbor = next unvisited neighbor of topVertex
                Mark nextNeighbor as visited traversalOrder.enqueue(nextNeighbor)
                vertexStack.push(nextNeighbor)
            }
else // All neighbors are visited vertexStack.pop()
        }
        return traversalOrder
    }

}
