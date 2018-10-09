package decoratorPattern;

public class QuackEcho implements Quackable{
    private Quackable duck;

    public QuackEcho(Quackable duck){this.duck = duck;}

    public void quack() {
        duck.quack();
        echo();
    }

    private void echo(){
        System.out.print("Echo: ");
        duck.quack();
    }
}
