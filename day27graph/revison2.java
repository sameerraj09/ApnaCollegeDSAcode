import java.util.*;

public class revison2 {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src,int dest,int wt){
                   this.src = src;
                   this.dest = dest;
                   this.wt = wt;
        }
    }
   public static ArrayList<Edge>[] createGraph(ArrayList<Edge>[] graph, int v) {
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();  // Initializing each vertex's adjacency list
        }

        // Adding edges to the graph
        graph[0].add(new Edge(0, 1, 10)); // Edge from vertex 0 to 1 with weight 10
        graph[0].add(new Edge(0, 2, 15)); // Edge from vertex 0 to 2 with weight 15
        graph[1].add(new Edge(1, 3, 12)); // Edge from vertex 1 to 3 with weight 12
        graph[2].add(new Edge(2, 4, 10)); // Edge from vertex 2 to 4 with weight 10
        graph[3].add(new Edge(3, 4, 5));  // Edge from vertex 3 to 4 with weight 5
        graph[4].add(new Edge(4, 0, 8));  // Edge from vertex 4 to 0 with weight 8

        return graph;
    }
    public static ArrayList<ArrayList<Edge>>createGraph1(ArrayList<ArrayList<Edge>> graph,int v) {
        for (int i = 0; i < v; i++) {
           graph.add(new ArrayList<>());  // Initializing each vertex's adjacency list
        }

        //Adding edges to the graph
        graph.get(0).add(new Edge(0,1, 10)); // Edge from vertex 0 to 1 with weight 10
        graph.get(0).add(new Edge(0,2, 15)); // Edge from vertex 0 to 2 with weight 15
        graph.get(1).add(new Edge(1,3, 12)); // Edge from vertex 1 to 3 with weight 12
        //  graph.get(2).add(new Edge(2,4, 10)); // Edge from vertex 2 to 4 with weight 10
        // graph.get(3).add(new Edge(3,4, 5));  // Edge from vertex 3 to 4 with weight 5
        // graph.get(4).add(new Edge(4,0, 8));  // Edge from vertex 4 to 0 with weight 8

        return graph;
    }
    //BFS
    public static ArrayList<Integer> bfs (ArrayList<ArrayList<Edge>>graph,int V){
        boolean vis[] = new boolean[V];
        ArrayList<Integer>ans =new ArrayList<>();
        for(int i =0;i<V;i++){
           
            if(!vis[i]){
                bfsutil(vis,graph,i,ans);
            }
        }
        return ans;
    }
    public static ArrayList<Integer> bfsutil(boolean vis[],ArrayList<ArrayList<Edge>>graph,int src,ArrayList<Integer>ans){
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        vis[src] = true;
       
        while(!q.isEmpty()){
            int remove = q.remove();
                ans.add(remove);
                for(Edge e:graph.get(remove)){
                    int dest = e.dest;
                    if(!vis[dest]){
                    q.add(dest);
                    vis[dest] = true;
                }
            
            }
        }
        return ans;
    }
    //DFS
    public static ArrayList<Integer> dfs (ArrayList<ArrayList<Edge>>graph,int V){
        boolean vis[] = new boolean[V];
        ArrayList<Integer>ans =new ArrayList<>();
        for(int i =0;i<V;i++){
           
            if(!vis[i]){
                dfsutil(vis,graph,i,ans);
            }
        }
        return ans;
    }
    public static ArrayList<Integer> dfsutil(boolean vis[],ArrayList<ArrayList<Edge>>graph,int src,ArrayList<Integer>ans){
       ans.add(src);
        vis[src] = true;
        for(Edge e:graph.get(src)){
            if(!vis[e.dest]){
                dfsutil(vis, graph, e.dest, ans);
            }
        }
        return ans;
    }
    
    public static boolean haspath(ArrayList<Edge>graph[],int src,int dest,boolean vis[]){
        if(src==dest) return true;
        vis[src] = true;
        for(Edge e:graph[src]){
            if(!vis[e.dest]&& haspath(graph, e.dest, dest, vis)) return true;
        }
        return false;
    }
    //detect cycle
    public static boolean detectcycyle (ArrayList<ArrayList<Edge>>graph,int V){
        boolean vis[] = new boolean[V];
        ArrayList<Integer>ans =new ArrayList<>();
        for(int i =0;i<V;i++){
           
            if(!vis[i]){
                if (detectcycleutil(vis,graph,  i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detectcycleutil(boolean vis[],ArrayList<ArrayList<Edge>>graph,int curr,int par){
        vis[curr] = true;
        for(Edge e:graph.get(curr)){
            //case 1 if not visited the neighbour
            if(!vis[e.dest]){
                if(detectcycleutil(vis, graph, e.dest,curr)){
                    return true;
                }
            }
            //case 2 
            else if(vis[e.dest] && e.dest!=par){
                return true;
            }
            //case 3 do nothing
           
        }
        return false;
    
    }
      //detect cycle
      public static boolean detectcycyle1 (ArrayList<ArrayList<Edge>>graph,int V){
        boolean vis[] = new boolean[V];
        ArrayList<Integer>ans =new ArrayList<>();
        for(int i =0;i<V;i++){
           
            if(!vis[i]){
                if (detectcycleutil(vis,graph,  i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detectcycleutil1(boolean vis[],ArrayList<ArrayList<Edge>>graph,int curr,int par){
        Queue<Integer> q1 = new LinkedList<>();
        vis[curr] = true;

        for(Edge e:graph.get(curr)){
            //case 1 if not visited the neighbour
            if(!vis[e.dest]){
                if(detectcycleutil(vis, graph, e.dest,curr)){
                    return true;
                }
            }
            //case 2 
            else if(vis[e.dest] && e.dest!=par){
                return true;
            }
            //case 3 do nothing
           
        }
        return false;
    
    }
   //bipartite graph
   // graph coloring
   public static boolean bipartite(ArrayList<ArrayList<Edge>> graph,int V){
    boolean vis [] = new boolean[V];
    int col[] = new int[V];
    Arrays.fill(col,-1); 
    for(int i = 0;i<V;i++){
        if(bipartiteutil(graph,i,vis,col)){
            return true;
        }
        
    }
    return false;
   }
   public static boolean bipartiteutil(ArrayList<ArrayList<Edge>> graph,int start,boolean vis[],int col[]){
    Queue<Integer> q = new LinkedList<>();
    q.add(start);
    vis[start] = true;
    col[start] = 0;
    while(!q.isEmpty()){
         int curr = q.remove();
        
            for(Edge e:graph.get(curr)){
                int dest = e.dest;
                //if neighbour dont have any color
                if(col[dest]==-1){
                    int nextcol = col[curr]==0?1:0;
                    col[dest] = nextcol;
                    q.add(dest);
                    vis[dest] = true;
    
                }
                else if(col[dest]==col[curr]){
                    return false;
                }
             }
        }
         
        
    return true;
   }

public static void main(String[] args) {
    int V = 5;
    
    // Create and print graph using array of ArrayLists
    ArrayList<Edge> graph[] = new ArrayList[V];
    graph = createGraph(graph, V);
    System.out.println("Graph created using ArrayList<Edge>[]:");
    for (int i = 0; i < V; i++) {
        for (Edge e : graph[i]) {
            int src = e.src;
            int dest = e.dest;
            int wt = e.wt;
            System.out.println(src + " ---> " + dest + " wt = " + wt);
        }
    }
    
    // Create and print graph using ArrayList<ArrayList<Edge>>
    ArrayList<ArrayList<Edge>> graph1 = new ArrayList<>();
    graph1 = createGraph1(graph1, V);
    System.out.println("\nGraph created using ArrayList<ArrayList<Edge>>:");
    for (int j = 0; j < V; j++) {
        for (Edge e : graph1.get(j)) {
            int src = e.src;
            int dest = e.dest;
            int wt = e.wt;
            System.out.println(src + " ---> " + dest + " wt = " + wt);
        }
    }
    
    // Perform BFS and DFS
    System.out.println("\nBFS Traversal:");
    ArrayList<Integer> bfsResult = bfs(graph1, V);
    for (int k : bfsResult) {
        System.out.println(k);
    }
    
    System.out.println("\nDFS Traversal:");
    ArrayList<Integer> dfsResult = dfs(graph1, V);
    for (int l : dfsResult) {
        System.out.println(l);
    }
    
    // Check path and cycle detection
    boolean[] vis = new boolean[V];
    System.out.println("\nPath from 1 to 5 exists: " + haspath(graph, 1, 4, vis)); // Note: Changed from 5 to 4
    System.out.println("Graph contains cycle: " + detectcycyle(graph1, V));
    System.out.println("bipartite="+ bipartite(graph1, V));
}   

}
