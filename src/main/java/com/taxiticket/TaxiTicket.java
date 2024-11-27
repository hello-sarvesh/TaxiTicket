
package com.taxiticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sarvesh Sawant
 */
public class TaxiTicket {
    
    public Scanner sc;
    public List<Ticket> tickets;
    
   public  TaxiTicket(){
        sc = new Scanner(System.in);
        tickets = new ArrayList<>();
    }
   
    public static void main(String[] args) {
        System.out.println("Hello World!");
        TaxiTicket  taxiTicket = new  TaxiTicket();
        
        while(true){
            taxiTicket.createTicket();
            taxiTicket.printLastTicket();
        }
        
    }
    
    public void createTicket(){
        sc.nextLine();
        System.out.println("Passanger Name :");
        String passangerName = sc.nextLine();
        System.out.println("Pick Up :");
        String pickLocation = sc.nextLine();
        System.out.println("Drop Location :");
        String dropLocation = sc.nextLine();
        System.out.println("Distance In KM :");
        double distanceInKM = sc.nextDouble();
        System.out.println("Fare :");
        double fare = sc.nextDouble();
        
        Ticket ticket = new Ticket(passangerName, pickLocation, dropLocation, distanceInKM, fare);
        tickets.add(ticket);
    }
    
    public void printLastTicket(){
        Ticket ticket = tickets.get(tickets.size()-1);
        System.out.println("-------------------- Taxi Ticket ------------------");
        System.out.println("Passanger Name : "+ticket.getPassengerName());
        System.out.println("Pick Up : : "+ticket.getPickLocation());
        System.out.println("Drop Location : "+ticket.getDropLocation());
        System.out.println("Distance In KM : "+ticket.getDistanceInKM());
        System.out.println("Fare : "+ticket.getFare());
        System.out.println("-------------------- Taxi Ticket ------------------");
    }
}
