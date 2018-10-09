package abstractFactoryPattern;

public class EchoDuckFactory  implements AbstractDuckFactory{
    public Quackable createMallardDuck() {
        return new QuackEcho(new MallardDuck());
    }

    public Quackable createRedheadDuck() {
        return new QuackEcho(new RedheadDuck());
    }

    public Quackable createDuckCall() {
        return new QuackEcho(new DuckCall());
    }

    public Quackable createRubberDuck() {
        return new QuackEcho(new RubberDuck());
    }
}
