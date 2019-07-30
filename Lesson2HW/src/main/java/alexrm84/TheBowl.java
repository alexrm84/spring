package alexrm84;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TheBowl implements Bowl {

    @Getter
    private Food bowlContents;

    @Autowired
    public void setBowlContents(Food bowlContents) {
        this.bowlContents = bowlContents;
        bowlContents.fillABowl();
    }

    public void bowlEmptying(){
        this.bowlContents = null;
    }
}
