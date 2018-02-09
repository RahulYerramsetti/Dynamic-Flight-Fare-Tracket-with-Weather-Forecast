<%-- 
    Document   : result
    Created on : 9 Nov, 2016, 4:07:06 PM
    Author     : rahul
--%>
<%@page import="wweather.Request"%>
<%@page import="wweather.Weather"%>
<%@page import="wweather.Hourly"%>
<%@page import="yatra.MnArr"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.lang.String"%>
<%@ page import="common.Fetch" %>
<%@ page import="goibibo.Data" %>
<%@ page import="goibibo.Fare" %>
<%@ page import="goibibo.Onwardflight" %>
<%@ page import="goibibo.PricingSolution" %>
<%@ page import="goibibo.Returnflight" %>
<%@ page import="goibibo.RootObject" %>
<%@ page import="yatra.YRootObject" %>
<%@ page import="yatra.Cf" %>
<%@ page import="yatra.MnArr" %>
<%@ page import="common.FlightInfo" %>

<%@ page import="com.myapp.struts.SearchForm" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="stylesheet.css">
        <link rel="stylesheet" type="text/css" href="dataTables.css">
        <script  src="Jquery.js" ></script>
        <script  src="dataTables.js" ></script>
        <title>Search Success</title>
        <script>
            $(document).ready(function () {
                $('#example').DataTable({
                    "order": [[3, "desc"]]
                });
            });
        </script>
    </head>
    <body background="r.jpg">
        <h1></h1>




        <%
            Fetch f = new Fetch();

            ArrayList<FlightInfo> fullinfo = new ArrayList<FlightInfo>();
            String src = request.getParameter("source1").toUpperCase();
            String dst = request.getParameter("destination1").toUpperCase();
            String orgdat = request.getParameter("date1");

            String dat = orgdat.replaceAll("-", "");

            goibibo.RootObject r = f.readJsonFromUrl("https://developer.goibibo.com/api/search/?app_id=xxxxxxxxxxxxxxxx&app_key=xxxxxxxxxxxxxxxx&format=json&source=" + src + "&destination=" + dst + "&dateofdeparture=" + dat + "&seatingclass=E&adults=1&children=0&infants=0&counter=0");

            wweather.WRootObject t = f.fetchWeatherData("http://api.worldweatheronline.com/premium/v1/weather.ashx?key=xxxxxxxxxxxxxxxxx="+dst+"&date=" + orgdat + "&format=Json");

            yatra.YRootObject[] yobj = f.fetchYatraData("http://flight.yatra.com/air-lowest-fares/getFares?origin=" + src + "&destination=" + dst + "&startDate=" + orgdat + "&endDate=" + orgdat + "&duration=1");

            Data d = r.getData();

            ArrayList<Onwardflight> flightdata = new ArrayList<Onwardflight>();
            if (d == null) {
                out.println("data is null");
            } else {
                flightdata = d.getOnwardflights();

            }
            if (flightdata == null) {
                out.println("flight data is null");
            } else {
                //out.println(flightdata.size());
                for (int i = 1; i < flightdata.size(); i++) {
                    Onwardflight myflight = flightdata.get(i);
                    FlightInfo fi = new FlightInfo();
                    fi.setFinfo(myflight.getAirline());
                    fi.setSource(src);
                    fi.setDestination(dst);
                    fi.setApiinfo("GoIBIBO API");
                    fi.setFare("" + myflight.getFare().getTotalfare());

                    if (myflight.getDepartureTime().length() >= 17) {
                        fi.setSat(myflight.getDepartureTime().substring(11, 16));
                    } else {
                        fi.setSat(myflight.getDepartureTime());
                    }

                    if (myflight.getArrivalTime().length() >= 17) {
                        fi.setDat(myflight.getArrivalTime().substring(11, 16));
                    } else {
                        fi.setDat(myflight.getArrivalTime());
                    }

                    fi.setFcode(myflight.getCarrierid() + "-" + myflight.getFlightno());

                    fullinfo.add(fi);

                }
            }

            wweather.Data e = t.getData();

            ArrayList<Weather> wdata = new ArrayList<Weather>();
            Weather finalweather = new Weather();
            Request req = new Request();
            ArrayList<Hourly> hdata = new ArrayList<Hourly>();
            if (e == null) {
                out.println("data is null");
            } else {
                wdata = e.getWeather();

                if (wdata == null) {
                    out.println("w data is null");
                } else {
                    //out.println(flightdata.size());
                    for (int i = 0; i < wdata.size(); i++) {
                        finalweather = wdata.get(i);
                        if (finalweather.getDate() == orgdat) {
                            break;
                        }

                    }

                }
            }

            if (yobj == null) {
                out.println("Error Retreiving Yatra Result");
            } else {
                for (int i = 0; i < yobj.length; i++) {
                    YRootObject yo = yobj[i];

                    for (int j = 0; yo.getMnArr() != null && j < yo.getMnArr().size(); j++) {
                        MnArr marr = yo.getMnArr().get(j);
                        for (int k = 0; marr.getCf() != null && k < marr.getCf().size(); k++) {
                            Cf cinfo = marr.getCf().get(k);
                            FlightInfo fin = new FlightInfo();
                            fin.setSource(cinfo.getDapt());
                            fin.setDestination(cinfo.getAapt());
                            fin.setFinfo(cinfo.getYan());
                            fin.setFare("" + cinfo.getTf());
                            fin.setApiinfo("Yatra API");
                            fin.setSat(cinfo.getDt());
                            fin.setDat(cinfo.getAt());
                            fin.setFcode(cinfo.getMac() + "-" + cinfo.getFl());

                            fullinfo.add(fin);


                        }

                    }
                }

            }


        %>
        <h1 style="font-family:bold garamond;">You have successfully Searched</h1>



        <p>Your Source is: <bean:write name="SearchForm" property="source1" />.</p>

        <p>Your Destination is: <bean:write name="SearchForm" property="destination1" />.</p>

        <p>Your Date is: <bean:write name="SearchForm" property="date1" />.</p>

        <center style="font-family:bold garamond; font-size: 300%;">Flight Fares</center>




        <TABLE BORDER="1" id="example">
            <thead>

                <TR>
                    <TH>Flight Code</TH>
                    <TH>Source</TH>
                    <TH>Destination</TH>
                    <TH>Flight Info</TH>

                    <TH>Fare in Rupees</TH>
                    <TH>Departure Time</TH>
                    <TH>Arrival Time</TH>
                    <TH>API</TH>

                </TR> </thead>
                <% for (int k = 0; k < fullinfo.size(); k++) {
                %>
            <TR>
                <TD> <%= fullinfo.get(k).getFcode()%> </TD>
                <TD> <%= fullinfo.get(k).getSource()%> </TD>
                <TD> <%= fullinfo.get(k).getDestination()%> </TD>
                <TD> <%= fullinfo.get(k).getFinfo()%> </TD>
                <TD> <%= fullinfo.get(k).getFare()%> </TD>
                <TD> <%= fullinfo.get(k).getSat()%> </TD>
                <TD> <%= fullinfo.get(k).getDat()%> </TD>


                <TD> <%= fullinfo.get(k).getApiinfo()%> </TD>
            </TR>
            <%
                }
            %>
        </TABLE>




        <p></p>
        <p></p>
        <center style="font-family:bold garamond; font-size: 300%;"> Destination Hourly Weather Forecast</center>
        <p>Destination Location: <bean:write name="SearchForm" property="destination1" /></p>



        <% if (finalweather != null) {%>
        <table border="1">
            <thead>
                <tr>

                    <th>Time</th>
                    <th>Temp </th>
                    <th>windspeedMiles </th>
                    <th>humidity</th>
                    <th>chanceofrain</th>
                    <th>pressure</th>
                    <th>visibility</th>

                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>00:00 to 03:00 Hrs</td>

                    <td><%= finalweather.getHourly().get(0).getTempF()%></td>
                    <td><%= finalweather.getHourly().get(0).getWindspeedMiles()%></td>

                    <td><%= finalweather.getHourly().get(0).getHumidity()%></td>
                    <td><%= finalweather.getHourly().get(0).getChanceofrain().equals("") ? "YES" : "NO"%></td>
                    <td><%= finalweather.getHourly().get(0).getPressure()%></td>
                    <td><%= finalweather.getHourly().get(0).getVisibility()%></td>
                </tr>
                <tr>
                    <td>03:00 to 06:00 Hrs</td>

                    <td><%= finalweather.getHourly().get(1).getTempF()%></td>
                    <td><%= finalweather.getHourly().get(1).getWindspeedMiles()%></td>

                    <td><%= finalweather.getHourly().get(1).getHumidity()%></td>
                    <td><%= finalweather.getHourly().get(1).getChanceofrain().equals("") ? "YES" : "NO"%></td>
                    <td><%= finalweather.getHourly().get(1).getPressure()%></td>
                    <td><%= finalweather.getHourly().get(1).getVisibility()%></td>
                </tr>
                <tr>
                    <td>06:00 to 09:00 Hrs</td>

                    <td><%= finalweather.getHourly().get(2).getTempF()%></td>
                    <td><%= finalweather.getHourly().get(2).getWindspeedMiles()%></td>

                    <td><%= finalweather.getHourly().get(2).getHumidity()%></td>
                    <td><%= finalweather.getHourly().get(2).getChanceofrain().equals("") ? "YES" : "NO"%></td>
                    <td><%= finalweather.getHourly().get(2).getPressure()%></td>
                    <td><%= finalweather.getHourly().get(2).getVisibility()%></td>
                </tr>
                <tr>
                    <td>09:00 to 12:00 Hrs</td>

                    <td><%= finalweather.getHourly().get(3).getTempF()%></td>
                    <td><%= finalweather.getHourly().get(3).getWindspeedMiles()%></td>

                    <td><%= finalweather.getHourly().get(3).getHumidity()%></td>
                    <td><%= finalweather.getHourly().get(3).getChanceofrain().equals("") ? "YES" : "NO"%></td>
                    <td><%= finalweather.getHourly().get(3).getPressure()%></td>
                    <td><%= finalweather.getHourly().get(3).getVisibility()%></td>
                </tr>
                <tr>
                    <td>12:00 to 15:00 Hrs</td>

                    <td><%= finalweather.getHourly().get(4).getTempF()%></td>
                    <td><%= finalweather.getHourly().get(4).getWindspeedMiles()%></td>

                    <td><%= finalweather.getHourly().get(4).getHumidity()%></td>
                    <td><%= finalweather.getHourly().get(4).getChanceofrain().equals("") ? "YES" : "NO"%></td>
                    <td><%= finalweather.getHourly().get(4).getPressure()%></td>
                    <td><%= finalweather.getHourly().get(4).getVisibility()%></td>
                </tr>
                <tr>
                    <td>15:00 to 18:00 Hrs</td>

                    <td><%= finalweather.getHourly().get(5).getTempF()%></td>
                    <td><%= finalweather.getHourly().get(5).getWindspeedMiles()%></td>

                    <td><%= finalweather.getHourly().get(5).getHumidity()%></td>
                    <td><%= finalweather.getHourly().get(5).getChanceofrain().equals("") ? "YES" : "NO"%></td>
                    <td><%= finalweather.getHourly().get(5).getPressure()%></td>
                    <td><%= finalweather.getHourly().get(5).getVisibility()%></td>
                </tr>
                <tr>
                    <td>18:00 to 21:00 Hrs</td>

                    <td><%= finalweather.getHourly().get(6).getTempF()%></td>
                    <td><%= finalweather.getHourly().get(6).getWindspeedMiles()%></td>

                    <td><%= finalweather.getHourly().get(6).getHumidity()%></td>
                    <td><%= finalweather.getHourly().get(6).getChanceofrain().equals("") ? "YES" : "NO"%></td>
                    <td><%= finalweather.getHourly().get(6).getPressure()%></td>
                    <td><%= finalweather.getHourly().get(6).getVisibility()%></td>
                </tr>
                <tr>
                    <td>21:00 to 24:00 Hrs</td>

                    <td><%= finalweather.getHourly().get(7).getTempF()%></td>
                    <td><%= finalweather.getHourly().get(7).getWindspeedMiles()%></td>

                    <td><%= finalweather.getHourly().get(7).getHumidity()%></td>
                    <td><%= finalweather.getHourly().get(7).getChanceofrain().equals("") ? "YES" : "NO"%></td>
                    <td><%= finalweather.getHourly().get(7).getPressure()%></td>
                    <td><%= finalweather.getHourly().get(7).getVisibility()%></td>
                </tr>
            </tbody>
        </table>

        <% }%>
    </body>
</html>
