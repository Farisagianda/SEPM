import java.util.*;
import java.io.*;
import java.text.*;

public class MockUp
{ 
  
  public static void main(String[] args)
  {
    men();
  }
  
  static void men()
  {
    System.out.println();
    boolean flag = true;
    
    while(flag)
    {
      mainMenu();
      
      Scanner sca = new Scanner(System.in);
      int choice = sca.nextInt();
      
      switch(choice)
      {
        case 1:
          search();
          break;
        
        case 2:
          booking();
          break;
          
        case 3:
          viewTimetable();
          break;
          
        case 4:
          logout();
          break;
          
        default:
          System.out.println("You have entered an invalid option. Please enter a number between 1-6.");
          break;
      }
      
      sca.close();
    }
  }
  
  static void mainMenu()
  {
    System.out.println();
    System.out.println("      Main Menu: \n" +
                       "======================\n" +
                       "1. Seacrh \n" +
                       "2. Booking \n" +
                       "3. View Timetable \n" +
                       "4. Logout \n");
  }
  
  static void quitMenu()
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
      }
      
      scan.close();
    }
  }
  
  static void search()
  {
    quitMenu();
    //System.out.println(quitMenu());
  }
  
  static void booking()
  {
    quitMenu();
    //System.out.println(quitMenu());
  }
  
  static void viewTimetable()
  {
    quitMenu();
    //System.out.println(quitMenu());
  }
  
  static void logout()
  {
    System.out.println();
    boolean flag = true;
    
    while(flag)
    {
      System.out.println("Are you sure you want to logout?"); 
      System.out.println("If no press 1, if yes press 2:");
      
      Scanner scan = new Scanner(System.in);
      int choice = scan.nextInt();
      
      switch(choice)
      {
        case 2:
          men();
          break;
          
        case 1:
          flag = false;
          break;
        
        default:
          System.out.println("Select one of the two options\n");
      }
    }
  }
}