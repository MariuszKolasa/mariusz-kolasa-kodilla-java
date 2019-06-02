package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Flight {


    String departureAirport;
    String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport =arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
    public String findFilght(Flight flight) throws RouteNotFoundException{

        Map<String,Boolean >  flightsMap= new HashMap<String, Boolean>();
        flightsMap.put("airport1",true);
        flightsMap.put("airport2",true);
        flightsMap.put("airport3",true);
        flightsMap.put("airport4",true);
        flightsMap.put("airport5",false);
        flightsMap.put("airport6",true);
        flightsMap.put("airport7",true);
        flightsMap.put("airport8",false);

        String targetAirport = flight.getArrivalAirport();
        if(flightsMap.containsKey(targetAirport)){
            return targetAirport;
        }else{
            throw new RouteNotFoundException();
        }

    }
    public static void main(String[] args) {
        Flight flight1=new Flight("WAW","airport8");


        try{ flight1.findFilght(flight1);
       } catch (RouteNotFoundException e){
           System.out.println("Flight not found");
       }finally {
           System.out.println("End of program.");
       }

    }
}
