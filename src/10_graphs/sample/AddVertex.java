package s10_graphs.sample;

import s10_graphs.Graph;

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
