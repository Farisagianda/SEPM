import java.util.*;
import java.text.*;
import java.io.*;

public class Test implements Serializable
{
  private String location;
  private String movieName;
  private String timeSun;
  private String mon;
  private String tues;
  private String wed;
  private String thur;
  private String fri;
  private String sat;
  
  
  public Test()
  {
  }
  
  public Test(String location, String movieName, String timeSun)
  {
    this.location = location;
    this.movieName = movieName;
    this.timeSun = timeSun;
  }
  
  public Test(String location, String movieName, String timeSun, String mon, String tues, String wed, String thur, String fri, String sat)
  {
    this.location = location;
    this.movieName = movieName;
    this.timeSun = timeSun;
    this.mon = mon;
    this.tues = tues;
    this.wed = wed;
    this.thur = thur;
    this.fri = fri;
    this.sat = sat;
  }
  
  public String getLocation()
  {
    return location;
  }
  
    public String getMovieName()
  {
    return movieName;
  }
  
  public String getTimeSun()
  {
    return timeSun;
  }
  
  public String getMon()
  {
    return mon;
  }
  
  public String getTues()
  {
    return tues;
  }
  
  public String getWed()
  {
    return wed;
  }
  
  public String getThur()
  {
    return thur;
  }
  
  public String getFri()
  {
    return fri;
  }
  
  public String getSat()
  {
    return sat;
  }
  
  @Override
  public String toString()
  {
    return "Location " + location + " Movie Name: " + movieName + " Time: " + timeSun;
  }
}
  