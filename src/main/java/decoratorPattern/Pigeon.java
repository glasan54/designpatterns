package decoratorPattern;

public class Pigeon {
    private int ble = 2;
    public void coo(){
        while (ble != 0){
            System.out.print("Coo\n");
            ble -= 1;
        }

    }
}
