import java.util.*;

public class KahnTopoSort {
    // Class to represent a directed edge in the graph
    static class Edge {
        int src, dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    // Function to create the graph using an adjacency list
    public static void createGraph(ArrayList<Edge>[] graph) {
        // Initialize each adjacency list for the vertices
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges to the graph
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    // Function to calculate the indegree of each vertex
    public static void indeg(ArrayList<Edge>[] graph, int[] indeg) {
        // Traverse each vertex's adjacency list and count indegrees
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                indeg[e.dest]++;
            }
        }
    }

    // Function to perform topological sort using Kahn's algorithm
    public static void topsort(ArrayList<Edge>[] graph) {
        int[] indeg = new int[graph.length];
        // Calculate the indegree of each vertex
        indeg(graph, indeg);
        
        Queue<Integer> q = new LinkedList<>();
        // Add all vertices with indegree 0 to the queue
        for (int i = 0; i < indeg.length; i++) {
            if (indeg[i] == 0) {
                q.add(i);
            }
        }
        
        // Perform BFS to generate the topological sort
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " "); // Print the current vertex
            
            // Decrease the indegree of adjacent vertices and add to queue if indegree becomes 0
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if (indeg[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 6; // Number of vertices in the graph
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph); // Create the graph
        topsort(graph); // Perform topological sort
    }
}
