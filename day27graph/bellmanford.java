import java.util.*;
public class bellmanford{
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

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }

public static void bellmanford(ArrayList<Edge> graph[],int src){
    int dist [] = new int[graph.length];
    for(int i = 0;i<graph.length;i++){
        if(i!=src){
            dist[i]=Integer.MAX_VALUE;
        }
    }
    int V = graph.length;
    //outer loop for relaxation V-1 time
    for(int i = 0;i<V-1;i++){
         //0(E*v) tc
        //0(E) for finding edges
        //now find edge and do relaxation in each edge
        for(int j = 0;j<graph.length;j++){
            for(int k = 0;k<graph[i].size();k++){
                Edge e = graph[i].get(k);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;
                if(dist[u]!=Integer.MAX_VALUE && dist[u]+wt<dist[v]){  //relax
                    dist[v] =dist[u]+wt;
                }

            }
        }
    }
    for(int i = 0;i<dist.length;i++){
        System.out.println(dist[i]);
    }
   }

  

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        ArrayList<Edge> graph[] = new ArrayList[V]; // Graph representation
        creategraph(graph); // Create the graph with edges
        int src = 0; // Define source node
        bellmanford(graph, src);
      
    }
}


     

   