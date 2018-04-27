public class Viewing {

    private String movieName;
    private String location;
    private String time;

    public Viewing(String movieName, String location, String time) {
        this.movieName = movieName;
        this.location = location;
        this.time = time;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getLocation() {
        return location;
    }

    public String getTime() {
        return time;
    }
}
