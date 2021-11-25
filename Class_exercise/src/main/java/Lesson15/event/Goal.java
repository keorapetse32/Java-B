package Lesson15.event;


public class Goal extends GameEvent {
    
    public Goal(){
       
    }
    public String toString() {
        return "GOAL! ";
    }
     
    public GameEvent[] getNextEvents() {
        GameEvent theEvent[] = {new Kickoff()};
        return theEvent;
    }
    
    public boolean changePlayer() {
        return false;
    }
    
    public boolean changeTeam() {
        return false;
    }
    
    

    public void setBallPos(int ballPos) {
       //super.setBallPos(100);
        super.ballPos = 100;
    }
     
}
