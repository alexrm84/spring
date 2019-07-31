package alexrm84;

import org.springframework.stereotype.Component;


public class DryFood implements Food {
    public void fillABowl() {
        System.out.println("Насыпали корма в миску");
    }
}
