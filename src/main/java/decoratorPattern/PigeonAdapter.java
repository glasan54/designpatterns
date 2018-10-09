package decoratorPattern;

public class PigeonAdapter implements Quackable {
    private Pigeon pigeon;
    private int voic = 2;

    public PigeonAdapter(Pigeon pigeon){
        this.pigeon = pigeon;
    }

    public void quack() {
        while(voic != 0){
            pigeon.coo();
            voic -=1;
    }}
}
