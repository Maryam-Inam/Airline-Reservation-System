/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package ars;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Flight 
{
  private String origin; 
  private String destination; 
  private String departure_time; 
  private String arrival_time;
  private String date_of_flight;
  private Aircraft aircraft_assigned; 
  
  
  public Flight(String ori, String des, String dof, Aircraft airassign)
  {
      origin = ori;
      destination = des;
      date_of_flight = dof;
      aircraft_assigned = airassign;   
  }
  
     public String toString()
    {
        String result = "";
        
        result += "\n\nFlight Information: \n"
                    +"\tDate: "+date_of_flight
                    +"\n\tFrom: "+origin+ " to "+ destination
                    +"\n\tFlight time: "+departure_time +" to "+arrival_time
                    +"\n\t"+aircraft_assigned.toString();
        
        return result;
    }
     
     public void schedule(String arrivalTime)
     {
         arrival_time = arrivalTime;
     }
  
     void schedule(String arrivalTime, String departureTime)
     {
         arrival_time = arrivalTime;
         departure_time = departureTime;
     }
  
}
 