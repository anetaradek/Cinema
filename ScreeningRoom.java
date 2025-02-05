import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScreeningRoom {
    private String roomName;
    List<String> allSeats = new ArrayList<>();
    public ScreeningRoom(String roomName){
        this.roomName = roomName;
    }

    public void addSeats(String...seat) {
        allSeats.addAll(Arrays.asList(seat));
    }
    public void printAllSeats() {
        for (String seat : allSeats) {
            System.out.println(seat);
        }
    }
    public List<String> getAllSeats() {
        return allSeats;
    }
}
