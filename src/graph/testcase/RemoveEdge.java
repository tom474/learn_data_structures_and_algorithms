package graph.testcase;

import graph.Graph;

public class RemoveEdge {
    public static void main(String[] args) {
        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("B", "C");

        System.out.println("Graph before removeEdge():");
        myGraph.printGraph();

        myGraph.removeEdge("A", "B");

        System.out.println("\nGraph after removeEdge():");
        myGraph.printGraph();

        /*
            EXPECTED OUTPUT:
            ----------------
            Graph before removeEdge():
            {A=[B, C], B=[A, C], C=[A, B]}

            Graph after removeEdge():
            {A=[C], B=[C], C=[A, B]}
        */
    }
}
