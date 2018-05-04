import java .io.*;
import java.util.*;

public class MelbourneCBD implements Serializable
{
  public MelbourneCBD()
  {
  }
  
  private Scanner x;
  ArrayList<Viewing> vlist = new ArrayList<Viewing>();
  
  public void openFile()
  {
   try
   {
    x = new Scanner(new File("MelbourneCBD.txt"));
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
    
    System.out.printf("%-24s %10s %14s\n", a,b,c);
   }
  }
  
  public void closeFile()
  {
   x.close();
   System.out.println();
  }
}