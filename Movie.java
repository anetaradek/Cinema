import java.util.ArrayList;
import java.util.List;

public class Movie {
    String title;
    int length;
    int year;

    public Movie(String title, int length, int year) {
        this.title = title;
        this.length = length;
        this.year = year;
    }

    List<Screening> screenings = new ArrayList<Screening>();
    public void setScreening(){}
    public void printScreening(){
        System.out.println("Title: " + title);
    }

}

