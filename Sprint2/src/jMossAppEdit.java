import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class jMossAppEdit {

    public static void main(String [] args) throws FileNotFoundException {

        //List to store question objects:
        ArrayList<Showing> showings = new ArrayList<Showing>();

        //Empty showing object to store new question depending on type:
        Showing s = null;

        //Scanner to read file of questions and answers:
        Scanner scanner = new Scanner(new FileReader("H:\\Year 4\\Semester 1\\SE Project Management\\Assignments\\Scripts\\Sprint 2\\Github S2\\movies.txt"));

        //While there are more lines, the scanner should read the next line:
        while (scanner.hasNext()) {

            s = Showing.readShowing(scanner);

            //Adding the question to the list:
            showings.add(s);
        }

        HashSet<Login> logins = new HashSet<Login>();

        Login l = null;
        Scanner reader = new Scanner(new FileReader("H:\\Year 4\\Semester 1\\SE Project Management\\Assignments\\Scripts\\Sprint 2\\Github S2\\User.txt"));
        Scanner in = new Scanner(System.in);


        while(reader.hasNext()){
            l = Login.readLogin(reader);
            logins.add(l);
        }

        do{

            if(Login.loginTrue(Login.getUserLogin(in), logins)){
                System.out.println("Login successful");
                do{
                  
                 /* System.out.println();
                  boolean flag = true;
                  while(flag)
                  {
                    mainMenu();
                    
                    Scanner sca = new Scanner(System.in);
                    int choice = sca.nextInt();
                    
                    switch(choice)
                    {
                      case 1:
                        seacrh();
                        break;
                        
                      case 2:
                        booking();
                        break;
                        
                      case 3:
                        viewTimetable();
                        break;
                        
                      case 4:
                        flag = false;
                        break;
                        
                      default:
                        System.out.println("You have entered an invalid option. Please enter a number between 1-6.");
                      break:
                  */
                  
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
                   // for(Showing sh : showings){
                       // System.out.println(sh);
                    //}
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
    
    public void mainMenu()
    {
      System.out.println("      Main Menu: \n" +
                         "====================\n" +
                         "1. Seacrh \n" +
                         "2. Booking \n" +
                         "3. View Timetable \n" +
                         "4. Logout \n");
    }
    
    public void quitMenu()
    {
      System.out.println();
      boolean flag = true;
      
      while(flag)
      {
        System.out.println("1. Another seacrh \n" +
                           "2. Back to main menu");
        
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        
        switch(choice)
        {
          case 1:
            search();
            break;
            
          case 2:
            flag = false;
          break;
          
          default:
            System.out.println("Select one of the two options\n");
            System.out.println();
        }
        
        scan.close();
      }
    }
    
    
    public void search()
    {
      //quitMenu();
      //System.out.println(quitMenu());
    }
    
    public void booking()
    {
      //quitMenu();
      //System.out.println(quitMenu());
    }
    
    public void viewTimetable()
    {
      //quitMenu();
      //System.out.println(quitMenu());
    }
    
}