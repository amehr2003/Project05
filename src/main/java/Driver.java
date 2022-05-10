import main.java.GraphImplementation;
import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;

public class Driver
{
    public static void main(String args [])
    {
        GraphImplementation driverGraph = new GraphImplementation(7);

//with seven nodes we have 14 edges
        driverGraph.addEdge(0,1);
        driverGraph.addEdge(1,0);
        driverGraph.addEdge(2,1);
        driverGraph.addEdge(1,2);
        driverGraph.addEdge(3,2);
        driverGraph.addEdge(2,3);
        driverGraph.addEdge(4,3);
        driverGraph.addEdge(3,4);
        driverGraph.addEdge(5,4);
        driverGraph.addEdge(4,5);
        driverGraph.addEdge(6,5);
        driverGraph.addEdge(5,6);
        driverGraph.addEdge(7,6);
        driverGraph.addEdge(6,7);

        LinkedList<Integer> driverQueue = new LinkedList<Integer>();
        while (!driverQueue.isEmpty()) {
            Integer piece = driverQueue.poll();
            System.out.print(piece + " ");
        }

        Stack<Integer> driverStack = new Stack<Integer>;

        System.out.println("DFS Order: ");
        while (!driverStack.isEmpty()) {
            Integer piece = driverStack.pop();
            System.out.print(piece + " ");
        }
    }
}