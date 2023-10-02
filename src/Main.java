public class Main {
    public static void main(String[] args) {

        Theatre theatre = new Theatre("Roman", 8, 12);

//        theatre.getSeats();
        theatre.reserveSeat("H12");
        if (theatre.reserveSeat("H12")){
            System.out.println("Please pay for the seat. ");
        }else {
            System.out.println("Sorry seat already reserved.");
        }

    }
}