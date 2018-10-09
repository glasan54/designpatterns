package abstractFactoryPattern;


public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        AbstractDuckFactory originDuckFactory = new OriginDuckFactory();
        AbstractDuckFactory echoDuckFactory = new EchoDuckFactory();

        simulator.simulate(countingDuckFactory);
        simulator.simulate(originDuckFactory);
        simulator.simulate(echoDuckFactory);
    }
    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();


        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeonDuck = new PigeonAdapter(new Pigeon());

        System.out.println("\nDuck Simulator: Abstrct Factory");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeonDuck);

        System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
    }
    private void simulate(Quackable duck) {
        duck.quack();
    }
}

