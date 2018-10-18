package tour;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PackageTour implements Tour {

    private String packageName;
    private List<Tour> tours = new ArrayList<Tour>();
    private List<Integer> seats = new ArrayList<Integer>();
    private int availableSeats;

    public PackageTour(String packageName){
        this.packageName = packageName;
    }

    public void addTours(Tour tour){
        tours.add(tour);
        seats.add(tour.getAvailableSeats());
        availableSeats =  Collections.min(seats);
    }


    @Override
    public double getPrice() {
        double total = 0;
        for (Tour t : tours)
            total += t.getPrice();
        return total*0.9;
    }

    public void getTourName(){
        for (Tour i : tours){
            System.out.print(i.getName() + ".\n");
        }
    }


    public String getName() {
        return packageName;
    }


    public int getAvailableSeats() {
        return availableSeats;
    }
}
