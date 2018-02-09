/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

/**
 *
 *
 * @author rahul
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.net.ssl.HttpsURLConnection;
import goibibo.RootObject;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import javax.ws.rs.core.HttpHeaders;
import sun.net.www.protocol.http.HttpURLConnection;
import wweather.WRootObject;

public class Fetch {

    public String TestFunction() {
        //    System.out.println("adgadsg");

        return "dfasdf";
    }

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static RootObject readJsonFromUrl(String url) throws IOException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            System.out.println(jsonText);
            System.err.println(url);
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.setDateFormat("M/d/yy hh:mm a"); //Format of our JSON dates
            Gson gson = gsonBuilder.create();
//List<Post> posts = new ArrayList<Post>();
            RootObject r = new RootObject();
            r = gson.fromJson(jsonText, RootObject.class);
            return r;
//Instruct GSON to parse as a Post array (which we convert into a list)
//posts = Arrays.asList(gson.fromJson(reader, Post[].class));
        } finally {
            is.close();
        }
    }
    
    
    
    public static WRootObject fetchWeatherData(String url) throws IOException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            System.out.println(jsonText);
            System.err.println(url);
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.setDateFormat("yy/M/d hh:mm a"); //Format of our JSON dates
            Gson gson = gsonBuilder.create();
//List<Post> posts = new ArrayList<Post>();
            WRootObject r = new WRootObject();
            r = gson.fromJson(jsonText, WRootObject.class);
            return r;
//Instruct GSON to parse as a Post array (which we convert into a list)
//posts = Arrays.asList(gson.fromJson(reader, Post[].class));
        } finally {
            is.close();
        }
    }
    
    
    
    

    public yatra.YRootObject[] fetchYatraData(String url) throws Exception {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            System.out.println(jsonText);
            System.err.println(url);
            GsonBuilder gsonBuilder = new GsonBuilder();

            Gson gson = gsonBuilder.create();
//List<Post> posts = new ArrayList<Post>();
            yatra.YRootObject[] r = null;
            r = gson.fromJson(jsonText, yatra.YRootObject[].class);
            return r;
//Instruct GSON to parse as a Post array (which we convert into a list)
//posts = Arrays.asList(gson.fromJson(reader, Post[].class));
        } finally {
            is.close();
        }
    }

    public String TestFunction1() throws Exception {
        String url = "http://business.skyscanner.net/apiservices/pricing/v1.0/";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        con.setRequestProperty("Accept", "application/json");
        con.setRequestProperty("User-Agent", HttpHeaders.USER_AGENT);
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        String urlParameters = "country=IN&currency=INR&locale=en-GB&locationSchema=iata&apikey=xxxxxxxxxxxxxxxxxxx&grouppricing=on&originplace=HYD&destinationplace=RJA&outbounddate=2016-11-19&inbounddate=&adluts=1&children=0&infants=0&cabinclass=Economy";

        // Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();

        System.out.println("\nGet Response Header By Key ...\n");
        String server = con.getHeaderField("Location");
        System.out.println("Server Code " + server);
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + urlParameters);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        //System.out.println(response.toString());
        return response.toString();
    }

}
