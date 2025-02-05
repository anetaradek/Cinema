import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Screening {
    Movie movie;
    int dateTimeOfScreening;
    ScreeningRoom screeningRoom;
    List<String> availableSeats = screeningRoom.getAllSeats();
    Map<Integer,String> bookedSeats = new HashMap<>();
    Map<Integer,String> boughtTickets = new HashMap<>();

    public Screening(Movie movie, int dateTimeOfScreening, ScreeningRoom screeningRoom) {
        this.movie = movie;
        this.dateTimeOfScreening = dateTimeOfScreening;
        this.screeningRoom = screeningRoom;
    }
    public void printScreening(){
        System.out.println(movie.title+"("+movie.year+"): "+dateTimeOfScreening);
    }
    public void reserveSeat(String... seat) {
        for (int i = 0; i < seat.length; i++) {
            if (availableSeats.contains(seat[i])) {
                availableSeats.remove(seat[i]);
                bookedSeats.put(Integer.valueOf(seat[i]), (seat[i]));
                System.out.println("Reserved seat " + seat[i]);
            }
        }
    }

    public void reserveSeat(Integer user, String... seat) {
        for (int i = 0; i < seat.length; i++) {
            if (availableSeats.contains(seat[i])) {
                availableSeats.remove(seat[i]);
                bookedSeats.put(user, seat[i]);
                System.out.println("Reserved seat " + seat[i]);
            }
        }

    }

    public void buyTicket(String... seat) {
        for (int i = 0; i < seat.length; i++) {
            if (availableSeats.contains(seat[i])) {
                availableSeats.remove(seat[i]);
                boughtTickets.put(Integer.valueOf(seat[i]), seat[i]);
                System.out.println("You have bought ticket for seat: " + seat[i]);
            }
        }
    }

    public void buyTicket(String user, int... seat) {
        for (int i = 0; i < seat.length; i++) {
            if (availableSeats.contains(seat[i])) {
                availableSeats.remove(seat[i]);
                boughtTickets.put(seat[i], user);
                System.out.println("You have bought ticket for seat: " + seat[i]);
            }
        }

    }

    public void printAvailableSeats() {
        System.out.println("Available seats: ");
        for (String seat : availableSeats) {
            System.out.println(seat);
        }
    }
    public void printBookedSeats(Integer user) {

        List<Integer> yourSeats = bookedSeats.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(user)) // Filtrujemy po wartości
                .map(Map.Entry::getKey) // Pobieramy klucze
                .collect(Collectors.toList()).reversed(); // Zbieramy do listy
        System.out.println("Booked seats: ");
        for (Integer seat : yourSeats) {
            System.out.println(seat);
        }
    }
}
