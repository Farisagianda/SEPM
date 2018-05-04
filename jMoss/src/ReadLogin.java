import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class ReadLogin {



    public static Login readLogin(Scanner in) throws FileNotFoundException{
        String userName = null;
        String password = null;

        if(in.hasNext()){
            String n = in.nextLine();
            String[] login = n.split(".");
            userName = login[0];
            password = login[1];
            }

            return new Login(userName, password);

    }

    public static Login getUserLogin(Scanner in){
        System.out.println("Please input username:");
        String inputUserName = in.nextLine();
        System.out.println("Please input password");
        String inputPassword = in.nextLine();
        return new Login(inputUserName, inputPassword);
    }

    public static boolean loginTrue(Login l, HashSet h){
        return h.contains(l);

        }
    }









