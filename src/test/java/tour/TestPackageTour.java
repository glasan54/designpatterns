package tour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPackageTour {

    @Test
    public void test(){
        SingleTour chiangMai = new SingleTour("Chiangmai",500,15,5);
        SingleTour chiangRay = new SingleTour("Chaingray",450,10,5);

        PackageTour packageTour = new PackageTour("Noth Tours");

        packageTour.addTours(chiangMai);

        assertEquals(15,packageTour.getAvailableSeats());

        packageTour.addTours(chiangRay);

        assertEquals(10,packageTour.getAvailableSeats());


    }
}
