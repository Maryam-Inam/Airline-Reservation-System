/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package ars;

/**
 *
 * @author HP
 */
public class Ticket {
    int seatNo;
    int ticketNo;
    Flight destinationPlace;
    Flight departurePlace;
    String airportName;

  public Ticket(int number) {
    this.ticketNo = number;
  }

  public double getPrice() {
    return 50.0;
  }

  public String toString() {
     return "Ticket #" + this.ticketNo + ", Price: $" + this.getPrice();
  }
   public static void main(String[] args) {
      }


}
