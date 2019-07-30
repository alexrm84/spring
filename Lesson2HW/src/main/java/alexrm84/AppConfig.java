package alexrm84;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("alexrm84")
public class AppConfig {

//    @Bean(name = "food")
//    public Food food() {
//        return new Fish();
//    }
//
//    @Bean(name = "bowl")
//    public Bowl bowl() {
//        Bowl bowl = new TheBowl();
//        bowl.setBowlContents(food());
//        return bowl;
//    }
//
//    @Bean(name = "cat")
//    public Cat cat (@Value("10") int age, @Value("Константин") String name) {
//        Cat cat = new TheCat(age, name, bowl());
//        return cat;
//    }
}
