public class mindist5 {
    public static double distance(String str){
        int x =0;
        int y =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='W'){
              x--;
            }
            else if(str.charAt(i)=='E'){
                x++;
            }
            else if(str.charAt(i)=='N'){
                y++;
            }
            else{
                y--;
            }
        }
        double dist = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return dist;
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(distance(str));
    }
}
