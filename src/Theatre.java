import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private final String theatreName;
    private final List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }
    public String getTheatreName() {
        return theatreName;
    }
    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = null;
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }
        if (requestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
        return requestedSeat.reserve();
    }
    // for testing reasons
    public void getSeats() {
        for (Seat seat : seats) System.out.println(seat.getSeatNumber());
    }
    private static class Seat {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " has been reserved.");
                return true;
            } else {
                return false;
            }
        }
        public boolean cancelTicket() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation for seat " + seatNumber + " cancelled");
                return true;
            }else{
                System.out.println("An error occurred during cancellation of seat " + seatNumber);
                return false;
            }
        }

    }
}
