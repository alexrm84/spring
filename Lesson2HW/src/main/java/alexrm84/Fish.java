package alexrm84;

import org.springframework.stereotype.Component;

@Component
public class Fish implements Food {
    public void fillABowl() {
        System.out.println("Положили рыбку в миску");
    }
}
