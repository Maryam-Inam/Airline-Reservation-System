/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package ars;

/**
 *
 * @author HP
 */
public class Airline {
    String airlineName;
    String flightno;
    public Airline(String n,String fn)
    {
        airlineName=n;
        flightno=fn;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public String getFlightno() {
        return flightno;
    }
    
}
