public class Graph2D {

    // implentation of graph using 2D array

    private int[][] graph;
    private int vertices;

    // constructor for graph
    public Graph2D(int vertices) {
        this.vertices = vertices;
        graph = new int[vertices][vertices];
    }

    // add edge
    public void addEdge(int source, int destination) {

        graph[source][destination] = 1;

        // add back edge for undirected graph
        graph[destination][source] = 1;
    }

    // get vertex count of the graph
    public int getVertexCount() {
        return vertices;
    }

    // get edge count of the graph
    public int getEdgesCount() {
        int count = 0;
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                if (graph[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (int j = 0; j < vertices; j++) {
                if (graph[i][j] == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph2D graph = new Graph2D(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        graph.printGraph();

        System.out.println("edges: " + graph.getEdgesCount());

        System.out.println("Vertex count: " + graph.getVertexCount());
    }

}
