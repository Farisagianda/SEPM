import java .io.*;
import java.util.*;

public class Fitzroy implements Serializable
{
  public Fitzroy()
  {
  }
  
  private Scanner x;
  ArrayList<ViewMovie> vlist = new ArrayList<ViewMovie>();
  
  public void openFile()
  {
   try
   {
    x = new Scanner(new File("Fitzroy.txt"));
   }
   
   catch(Exception e)
   {
    System.out.println("Could not find file");
   }
  }
  
  public void readFile()
  {
   while(x.hasNext())
   {
    String a = x.next();    //movieName
    String b = x.next();    //location
    String c = x.next();    //time
    
    System.out.printf("%-21s %10s %10s\n", a,b,c);
   }
  }
  
  public void closeFile()
  {
   x.close();
   System.out.println();
  }
 
}