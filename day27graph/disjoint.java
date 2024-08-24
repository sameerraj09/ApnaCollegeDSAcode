public class disjoint {
    static int n = 7;
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
        return par[x]=find(par[x]);
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
    public static void main(String[] args) {
        init();
        System.out.println(find(3));
        union(1, 3);
        System.out.println(find(3));
        
    }
}
