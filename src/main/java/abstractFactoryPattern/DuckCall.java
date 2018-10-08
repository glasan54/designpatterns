package abstractFactoryPattern;

public class DuckCall implements Quackable {
    public void quack() {
        System.out.print("Kwak\n");
    }
}
