import java.io.*;
import java.util.*;
import java.text.*;

public class Test_a
{
  ArrayList<Test> tlist = new ArrayList<Test>();
  Test t = new Test();
  
  
  public Test_a()
  {
  }
  
  public static void main(String[] args)
  {
  }
  
  public void arr() throws ParseException
  {  
    String str = "Location,MovieName,Time_Sun,Mon,Tues,Wed,Thur,Fri,Sat," + 
      "Fitzroy,Black_Panther,10:00,10:00,10:00,10:00,10:00,10:00,10:00," +
      "Fitzroy,Operation_Red_Sea,01:00,01:00,01:00,01:00,01:00,01:00,01:00," +
      "Fitzroy,Detective_China_Town,16:00,16:00,16:00,16:00,16:00,16:00,16:00," +
      "Fitzroy,Ready_Player_One,19:00,19:00,19:00,19:00,19:00,19:00,19:00," + 
      "Fitzroy,Fifty_Shades_Free,22:00,22:00,22:00,22:00,22:00,22:00,22:00,";
    
    String[] index = str.split(",");
    
     for(int count = 0;count<index.length;count++)
    {
      //System.out.println("Array index: " + count);
      System.out.println(index[count]);
     
    System.out.println();
    String location = index.nextLine();           // 1. errors 10    cannot not find symbol; nextLine()
    String movieName = index.nextLine();          // 2.
    String timeSun = index.nextLine();            // 3.
    String mon = index.nextLine();                // 4. 
    String tues = index.nextLine();               // 5.
    String wed = index.nextLine();                // 6.
    String thur = index.nextLine();               // 7.
    String fri = index.nextLine();                // 8.
    String sat = index.nextLine();                // 9.
    index.nextLine();                             // 10.
    Test t = new Test(location, movieName, timeSun, mon, tues, wed, thur, fri, sat);
    tlist.add(t);
     }
  }
  
  /*public void arr()
  {
    String str = "Location,MovieName,Time_Sun,Mon,Tues,Wed,Thur,Fri,Sat," + 
      "Fitzroy,Black_Panther,10:00,10:00,10:00,10:00,10:00,10:00,10:00," +
      "Fitzroy,Operation_Red_Sea,01:00,01:00,01:00,01:00,01:00,01:00,01:00," +
      "Fitzroy,Detective_China_Town,16:00,16:00,16:00,16:00,16:00,16:00,16:00," +
      "Fitzroy,Ready_Player_One,19:00,19:00,19:00,19:00,19:00,19:00,19:00," + 
      "Fitzroy,Fifty_Shades_Free,22:00,22:00,22:00,22:00,22:00,22:00,22:00,";
    
    String[] index = str.split(",");
    
    //split the file into seperate strings and make array
    for(int count = 0;count<index.length;count++)
    {
      //System.out.println("Array index: " + count);
      System.out.println(index[count]);
      Test t = new Test(location, movieName, timeSun, mon, tues, wed, thur, fri, sat);
      tlist.add(t);
    }
       
  }*/
}
