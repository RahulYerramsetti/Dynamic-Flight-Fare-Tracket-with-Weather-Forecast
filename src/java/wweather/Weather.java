/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wweather;

import java.util.ArrayList;
/**
 *
 * @author rahul
 */
public class Weather {
    
    private String date;

  public String getDate() { return this.date; }

  public void setDate(String date) { this.date = date; }

  private ArrayList<Astronomy> astronomy;

  public ArrayList<Astronomy> getAstronomy() { return this.astronomy; }

  public void setAstronomy(ArrayList<Astronomy> astronomy) { this.astronomy = astronomy; }

  private String maxtempC;

  public String getMaxtempC() { return this.maxtempC; }

  public void setMaxtempC(String maxtempC) { this.maxtempC = maxtempC; }

  private String maxtempF;

  public String getMaxtempF() { return this.maxtempF; }

  public void setMaxtempF(String maxtempF) { this.maxtempF = maxtempF; }

  private String mintempC;

  public String getMintempC() { return this.mintempC; }

  public void setMintempC(String mintempC) { this.mintempC = mintempC; }

  private String mintempF;

  public String getMintempF() { return this.mintempF; }

  public void setMintempF(String mintempF) { this.mintempF = mintempF; }

  private String uvIndex;

  public String getUvIndex() { return this.uvIndex; }

  public void setUvIndex(String uvIndex) { this.uvIndex = uvIndex; }

  private ArrayList<Hourly> hourly;

  public ArrayList<Hourly> getHourly() { return this.hourly; }

  public void setHourly(ArrayList<Hourly> hourly) { this.hourly = hourly; }
}
