package alexrm84;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
//        TheBowl bowl = new TheBowl();
//        TheCat cat = new TheCat(10, "Константин", bowl);
//        Food food = new Fish();
//        cat.meow();
//        bowl.setBowlContents(food);
//        cat.eating();
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Cat cat = context.getBean("cat", Cat.class);
        cat.eating();
    }
}
