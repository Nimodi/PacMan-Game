package stockTicker;

public class UpdateCanvas {
    private String dots;
    
    public UpdateCanvas(String key){
        updatePosition(key);
        
    }
    
    private void updatePosition(String key){
        
        if(key.equals("ArrowUp")){
            dots = "{ \"DOTS\": [[\"B\", 0, 0] , [\"G\", 0, 0] ,  [\"R\", 34, 7], [\"B\", 25, 8] , [\"G\", 28, 1] ,  [\"R\", 42, 17],[\"B\", 15, 36] , [\"G\", 22, 22] ,  [\"R\", 5, 37], [\"B\", 25, 28] , [\"G\", 9, 39] ,  [\"R\", 10, 21] ] ,";
        }
        if(key.equals("ArrowDown")){
            dots = "{ \"DOTS\": [[\"B\", 1, 1] , [\"G\", 1, 1] ,  [\"R\", 34, 7], [\"B\", 25, 8] , [\"G\", 28, 1] ,  [\"R\", 42, 17],[\"B\", 15, 36] , [\"G\", 22, 22] ,  [\"R\", 5, 37], [\"B\", 25, 28] , [\"G\", 9, 39] ,  [\"R\", 10, 21] ] ,";
        }
        if(key.equals("ArrowLeft")){
            dots = "{ \"DOTS\": [[\"B\", 2, 2] , [\"G\", 1, 1] ,  [\"R\", 34, 7], [\"B\", 25, 8] , [\"G\", 28, 1] ,  [\"R\", 42, 17],[\"B\", 15, 36] , [\"G\", 22, 22] ,  [\"R\", 5, 37], [\"B\", 25, 28] , [\"G\", 9, 39] ,  [\"R\", 10, 21] ] ,";
        }
        if(key.equals("ArrowRight")){
            dots = "{ \"DOTS\": [[\"B\", 3, 3] , [\"G\", 1, 1] ,  [\"R\", 34, 7], [\"B\", 25, 8] , [\"G\", 28, 1] ,  [\"R\", 42, 17],[\"B\", 15, 36] , [\"G\", 22, 22] ,  [\"R\", 5, 37], [\"B\", 25, 28] , [\"G\", 9, 39] ,  [\"R\", 10, 21] ] ,";
        }
        
    }
    
    @Override
    public String toString(){
        return dots;
    }
    
}

