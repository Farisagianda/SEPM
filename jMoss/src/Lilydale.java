import java .io.*;
import java.util.*;
import java.text.*;

public class Lilydale implements Serializable
{
  public Lilydale()
  {
  }
  
  private Scanner x;
  ArrayList<ViewMovie> vlist = new ArrayList<ViewMovie>();
  
  public void openFile()
  {
   try
   {
    x = new Scanner(new File("Lilydale.txt"));
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