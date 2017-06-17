package stockTicker;


import java.io.*;
import java.util.logging.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet(urlPatterns = {"/stream"})
public final class UpdateGame extends HttpServlet {

    
    volatile String jsonObj;
    public String key;
    

    //public String player = "P1";
    //public String id = "id1";
    public Player pl1 = new Player(0,0,0,"P1","id1");
    public Player pl2 = new Player(0,40,0,"P2","id2");
    public Player pl3 = new Player(40,40,0,"P3","id3");
    public Player pl4 = new Player(40,0,0,"P4","1d4");
    
    
    UpdatePlayers up;
    UpdateCanvas uc;
    
   
    @Override
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/event-stream");
        response.setCharacterEncoding("UTF-8");

        try (final PrintWriter out = response.getWriter()) {
            
            while (!Thread.interrupted()) {
                out.println();
                out.flush();
                Logger.getGlobal().log(Level.INFO, "Sent " + jsonObj);
                synchronized (this) {
                    wait();
                    out.print("data: ");
                    out.print(uc);
                    out.println(up);
                }
            }
        } catch (InterruptedException ex) {
            Logger.getGlobal().log(Level.INFO, "Exiting");
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               
                
        synchronized (this) {
           key = request.getReader().readLine();
               up = new UpdatePlayers(pl1,key);
               uc = new UpdateCanvas(key);
               notifyAll();
               Logger.getGlobal().log(Level.INFO, "Received " + key);
           
            
        }
        
        response.setStatus(HttpServletResponse.SC_ACCEPTED);
        
               
    }
    

    @Override
    public void destroy() {
        
        }
    
}
