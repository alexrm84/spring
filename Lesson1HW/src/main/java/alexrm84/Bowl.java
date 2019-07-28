package alexrm84;

public class Bowl {
    private Food bowlContents;

    public Bowl(){
        this.bowlContents = null;
    }

    public Bowl(Food bowlContents) {
        this.bowlContents = bowlContents;
    }

    public Food getBowlContents() {
        return bowlContents;
    }

    public void setBowlContents(Food bowlContents) {
        this.bowlContents = bowlContents;
        bowlContents.fillABowl();
    }

    public void bowlEmptying(){
        this.bowlContents = null;
    }
}
