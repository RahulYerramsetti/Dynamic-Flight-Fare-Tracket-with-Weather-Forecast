/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goibibo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rahul
 */
public class Onwardflight {
     private String origin;

  public String getOrigin() { return this.origin; }

  public void setOrigin(String origin) { this.origin = origin; }

  private int rating;

  public int getRating() { return this.rating; }

  public void setRating(int rating) { this.rating = rating; }

  private String DepartureTime;

  public String getDepartureTime() { return this.DepartureTime; }

  public void setDepartureTime(String DepartureTime) { this.DepartureTime = DepartureTime; }

  private String flightcode;

  public String getFlightcode() { return this.flightcode; }

  public void setFlightcode(String flightcode) { this.flightcode = flightcode; }

  private String Group;

  public String getGroup() { return this.Group; }

  public void setGroup(String Group) { this.Group = Group; }

  private String farebasis;

  public String getFarebasis() { return this.farebasis; }

  public void setFarebasis(String farebasis) { this.farebasis = farebasis; }

  private String holdflag;

  public String getHoldflag() { return this.holdflag; }

  public void setHoldflag(String holdflag) { this.holdflag = holdflag; }

  private String deptime;

  public String getDeptime() { return this.deptime; }

  public void setDeptime(String deptime) { this.deptime = deptime; }

  private String codeshare;

  public String getCodeshare() { return this.codeshare; }

  public void setCodeshare(String codeshare) { this.codeshare = codeshare; }

  private String ibibopartner;

  public String getIbibopartner() { return this.ibibopartner; }

  public void setIbibopartner(String ibibopartner) { this.ibibopartner = ibibopartner; }

  private String duration;

  public String getDuration() { return this.duration; }

  public void setDuration(String duration) { this.duration = duration; }

  private String platingcarrier;

  public String getPlatingcarrier() { return this.platingcarrier; }

  public void setPlatingcarrier(String platingcarrier) { this.platingcarrier = platingcarrier; }

  private String qtype;

  public String getQtype() { return this.qtype; }

  public void setQtype(String qtype) { this.qtype = qtype; }

  private String tickettype;

  public String getTickettype() { return this.tickettype; }

  public void setTickettype(String tickettype) { this.tickettype = tickettype; }

  private String flightno;

  public String getFlightno() { return this.flightno; }

  public void setFlightno(String flightno) { this.flightno = flightno; }

  private String destination;

  public String getDestination() { return this.destination; }

  public void setDestination(String destination) { this.destination = destination; }

  private String FlHash;

  public String getFlHash() { return this.FlHash; }

  public void setFlHash(String FlHash) { this.FlHash = FlHash; }

  private String stops;

  public String getStops() { return this.stops; }

  public void setStops(String stops) { this.stops = stops; }

  private String seatsavailable;

  public String getSeatsavailable() { return this.seatsavailable; }

  public void setSeatsavailable(String seatsavailable) { this.seatsavailable = seatsavailable; }

  private String carrierid;

  public String getCarrierid() { return this.carrierid; }

  public void setCarrierid(String carrierid) { this.carrierid = carrierid; }

  private String arrterminal;

  public String getArrterminal() { return this.arrterminal; }

  public void setArrterminal(String arrterminal) { this.arrterminal = arrterminal; }

  private String provider;

  public String getProvider() { return this.provider; }

  public void setProvider(String provider) { this.provider = provider; }

  private String PromotionId;

  public String getPromotionId() { return this.PromotionId; }

  public void setPromotionId(String PromotionId) { this.PromotionId = PromotionId; }

  private Fare fare;

  public Fare getFare() { return this.fare; }

  public void setFare(Fare fare) { this.fare = fare; }

  private String CabinClass;

  public String getCabinClass() { return this.CabinClass; }

  public void setCabinClass(String CabinClass) { this.CabinClass = CabinClass; }

  private String warnings;

  public String getWarnings() { return this.warnings; }

  public void setWarnings(String warnings) { this.warnings = warnings; }

  private String ArrivalTime;

  public String getArrivalTime() { return this.ArrivalTime; }

  public void setArrivalTime(String ArrivalTime) { this.ArrivalTime = ArrivalTime; }

  private int Trip_Cost;

  public int getTripCost() { return this.Trip_Cost; }

  public void setTripCost(int Trip_Cost) { this.Trip_Cost = Trip_Cost; }

  private ArrayList<Object> onwardflights;

  public ArrayList<Object> getOnwardflights() { return this.onwardflights; }

  public void setOnwardflights(ArrayList<Object> onwardflights) { this.onwardflights = onwardflights; }

  private String aircraftType;

  public String getAircraftType() { return this.aircraftType; }

  public void setAircraftType(String aircraftType) { this.aircraftType = aircraftType; }

  private String operatingcarrier;

  public String getOperatingcarrier() { return this.operatingcarrier; }

  public void setOperatingcarrier(String operatingcarrier) { this.operatingcarrier = operatingcarrier; }

  private String src;

  public String getSrc() { return this.src; }

  public void setSrc(String src) { this.src = src; }

  private String splitduration;

  public String getSplitduration() { return this.splitduration; }

  public void setSplitduration(String splitduration) { this.splitduration = splitduration; }

  private String AvailabilityDisplayType;

  public String getAvailabilityDisplayType() { return this.AvailabilityDisplayType; }

  public void setAvailabilityDisplayType(String AvailabilityDisplayType) { this.AvailabilityDisplayType = AvailabilityDisplayType; }

  private String bookingclass;

  public String getBookingclass() { return this.bookingclass; }

  public void setBookingclass(String bookingclass) { this.bookingclass = bookingclass; }

  private String airline;

  public String getAirline() { return this.airline; }

  public void setAirline(String airline) { this.airline = airline; }

  private String multicitysearch;

  public String getMulticitysearch() { return this.multicitysearch; }

  public void setMulticitysearch(String multicitysearch) { this.multicitysearch = multicitysearch; }

  private String depdate;

  public String getDepdate() { return this.depdate; }

  public void setDepdate(String depdate) { this.depdate = depdate; }

  private String arrtime;

  public String getArrtime() { return this.arrtime; }

  public void setArrtime(String arrtime) { this.arrtime = arrtime; }

  private String arrdate;

  public String getArrdate() { return this.arrdate; }

  
  public void setArrdate(String arrdate) { this.arrdate = arrdate; }

  private String TravelTime;

  public String getTravelTime() { return this.TravelTime; }

  public void setTravelTime(String TravelTime) { this.TravelTime = TravelTime; }
    
}
