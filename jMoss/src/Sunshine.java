import java .io.*;
import java.util.*;

public class Sunshine implements Serializable
{
  
  public Sunshine()
  {
  }
  
  private Scanner x;
  ArrayList<ViewMovie> vlist = new ArrayList<ViewMovie>();
  
  public void openFile()
  {
   try
   {
    x = new Scanner(new File("Sunshine.txt"));
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
    String a = x.next();
    String b = x.next();
    String c = x.next();
    
    System.out.printf("%-21s %10s %10s\n", a,b,c);
   }
  }
  
  public void closeFile()
  {
   x.close();
   System.out.println();
  }
 
}