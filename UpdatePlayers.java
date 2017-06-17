package stockTicker;

public class UpdatePlayers {
    private String players;
    public Player player;
    
    public UpdatePlayers(Player pl,String key){
        this.player = pl;
        updatePosition(key);
        
    }
    
    private void updatePosition(String key){
        
        if(key.equals("ArrowUp")){
            player.setY(player.getY()+1);
            players = " \"PLAYERS\": [ "+player.toString()+" , [\"P2\", 5, 44, 0] , [\"P3\", -6, 0, 44] , [\"P4\", 10, 44, 44]]}" ;
        }
        if(key.equals("ArrowDown")){
            player.setY(player.getY()-1);
            players = " \"PLAYERS\": [ "+player.toString()+" , [\"P2\", 5, 44, 0] , [\"P3\", -6, 0, 44] , [\"P4\", 10, 44, 44]]}" ;
        }
        if(key.equals("ArrowLeft")){
            player.setX(player.getX()-1);
            players = " \"PLAYERS\": [ "+player.toString()+" , [\"P2\", 5, 44, 0] , [\"P3\", -6, 0, 44] , [\"P4\", 10, 44, 44]]}" ;
        }
        if(key.equals("ArrowRight")){
            player.setX(player.getX()+1);
            players = " \"PLAYERS\": [ "+player.toString()+" , [\"P2\", 5, 44, 0] , [\"P3\", -6, 0, 44] , [\"P4\", 10, 44, 44]]}" ;
        }
        
    }
    
    @Override
    public String toString(){
        return players;
    }
    
    
    
}
