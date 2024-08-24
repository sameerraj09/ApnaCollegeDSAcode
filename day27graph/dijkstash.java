import java.util.*;

public class dijkstash {
    // Class to represent a directed edge in the graph
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    // Method to create the graph with edges
    public static void creategraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // Adding edges to the graph
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 4, 3));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    // Class to represent a node in the priority queue
    static class Pair implements Comparable<Pair> {
        int n;    // Node number
        int path; // Path weight

        public Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        // Overriding compareTo method for priority queue sorting
        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path; // Sort by path weight
        }
    }

    // Dijkstra's algorithm to find shortest paths from src
    public static void dijkstra(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length]; // Array to store shortest distances
        for (int i = 0; i < graph.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE; // Initialize distances to infinity
            } else {
                dist[i] = 0; // Distance to source is 0
            }
        }
        boolean vis[] = new boolean[graph.length]; // Visited array
        PriorityQueue<Pair> pq = new PriorityQueue<>(); // Priority queue for Dijkstra's
        pq.add(new Pair(src, 0)); // Add source to priority queue

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.n]) {
                vis[curr.n] = true; // Mark node as visited
                // Traverse neighbors
                for (int i = 0; i < graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if (dist[u] + wt < dist[v]) { // Update distance if a shorter path is found
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v])); // Add updated distance to priority queue
                    }
                }
            }
        }
        // Print all source to destination shortest paths
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 6; // Number of vertices
        ArrayList<Edge> graph[] = new ArrayList[V]; // Graph representation
        creategraph(graph); // Create the graph with edges
        int src = 0; // Define source node
        dijkstra(graph, src); // Run Dijkstra's algorithm
    }
}
