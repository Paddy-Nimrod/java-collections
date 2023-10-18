import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Theatre theatre = new Theatre("Olympian", 8, 12);


        if (theatre.reserveSeat("D12")) {
            System.out.println("Please pay for the reserved seat D12");
        } else {
            System.out.println("Seat already reserved.");
        }

        List<Theatre.Seat> reverseSeat = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeat);
        printList(reverseSeat);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 22.99));
        priceSeats.add(theatre.new Seat("A00", 22.98));
        priceSeats.sort(Theatre.PRICE_ORDER);
        printList(priceSeats);
    }


    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " Ksh." + seat.getPrice());
        }
        System.out.println();
        System.out.println("=====================================================================================");
    }


}