import java.io.*;
import java.util.*;

public class MovieSearch
{
  public static void main(String[] args)
  {
    try
    {
      // this file seperator means you can use this on apple, unix etc. and it will still run the code
      String locationOfFile = File.separator + "Year 4" + File.separator + "Semester 1" + File.separator + "SE Project Management" + File.separator + "Assignments" + File.separator + "Scripts" + File.separator + "Sprint 2" + File.separator + "Master.txt";
      // finding the file with movie information
      File f = new File(locationOfFile);
      
      // Scanner is reading from the file
      Scanner sc = new Scanner(f);
      
      //read a line from scanner;  does not print all because it is not in a loop
      String nextLine = sc.nextLine();
      
      //split the file into seperate strings and make array
      String[] movieInfo = nextLine.split(".");
      
      for(int count = 0;count<movieInfo;count++)
      {
        System.out.println(toString + movieInfo[count]);
      }
    }
    
    // this catches error if something goes wrong with file
    catch(FileNotFoundException fnfe)
    {
      System.out.println("File not found");
    }
    
  }
}
