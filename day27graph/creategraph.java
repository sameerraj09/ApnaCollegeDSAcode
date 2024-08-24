import java.util.ArrayList;

public class creategraph {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src,int dest,int wt){
            this.src = src;
            this.dest =dest;
            this.wt = wt;
        }
    }
    public static void main(String[] args) {
        //int arr[] = new int[n]
        int V = 5;
        ArrayList<Edge> graph []= new ArrayList[V]; //null  -> empty arrayList
        for(int i = 0 ;i<V;i++){
             graph[i] = new ArrayList<>();
        }
        // 0 vertex
        graph[0].add(new Edge(0, 1, 5));
        //1st vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        //2nd vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 4));

        //3rd vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));
        //4th vertex
        graph[4].add(new Edge(4, 2, 2));

        //2's neighbours
        for(int i =0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest);
        }
    }
}
