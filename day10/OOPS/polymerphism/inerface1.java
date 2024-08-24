public class inerface1 {
    public static void main(String[] args) {
       king k1 = new king(); 
       k1.move();
    }
}
    /**
     * Innerinerface1
     */
   interface chessplayer {
    void move();//by default abstract public      
    }
    class Rook implements chessplayer{
        public void move(){
            System.out.println("up ,down,left right");
        }   
    }
    class king implements chessplayer{
        public void move(){
            System.out.println("up ,down,left right,diagonal by one step");
        }   
    }

