package graph.testcase;

import graph.Graph;

public class AddVertex {
    public static void main(String[] args) {
        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");

        System.out.println("Graph:");
        myGraph.printGraph();

        /*
            EXPECTED OUTPUT:
            ----------------
            Graph:
            {A=[], B=[]}
        */
    }
}
