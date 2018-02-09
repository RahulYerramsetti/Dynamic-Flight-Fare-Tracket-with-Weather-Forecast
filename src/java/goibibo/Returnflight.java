/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goibibo;

import java.util.ArrayList;

/**
 *
 * @author rahul
 */
public class Returnflight {
    private String origin;

  public String getOrigin() { return this.origin; }

  public void setOrigin(String origin) { this.origin = origin; }

  private int rating;

  public int getRating() { return this.rating; }

  public void setRating(int rating) { this.rating = rating; }

  private Object DepartureTime;

  public Object getDepartureTime() { return this.DepartureTime; }

  public void setDepartureTime(Object DepartureTime) { this.DepartureTime = DepartureTime; }

  private String flightcode;

  public String getFlightcode() { return this.flightcode; }

  public void setFlightcode(String flightcode) { this.flightcode = flightcode; }

  private String Group;

  public String getGroup() { return this.Group; }

  public void setGroup(String Group) { this.Group = Group; }

  private String farebasis;

  public String getFarebasis() { return this.farebasis; }

  public void setFarebasis(String farebasis) { this.farebasis = farebasis; }

  private String spicestatus;

  public String getSpicestatus() { return this.spicestatus; }

  public void setSpicestatus(String spicestatus) { this.spicestatus = spicestatus; }

  private String holdflag;

  public String getHoldflag() { return this.holdflag; }

  public void setHoldflag(String holdflag) { this.holdflag = holdflag; }

  private String CINFO;

  public String getCINFO() { return this.CINFO; }

  public void setCINFO(String CINFO) { this.CINFO = CINFO; }

  private String deptime;

  public String getDeptime() { return this.deptime; }

  public void setDeptime(String deptime) { this.deptime = deptime; }

  private String codeshare;

  public String getCodeshare() { return this.codeshare; }

  public void setCodeshare(String codeshare) { this.codeshare = codeshare; }

  private String ibibopartner;

  public String getIbibopartner() { return this.ibibopartner; }

  public void setIbibopartner(String ibibopartner) { this.ibibopartner = ibibopartner; }

  private String productclass;

  public String getProductclass() { return this.productclass; }

  public void setProductclass(String productclass) { this.productclass = productclass; }

  private String duration;

  public String getDuration() { return this.duration; }

  public void setDuration(String duration) { this.duration = duration; }

  private String platingcarrier;

  public String getPlatingcarrier() { return this.platingcarrier; }

  public void setPlatingcarrier(String platingcarrier) { this.platingcarrier = platingcarrier; }

  private String qtype;

  public String getQtype() { return this.qtype; }

  public void setQtype(String qtype) { this.qtype = qtype; }

  private String arrterminal;

  public String getArrterminal() { return this.arrterminal; }

  public void setArrterminal(String arrterminal) { this.arrterminal = arrterminal; }

  private String flightno;

  public String getFlightno() { return this.flightno; }

  public void setFlightno(String flightno) { this.flightno = flightno; }

  private String servicetype;

  public String getServicetype() { return this.servicetype; }

  public void setServicetype(String servicetype) { this.servicetype = servicetype; }

  private String fareclass;

  public String getFareclass() { return this.fareclass; }

  public void setFareclass(String fareclass) { this.fareclass = fareclass; }

  private String faresequence;

  public String getFaresequence() { return this.faresequence; }

  public void setFaresequence(String faresequence) { this.faresequence = faresequence; }

  private String destination;

  public String getDestination() { return this.destination; }

  public void setDestination(String destination) { this.destination = destination; }

  private String FlHash;

  public String getFlHash() { return this.FlHash; }

  public void setFlHash(String FlHash) { this.FlHash = FlHash; }

  private String carrierid;

  public String getCarrierid() { return this.carrierid; }

  public void setCarrierid(String carrierid) { this.carrierid = carrierid; }

  private String stops;

  public String getStops() { return this.stops; }

  public void setStops(String stops) { this.stops = stops; }

  private String seatsavailable;

  public String getSeatsavailable() { return this.seatsavailable; }

  public void setSeatsavailable(String seatsavailable) { this.seatsavailable = seatsavailable; }

  private String state;

  public String getState() { return this.state; }

  public void setState(String state) { this.state = state; }

  private String tickettype;

  public String getTickettype() { return this.tickettype; }

  public void setTickettype(String tickettype) { this.tickettype = tickettype; }

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

  private String fareapptype;

  public String getFareapptype() { return this.fareapptype; }

  public void setFareapptype(String fareapptype) { this.fareapptype = fareapptype; }

  private String warnings;

  public String getWarnings() { return this.warnings; }

  public void setWarnings(String warnings) { this.warnings = warnings; }

  private String farestatus;

  public String getFarestatus() { return this.farestatus; }

  public void setFarestatus(String farestatus) { this.farestatus = farestatus; }

  private Object ArrivalTime;

  public Object getArrivalTime() { return this.ArrivalTime; }

  public void setArrivalTime(Object ArrivalTime) { this.ArrivalTime = ArrivalTime; }

  private int Trip_Cost;

  public int getTripCost() { return this.Trip_Cost; }

  public void setTripCost(int Trip_Cost) { this.Trip_Cost = Trip_Cost; }

  private ArrayList<Onwardflight> onwardflights;

  public ArrayList<Onwardflight> getOnwardflights() { return this.onwardflights; }

  public void setOnwardflights(ArrayList<Onwardflight> onwardflights) { this.onwardflights = onwardflights; }

  private String aircraftType;

  public String getAircraftType() { return this.aircraftType; }

  public void setAircraftType(String aircraftType) { this.aircraftType = aircraftType; }

  private String seatingclass;

  public String getSeatingclass() { return this.seatingclass; }

  public void setSeatingclass(String seatingclass) { this.seatingclass = seatingclass; }

  private String EticketFlag;

  public String getEticketFlag() { return this.EticketFlag; }

  public void setEticketFlag(String EticketFlag) { this.EticketFlag = EticketFlag; }

  private String faresellkey;

  public String getFaresellkey() { return this.faresellkey; }

  public void setFaresellkey(String faresellkey) { this.faresellkey = faresellkey; }

  private String operatingcarrier;

  public String getOperatingcarrier() { return this.operatingcarrier; }

  public void setOperatingcarrier(String operatingcarrier) { this.operatingcarrier = operatingcarrier; }

  private String src;

  public String getSrc() { return this.src; }

  public void setSrc(String src) { this.src = src; }

  private String ruleno;

  public String getRuleno() { return this.ruleno; }

  public void setRuleno(String ruleno) { this.ruleno = ruleno; }

  private String aircraftTypecode;

  public String getAircraftTypecode() { return this.aircraftTypecode; }

  public void setAircraftTypecode(String aircraftTypecode) { this.aircraftTypecode = aircraftTypecode; }

  private String splitduration;

  public String getSplitduration() { return this.splitduration; }

  public void setSplitduration(String splitduration) { this.splitduration = splitduration; }

  private String searchKey;

  public String getSearchKey() { return this.searchKey; }

  public void setSearchKey(String searchKey) { this.searchKey = searchKey; }

  private String inventorylegid;

  public String getInventorylegid() { return this.inventorylegid; }

  public void setInventorylegid(String inventorylegid) { this.inventorylegid = inventorylegid; }

  private String bookingclass;

  public String getBookingclass() { return this.bookingclass; }

  public void setBookingclass(String bookingclass) { this.bookingclass = bookingclass; }

  private String journeysellkey;

  public String getJourneysellkey() { return this.journeysellkey; }

  public void setJourneysellkey(String journeysellkey) { this.journeysellkey = journeysellkey; }

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

  private String depterminal;

  public String getDepterminal() { return this.depterminal; }

  public void setDepterminal(String depterminal) { this.depterminal = depterminal; }

  private String refundable;

  public String getRefundable() { return this.refundable; }

  public void setRefundable(String refundable) { this.refundable = refundable; }

  private PricingSolution PricingSolution;

  public PricingSolution getPricingSolution() { return this.PricingSolution; }

  public void setPricingSolution(PricingSolution PricingSolution) { this.PricingSolution = PricingSolution; }

  private String AvailabilityDisplayType;

  public String getAvailabilityDisplayType() { return this.AvailabilityDisplayType; }

  public void setAvailabilityDisplayType(String AvailabilityDisplayType) { this.AvailabilityDisplayType = AvailabilityDisplayType; }
}
