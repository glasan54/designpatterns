package tour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSingleTour {

    @Test
    public void test(){
        SingleTour chiangMai = new SingleTour("Chiangmai",500,15,5);
        SingleTour chiangRay = new SingleTour("Chaingray",450,10,5);

        assertEquals(500,chiangMai.getPrice());

        chiangRay.setSeat(10);
        assertEquals("Reserved Seats is " + chiangRay.getReservedSeats() + " now.\n",chiangRay.checkSearts());


    }

}
