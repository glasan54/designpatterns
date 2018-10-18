package tour;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.ArrayList;
import java.util.List;

public class MainTour {
    private static PackageTour pakages;


    public static void main(String[] arg){
        Tour chiangMai = new SingleTour("Chiangmai",500,15,5);
        Tour chiangRay = new SingleTour("Chaingraay",450,10,5);
        Tour chiangTung = new SingleTour("Chiangtung",400,20,3);
        Tour pechaBun = new SingleTour("Pecha-Bun",300,13,2);
        pakages = new PackageTour("To The Noth.");

        Tour[] tours = {chiangMai, chiangRay, chiangTung , pechaBun};

        creatPakage(tours);

        System.out.print("All tours we have now.\n");

        for (Tour i : tours) {
            System.out.print(i.getName() + " Price "+i.getPrice()+" Availiable Seat "+i.getAvailableSeats()+ ".\n");
        }

    }

    private static void creatPakage(Tour[] tours){
        for(Tour i : tours){
            pakages.addTours(i);
        }
    }
}
