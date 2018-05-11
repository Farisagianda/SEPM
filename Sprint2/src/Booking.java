public class Booking {

    private String name;
    private String email;
    private String suburb;

    public Booking(String name, String email, String suburb){
        this.name = name;
        this.email = email;
        this.suburb = suburb;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSuburb() {
        return suburb;
    }
}
