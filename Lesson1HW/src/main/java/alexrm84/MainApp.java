package alexrm84;

public class MainApp {

    public static void main(String[] args) {
        Bowl bowl = new Bowl();
        Cat cat = new Cat(10, "Константин", bowl);
        Fish fish = new Fish();
        cat.meow();
        bowl.setBowlContents(fish);
        cat.eating();
    }
}
