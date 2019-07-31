package alexrm84;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class TheCat implements Cat {

    private int age;
    private String name;
    @Autowired
    private Bowl bowl;

    public TheCat() {
        this.age = 10;
        this.name = "Чак";
    }

    public void eating(){
        bowl.bowlEmptying();
        System.out.println("Блохастый " + this.name + " наелся и улегся спать на клавиатуру");
    }

    public void meow() {
        System.out.println("Покорми кота, раб!");
    }
}
