package alexrm84;

public class TheCat implements Cat {
    private int age;
    private String name;
    private Bowl bowl;

    public TheCat(int age, String name, Bowl bowl) {
        this.age = age;
        this.name = name;
        this.bowl = bowl;
    }

    public void eating(){
        bowl.bowlEmptying();
        System.out.println("Блохастый наелся и улегся спать на клавиатуру");
    }
}
