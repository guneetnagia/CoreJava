package datastructures.graphs;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        System.out.println("Adding A and B vertex");
        graph.addVertex("A");
        graph.addVertex("B");
        graph.printGraph();
        System.out.println("Adding edge between A and B vertex");
        graph.addEdge("A","B");
        graph.printGraph();
        System.out.println("Removing edge between A and B vertex");
        graph.removeEdge("A","B");
        graph.printGraph();
    }
}
