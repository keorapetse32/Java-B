package Lesson15.event;


public class Kickout extends GameEvent {
    
    public Kickout(){
     
    }
    
    public String toString() {
        return "Saved. Kickout ";
    }
    
    public GameEvent[] getNextEvents() {
        GameEvent theEvent[] = {new GainPossession(), new ReceivePass()};
        return theEvent;
    }
    
    public boolean changePlayer() {
        return true;
    }
    
    public boolean changeTeam() {
        return true;
    }
    

    public void setBallPos(int ballPos) {
       super.ballPos = 95;
    }
    
}
