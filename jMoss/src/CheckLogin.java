import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;

public class CheckLogin {

    public static void main(String[] args) throws FileNotFoundException {

        HashSet<Login> logins = new HashSet<>();

        Login l = null;

        Scanner reader = new Scanner(new FileReader("C:\\Users\\Camilla\\IdeaProjects\\SEPM\\jMoss\\src\\User.txt"));
        Scanner in = new Scanner(System.in);


        while(reader.hasNext()){
            l = ReadLogin.readLogin(reader);
            logins.add(l);
        }

        do{

            if(ReadLogin.loginTrue(ReadLogin.getUserLogin(in), logins)){
                System.out.println("Login successful");
                do{
                    //Printing out the menu:
                    System.out.println("========"
                            + '\n'
                            + "Options:"
                            + '\n'
                            + "========"
                            + '\n'
                            + "S: Search"
                            + '\n'
                            + "B: Booking"
                            + '\n'
                            + "V: View timetable"
                            + '\n'
                            + "D: Delete booking"
                            + '\n'
                            + "Q: Quit"
                            + '\n'
                            + "Please select an option:");
                }while(!in.nextLine().toLowerCase().equals("q"));
            }else{
                System.out.println("Please try again or type Q to finish");
            }
        }while(!in.nextLine().toLowerCase().equals("q"));









    }
}
