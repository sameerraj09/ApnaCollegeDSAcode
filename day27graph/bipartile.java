import java.util.*;

public class bipartile {

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

    public static boolean bipartile(ArrayList<Edge> graph[]) {
        // int col[] = new int[graph.length];
        // Queue<Integer> q = new LinkedList<>();
        // for (int i = 0; i < col.length; i++) {
        // col[i] = -1;
        // }
        // for (int i = 0; i < graph.length; i++) {
        // if (col[i] == -1) { // bfs
        // q.add(i);
        // col[i] = 0;

        // while (!q.isEmpty()) {
        // int curr = q.remove();
        // for (int j = 0; j < graph[curr].size(); j++) {
        // Edge e = graph[curr].get(j);

        // // case 1 //if neighbour have diffrent color
        // if (col[e.dest] == -1) {
        // int nextcol = col[curr] == 0 ? 1 : 0;
        // col[e.dest] = nextcol;
        // q.add(e.dest);
        // }
        // // case 2 neighbour have same color
        // else if (col[e.dest] == col[curr]) {
        // return false;
        // }
        // // case 3 continue
        // }
        // }

        // }
        // }
        // return true;
        //
        int col[] = new int[graph.length];
        for (int i = 0; i < col.length; i++) {
            col[i] = -1;
        }
        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) {
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    // for(int j = 0;j<graph[curr].size();j++){
                    // Edge e = graph[curr].get(j);
                    for (Edge e : graph[curr]) {
                        if (e.dest == -1) {
                            col[e.dest] = 1 - col[curr];
                            q.add(e.dest);

                        } else if (col[curr] == col[e.dest]) {
                            return false;
                        }
                    }

                }
            }
        }

        return true;
    }
   
   

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0 vertex
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        // graph[0].add(new Edge(0, 3));
        // 1st vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        // 2nd vertex
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        // 3rd vertex
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        // 4th vertex
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));

    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println(bipartile(graph));

    }
}
