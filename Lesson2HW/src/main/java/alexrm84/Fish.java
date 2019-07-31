package alexrm84;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@NoFood(otherFood = DryFood.class)
public class Fish implements Food {
    public void fillABowl() {
        System.out.println("Положили рыбку в миску");
    }
}
