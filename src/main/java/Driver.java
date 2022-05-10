import main.java.GraphImplementation;

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
        
    }
}