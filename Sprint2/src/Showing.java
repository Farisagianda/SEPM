import java.io.FileNotFoundException;
import java.util.Scanner;

public class Showing {

    String location;
    String title;
    String day;
    String time;
    Seatmap seats;


    public Showing(String location, String title, String day, String time, Seatmap seats) {
        this.location = location;
        this.title = title;
        this.day = day;
        this.time = time;
        this.seats = seats;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Seatmap getSeats() {
        return seats;
    }

    public void setSeats(Seatmap seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Showing{" +
                "location='" + location + '\'' +
                ", title='" + title + '\'' +
                ", day='" + day + '\'' +
                ", time='" + time + '\'' +'}';
    }

    public static Showing readShowing(Scanner in) throws FileNotFoundException {

        // Instantiating and initializing variables to store information to be used later:
        String location = null;
        String title = null;
        String day = null;
        String time = null;
        Seatmap seats = new Seatmap();


        //Checking that the document has more lines:
        if(in.hasNext()) {

            String line = in.nextLine();
            String[] showing = line.split(",");
            location = showing[0].trim();
            title = showing[1].trim();
            day = showing[2].trim();
            time = showing[3].trim();


        }

        //Creating and returning a question object:
        return new Showing(location, title, day, time, seats);
    }

}
