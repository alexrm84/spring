package alexrm84;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Fish implements Food {
    public void fillABowl() {
        System.out.println("Положили рыбку в миску");
    }
}
