import java.util.ArrayList;
import java.util.List;

public class Cinema {
    String name;
    String address;
    List<ScreeningRoom> rooms = new ArrayList<>();
    List <Screening> screenings = new ArrayList<>();

    public Cinema(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public void addScreening(Screening screening){
        this.screenings.add(screening);
    }
    public void addRoom(ScreeningRoom room){
        this.rooms.add(room);
    }

    public void printProgramme() {
       screenings.forEach(Screening::printScreening);
    }
   // public void findMovie(String title){
      //  if(screenings.contains();
   // }
}
