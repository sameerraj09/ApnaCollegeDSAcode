import java.util.*;

public class prismalogo {

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

        @Override
        public String toString() {
            return "(" + src + " -> " + dest + " : " + wt + ")";
        }
    }

    // Method to create the graph with edges
    public static void creategraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // Adding edges to the graph
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));
        
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));
        
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));
        
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50)); // Corrected from graph[4] to graph[3]
    }

    // Class to represent a node in the priority queue
    static class Pair implements Comparable<Pair> {
        int v;    // Node number
        int cost;  // Path weight

        public Pair(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }

        // Overriding compareTo method for priority queue sorting
        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost; // Sort by path weight
        }
    }

    public static void prism(ArrayList<Edge> graph[]){
        ArrayList<Edge> ans = new ArrayList<>();
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int finalcost = 0;
        pq.add(new Pair(0, 0)); // Add source to priority queue

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.v]) {
                vis[curr.v] = true; // Mark node as visited
                finalcost += curr.cost;
                // Traverse neighbors
                for (int i = 0; i < graph[curr.v].size(); i++) {
                    Edge e = graph[curr.v].get(i);
                    if (!vis[e.dest]) { // Check if destination node is not visited
                        pq.add(new Pair(e.dest, e.wt)); // Add updated distance to priority queue
                        ans.add(e); // Add edge to MST
                    }
                }
            }
        }

        System.out.println("Total cost of MST: " + finalcost);
        System.out.println("Edges in the MST:");
        for (Edge e : ans) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        int V = 4; // Number of vertices
        ArrayList<Edge> graph[] = new ArrayList[V]; // Graph representation
        creategraph(graph); // Create the graph with edges
        prism(graph); // Run Prim's algorithm
    }
}
