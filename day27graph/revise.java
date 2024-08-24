import java.util.*;

public class revise {
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
    static class Pair implements Comparable<Pair>{
        int n;
        int path;
        public Pair (int n,int path){
             this.n = n;
             this.path=path;
        }
    
    @Override
    public int compareTo(Pair p2){
        return this.path-p2.path;
    }
}

    public static void bfs(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        for(int i =0;i<graph.length;i++){{
            if(!vis[i]){
                bfsutil(graph,i,vis);
            }
        }
            
        }
    }
        public static void bfsutil(ArrayList<Edge> graph[],int node,boolean vis[]){
            Queue<Integer> q = new LinkedList<>();
              q.add(node);
             vis[node] = true;
         //   System.out.println(node);
           
            
            while(!q.isEmpty()){
                int curr = q.remove();
                System.out.println(curr);
                for(int i = 0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                     if (!vis[e.dest]) { // Check if the node has been visited
                    q.add(e.dest);
                    vis[e.dest] = true; // Mark as visited when added to the queue
                }
                  
                }
            }

        }
        public static void dfs(ArrayList<Edge>graph[]){
            boolean vis[] = new boolean[graph.length];
            for(int i =0;i<graph.length;i++){
                if(!vis[i]) utildfs(graph, vis,i);
            }
        }
        public static void  utildfs(ArrayList<Edge>graph[],boolean vis[],int curr){
            System.out.println(curr);
            vis[curr] =true;
            for(int i = 0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                if(!vis[e.dest]){
                    utildfs(graph, vis, e.dest);
                }
            }
        }
        public static boolean haspath(ArrayList<Edge>graph[],int src,int dest,boolean[] vis){
            if(src==dest){
                return true;
            }
            vis[src] = true;
            for(int i =0;i<graph[src].size();i++){
                Edge e  = graph[src].get(i);
                if(!vis[e.dest]){
                    if(haspath(graph, e.dest, dest, vis)) return true;
                }
            }
            return false;
        }
        
    
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i  = 0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[0].add(new Edge(0, 3, 2));
        graph[1].add(new Edge(1, 2, 0));
        graph[2].add(new Edge(2, 3, 0));
        graph[3].add(new Edge(3, 1, 0));


    }
    public static boolean detect(ArrayList<Edge> graph[]){ 
        boolean vis[] = new boolean[graph.length];
        for(int i = 0;i<graph.length;i++){
            if(!vis[i]){
                if(utildetect(graph,vis,i,-1)) return true;
            }
            
        }
        return false;

    }
    public static boolean utildetect(ArrayList<Edge> graph[],boolean[]vis,int curr,int parent){
        vis[curr] =true;
        for(int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest] && e.dest!=parent){
                return true;
            }
            else if(!vis[e.dest]){
                if(utildetect(graph,vis, e.dest, e.src)) return true;
            }
        }
        return false;
    }
    public static boolean bipartite(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        int col[] = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i<graph.length;i++){
            col[i]=-1;
        }

        for(int i = 0;i<graph.length;i++){
            if(col[i]==-1){
                q.add(i);
                col[i]=0;
            }
            while (!q.isEmpty()) {
                int curr = q.remove();
                for(int j = 0;j<graph[curr].size();j++){
                    Edge e =graph[curr].get(i);
                    //case 1
                    if(col[e.dest]==-1){
                        int nextcol = col[curr]==0?1 :0;
                        col[e.dest] = nextcol;
                        q.add(e.dest);
                    }
                    else if(col[e.dest]==col[curr]){
                        return false;
                    }

                }
                
            }
           
        }
        return true;
       
    }
    public static boolean detect1(ArrayList<Edge> graph[]){
         boolean vis[]=new boolean[graph.length];
         boolean stack[] = new boolean[graph.length];
         for(int i = 0;i<graph.length;i++){
            if(!vis[i]){
                if(utilcycle(graph,i,vis,stack)) return true;
            }
         }
        return false;
    }
    public static boolean utilcycle(ArrayList<Edge>graph[],int curr,boolean[] vis,boolean[]stack){
        vis[curr] =true;
        stack[curr]=true;
        for(int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(stack[e.dest]) return true;
            if(!vis[e.dest]){

                if(utilcycle(graph, e.dest, vis, stack)) return true;
            }
            

        }
        stack[curr] = false;
        return false;
    }
    public static void topologocal(ArrayList<Edge> graph[]){
        boolean vis[] =new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for(int i = 0;i<graph.length;i++){
            if(!vis[i]){
                utilsort(graph,vis,i,s);
            }
        }
        while(!s.isEmpty()){
            System.out.println(s.pop()+" ");
        }
    }
    public static void utilsort(ArrayList<Edge> graph[],boolean []vis, int curr,Stack<Integer> s){
        vis[curr] = true;
        s.add(curr);
        for(int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                utilsort(graph, vis, e.dest, s);
            }
        }
        s.push(curr);
    }
    public static void indeg(ArrayList<Edge> graph[] ,int []indeg){
        for(int i = 0;i<graph.length;i++){
            for(int j = 0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                indeg[e.dest]++;
            }
        }
    }
    public static void sort(ArrayList<Edge> graph[]){
        int [] indeg = new int[graph.length];
        indeg(graph,indeg);
        Queue<Integer> q =new LinkedList<>();
        for(int i = 0;i<indeg.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.println(curr);
            for(int i = 0;i<graph[curr].size();i++){
             Edge e = graph[curr].get(i);
             indeg[e.dest]--;
             if(indeg[e.dest]==0) q.add(e.dest);
            }
        }
    }
    public static void dijkstra(ArrayList<Edge> graph[],int src){
        int dist[] = new int[graph.length];
        boolean vis[] = new boolean[graph.length];
        for(int i = 0;i<dist.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
            else{
                dist[i]=0;
            }

        }
        PriorityQueue<Pair> pq  = new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        while(!pq.isEmpty()){
        Pair curr = pq.remove();
        if(!vis[curr.n]){
            vis[curr.n]=true;
            for(int i = 0;i<graph[curr.n].size();i++){
               Edge e= graph[curr.n].get(i);
               int  u= e.src;
               int v = e.dest;
               int wt = e.wt;
               if(dist[u]+wt<dist[v]){
                dist[v]= dist[u]+wt;
                pq.add(new Pair(v, dist[v]));
               }
            }
        }
        }
        for(int i = 0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
    }
    public static void bellaman(ArrayList<Edge>graph[],int src){
        int V = graph.length-1;
        int dist[] = new int[graph.length];
        for(int i = 0;i<dist.length;i++){
            if(i!=src){
                dist[i] = Integer.MAX_VALUE;
            }
            else{
                dist[i]=0;
            }
        }
        for(int i = 0;i<V-1;i++){
               for(int j = 0;j<graph.length;j++){
                for(int k = 0;k<graph[j].size();k++){
                    Edge e  = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int w = e.wt;
                    if(dist[u]!=Integer.MAX_VALUE&& dist[u]+w<dist[v]){
                        dist[v]=dist[u]+w;
                    }
                }
               }
        }
        for(int i = 0;i<dist.length;i++){
            System.out.println(dist[i]);
        }
    }

    
    public static void main(String[] args) {
        int V= 4;
        ArrayList<Edge> graph[]= new ArrayList[V];
       createGraph(graph);
    //    bfs(graph);
    //    dfs(graph);
       boolean result = haspath(graph, 0, 5 , new boolean[V]);
    // System.out.println(result);
    // System.out.println(detect(graph));
    System.out.println(bipartite(graph));
   System.out.println(detect1(graph)); 
  topologocal(graph);
  sort(graph);
  dijkstra(graph, 0);
  bellaman(graph, 0);
    }

}
