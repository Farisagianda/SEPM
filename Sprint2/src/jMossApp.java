import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class jMossApp {

    public static void main(String [] args) throws FileNotFoundException {

        //List to store question objects:
        ArrayList<Showing> showings = new ArrayList<>();

        //Empty showing object to store new question depending on type:
        Showing s = null;

        //Scanner to read file of questions and answers:
        Scanner scanner = new Scanner(new FileReader("C:\\Users\\Camilla\\IdeaProjects\\SEPM\\jMoss\\src\\movies.txt"));

        //While there are more lines, the scanner should read the next line:
        while (scanner.hasNext()) {

            s = Showing.readShowing(scanner);

            //Adding the question to the list:
            showings.add(s);
        }

        for(Showing sh : showings){
            System.out.println(sh);
        }
    }
}
