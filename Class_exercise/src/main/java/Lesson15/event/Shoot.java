package Lesson15.event;


public class Shoot extends GameEvent {
            public Shoot(){
        

        
    }
    
    public String toString() {
        return "Shoots ";
    }
    
    public GameEvent[] getNextEvents() {
        GameEvent theEvent[] = { new Goal(), new Kickout()};
        return theEvent;
    }
    
    public boolean changePlayer() {
        return false;
    }
    
    public boolean changeTeam() {
        return false;
    }
    

    public void setBallPos(int currBallPos) {
        super.ballPos = currBallPos;

    }
    
}
