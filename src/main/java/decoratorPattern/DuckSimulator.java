package decoratorPattern;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();

        simulator.simulate();
    }
    private void simulate() {
        Quackable mallardDuck1 = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable redheadDuck1 = new QuackCounter(new QuackEcho(new RedheadDuck()));
        Quackable duckCall1 = new QuackCounter(new QuackEcho(new DuckCall()));
        Quackable rubberDuck1 = new QuackCounter(new QuackEcho(new RubberDuck()));

        Quackable mallardDuck2 = new QuackEcho(new QuackCounter(new MallardDuck()));
        Quackable redheadDuck2 = new QuackEcho(new QuackCounter(new RedheadDuck()));
        Quackable duckCall2 = new QuackEcho(new QuackCounter(new DuckCall()));
        Quackable rubberDuck2 = new QuackEcho(new QuackCounter(new RubberDuck()));

        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeonDuck = new PigeonAdapter(new Pigeon());

        System.out.println("\nDuck Simulator: With Goose and Pigeon Adapter");

        simulate(mallardDuck1);
        simulate(redheadDuck1);
        simulate(duckCall1);
        simulate(rubberDuck1);

        simulate(gooseDuck);
        simulate(pigeonDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times\n");


        simulate(mallardDuck2);
        simulate(redheadDuck2);
        simulate(duckCall2);
        simulate(rubberDuck2);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times\n");

    }
    private void simulate(Quackable duck) {
        duck.quack();
    }
}

