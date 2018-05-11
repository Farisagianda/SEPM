import java.util.ArrayList;

public class Search {

    Showing showing = null;

    public ArrayList<Showing> byTitle(String title, ArrayList<Showing> showings){

        ArrayList<Showing> results = new ArrayList<>();

        for(Showing s : showings){
            if(s.getTitle().equals(title)){
                System.out.println(s.getTitle());
                showing = s;
            }
        }
        return results;
    }

    public ArrayList<Showing> byTime(String time, ArrayList<Showing> showings){

        ArrayList<Showing> results = new ArrayList<>();

        for(Showing s : showings){
            if(s.getTime().equals(time)){
                System.out.println(s.getTime());
                showing = s;
            }
        }
        return results;
    }

    public ArrayList<Showing> byLocation(String location, ArrayList<Showing> showings){

        ArrayList<Showing> results = new ArrayList<>();

        for(Showing s : showings){
            if(s.getLocation().equals(location)){
                System.out.println(s.getLocation());
                showing = s;
            }
        }
        return results;
    }

}
