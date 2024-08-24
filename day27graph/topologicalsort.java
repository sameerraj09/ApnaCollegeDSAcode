import java.util.*;
public class topologicalsort {
    static class Edge {
        int src;
        int dest;
        // int wt;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
            // this.wt = wt;
        }
    }
    public static void topologicalsort(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                utiltopologicalsort(graph, i, vis, s);

            }
        }
        while ((!s.isEmpty())) {
            System.out.println(s.pop() + " ");
        }

    }

    public static void utiltopologicalsort(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                utiltopologicalsort(graph, e.dest, vis, s);

            }

        }
        s.push(curr);
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0 vertex
        graph[0].add(new Edge(0, 2)); // true
        // graph[0].add(new Edge(0, 2));
        // graph[0].add(new Edge(0, 3));
        // 1st vertex
        graph[1].add(new Edge(1, 0));
        // graph[1].add(new Edge(1, 3));

        // 2nd vertex
        graph[2].add(new Edge(2, 3));
        // graph[2].add(new Edge(2, 4));

        // 3rd vertex
        graph[3].add(new Edge(3, 0));
        // graph[3].add(new Edge(3, 4));
        // 4th vertex
        // graph[4].add(new Edge(4, 2));
        // graph[4].add(new Edge(4, 3));

    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        topologicalsort(graph);

    }

}
