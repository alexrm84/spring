package alexrm84;

public class TheBowl implements Bowl {
    private Food bowlContents;

    public TheBowl(){
        this.bowlContents = null;
    }

    public TheBowl(Food bowlContents) {
        this.bowlContents = bowlContents;
    }

    public void setBowlContents(Food bowlContents) {
        this.bowlContents = bowlContents;
        bowlContents.fillABowl();
    }

    public void bowlEmptying(){
        this.bowlContents = null;
    }
}
