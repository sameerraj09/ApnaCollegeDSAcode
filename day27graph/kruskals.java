import java.lang.reflect.Array;
import java.util.*;  
public class kruskals {
   static class Edge implements Comparable<Edge>{
    int src;
    int dest;
    int wt;
    public Edge(int src, int dest,int wt){
        this.src = src;
        this.dest = dest;
        this.wt = wt;
    }
    @Override
    public int compareTo(Edge e2){
        return this.wt-e2.wt;
    }
   }
   public static void creategraph(ArrayList<Edge> edges){
    
     edges.add(new Edge(0, 1, 10));
     edges.add(new Edge(0, 2, 15));
     edges.add(new Edge(0, 3, 30));
     edges.add(new Edge(2, 3, 40));
   }
   static int n = 4;
   static int rank[] = new int[n];
   static int par[] = new int[n];
   public static void init(){
       for(int i =0;i<n;i++){
           par[i]=i;
       }
   }
   public static int find(int x){
       if(x==par[x]){
           return x;
       }
       return par[x]=find(par[x]); //path compression
   }
   public static void union(int a,int b){
       int para=find(a);
       int parb=find(b);
       if(rank[para]==rank[parb]){//make parent anyone
           par[parb]=para;
           rank[para]++;  //increase the rank or height
       }
       else if(para>parb){
            par[parb]=para; //parent of a will be the parent
       }
       else{
           par[para] = parb;
       }
}
public static void kruskal(ArrayList<Edge> edges,int V){
  init();
  Collections.sort(edges);
  int mstcost = 0;
  int count=0;
  for(int i = 0;count<V-1;i++){
 Edge e = edges.get(i);
 //src dest
 int parA = find(e.src);
 int parB = find(e.dest);
 if(parA!=parB){  //not making loop different set
    union(e.src, e.dest);
    mstcost+=e.wt;
    count++;
 }
  }
System.out.println(mstcost);
}
public static void main(String[] args) {
  int V = 4;
  ArrayList<Edge> edges = new ArrayList<>();
  creategraph(edges);
  kruskal(edges, V);
}
}
