package stockTicker;

public class Player {
    
   public  int x;
   public  int y;
   public  int score;
   public  String id; 
   public  String player;     //
    
   public Player(int x, int y, int score, String player, String id){
       this.x = x;
       this.y = y;
       this.score = score;
       this.id = id;
       this.player = player;
   }

    public String getPlayer() { //todo
        return this.player;
    }

    public void setPlayer(String player) { //todo
        this.player = player;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "[\""+this.player+"\","+this.x+","+this.y+","+this.score+"]";
    }
   
   
   
   
   
    
}
