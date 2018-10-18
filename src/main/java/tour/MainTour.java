package tour;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.ArrayList;
import java.util.List;

public class MainTour {
    private static PackageTour pakage;


    public static void main(String[] arg){
        Tour chiangMai = new SingleTour("Chiangmai",500,15,5);
        Tour chiangRay = new SingleTour("Chaingraay",450,10,5);
        Tour chiangTung = new SingleTour("Chiangtung",400,20,3);
        Tour pechaBun = new SingleTour("Pecha-Bun",300,13,2);
        pakage = new PackageTour("To The Noth.");

        Tour[] tours = {chiangMai, chiangRay, chiangTung , pechaBun};

        creatPakage(tours , pakage);
        Tour[] pakages = {pakage};


        System.out.print("All tours we have.\n");

        for (Tour i : tours) {
            System.out.print(i.getName() + ", Price "+i.getPrice()+", Availiable Seat "+ i.getAvailableSeats() + ".\n");
        }

        underLine();

        System.out.print("All packages we have.\n");
        System.out.print(pakage.getName() + ", Price "+ pakage.getPrice() + ", Availiable Seat " + pakage.getAvailableSeats() + ".\n");

        underLine();



    }

    private static void creatPakage(Tour[] tours , PackageTour packageTour){
        for(Tour i : tours){
            packageTour.addTours(i);
        }
    }

    private static void underLine(){
        System.out.print("-----------------------------------\n");
    }
}
