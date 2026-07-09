class SeatNotAvailableException extends Exception {
    public SeatNotAvailableException(String message) {
        super(message);
    }
}

class Movie {
    private String name;
    private int availableSeats;

    public Movie(String name, int availableSeats) {
        this.name = name;
        this.availableSeats = availableSeats;
    }

    public void bookTicket(int seats) throws SeatNotAvailableException {

        if (seats <= 0) {
            throw new SeatNotAvailableException("Invalid number of seats. Seats must be greater than 0.");
        }

        if (seats > availableSeats) {
            throw new SeatNotAvailableException(
                "Not enough seats available. Only " + availableSeats + " seats left."
            );
        }

        availableSeats -= seats;
        System.out.println(seats + " seats booked successfully for " 
                           + name + ". Remaining seats: " + availableSeats);
    }
}

public class MovieBooking {
    public static void main(String[] args) {

        Movie movie = new Movie("Harry Potter", 10);

        try {
            movie.bookTicket(5);   
            movie.bookTicket(7);   
        } 
        catch (SeatNotAvailableException e) {
            System.out.println("Booking Failed: " + e.getMessage());
        }
    }
}
