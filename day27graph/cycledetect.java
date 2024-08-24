import java.util.*;

public class cycledetect{
    static class Edge {
        int src;
        int dest;
        //int wt;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
           // this.wt = wt;
        }
    }
    public static boolean cycledetect(ArrayList<Edge>graph[]){
        boolean vis[]  = new boolean[graph.length];
        for(int i = 0 ;i<graph.length;i++){
          if(!vis[i]){
            if(utilcycledetect(graph,vis,i,-1)){//-1 bcs no parent
                   return true;
            }
          }
        
        }
        return false;
    }
    public static boolean utilcycledetect(ArrayList<Edge>graph[],boolean vis[],int curr,int par){
        vis[curr]=true;
        for(int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            //case 3
            if(!vis[e.dest]){
                if(utilcycledetect(graph, vis, e.dest, curr))
                return true;
            }
            //case 1
            else if(vis[e.dest] &&e.dest!=par){
                return true;
            }
            //case 
            //do nothing
        }
        return false;
    }
    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0 vertex
        graph[0].add(new Edge(0, 1));
       // graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        // 1st vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
       
        // 2nd vertex
      //  graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
       
        // 3rd vertex
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        // 4th vertex
        graph[4].add(new Edge(4, 3));
        System.out.println(cycledetect(graph));
    }

   

    
    

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
       
        System.out.println(cycledetect(graph));
        
    }
}
