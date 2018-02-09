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
public class Hourly {
    
  private String time;

  public String getTime() { return this.time; }

  public void setTime(String time) { this.time = time; }

  private String tempC;

  public String getTempC() { return this.tempC; }

  public void setTempC(String tempC) { this.tempC = tempC; }

  private String tempF;

  public String getTempF() { return this.tempF; }

  public void setTempF(String tempF) { this.tempF = tempF; }

  private String windspeedMiles;

  public String getWindspeedMiles() { return this.windspeedMiles; }

  public void setWindspeedMiles(String windspeedMiles) { this.windspeedMiles = windspeedMiles; }

  private String windspeedKmph;

  public String getWindspeedKmph() { return this.windspeedKmph; }

  public void setWindspeedKmph(String windspeedKmph) { this.windspeedKmph = windspeedKmph; }

  private String winddirDegree;

  public String getWinddirDegree() { return this.winddirDegree; }

  public void setWinddirDegree(String winddirDegree) { this.winddirDegree = winddirDegree; }

  private String winddir16Point;

  public String getWinddir16Point() { return this.winddir16Point; }

  public void setWinddir16Point(String winddir16Point) { this.winddir16Point = winddir16Point; }

  private String weatherCode;

  public String getWeatherCode() { return this.weatherCode; }

  public void setWeatherCode(String weatherCode) { this.weatherCode = weatherCode; }

  private ArrayList<WeatherIconUrl2> weatherIconUrl;

  public ArrayList<WeatherIconUrl2> getWeatherIconUrl() { return this.weatherIconUrl; }

  public void setWeatherIconUrl(ArrayList<WeatherIconUrl2> weatherIconUrl) { this.weatherIconUrl = weatherIconUrl; }

  private ArrayList<WeatherDesc2> weatherDesc;

  public ArrayList<WeatherDesc2> getWeatherDesc() { return this.weatherDesc; }

  public void setWeatherDesc(ArrayList<WeatherDesc2> weatherDesc) { this.weatherDesc = weatherDesc; }

  private String precipMM;

  public String getPrecipMM() { return this.precipMM; }

  public void setPrecipMM(String precipMM) { this.precipMM = precipMM; }

  private String humidity;

  public String getHumidity() { return this.humidity; }

  public void setHumidity(String humidity) { this.humidity = humidity; }

  private String visibility;

  public String getVisibility() { return this.visibility; }

  public void setVisibility(String visibility) { this.visibility = visibility; }

  private String pressure;

  public String getPressure() { return this.pressure; }

  public void setPressure(String pressure) { this.pressure = pressure; }

  private String cloudcover;

  public String getCloudcover() { return this.cloudcover; }

  public void setCloudcover(String cloudcover) { this.cloudcover = cloudcover; }

  private String HeatIndexC;

  public String getHeatIndexC() { return this.HeatIndexC; }

  public void setHeatIndexC(String HeatIndexC) { this.HeatIndexC = HeatIndexC; }

  private String HeatIndexF;

  public String getHeatIndexF() { return this.HeatIndexF; }

  public void setHeatIndexF(String HeatIndexF) { this.HeatIndexF = HeatIndexF; }

  private String DewPointC;

  public String getDewPointC() { return this.DewPointC; }

  public void setDewPointC(String DewPointC) { this.DewPointC = DewPointC; }

  private String DewPointF;

  public String getDewPointF() { return this.DewPointF; }

  public void setDewPointF(String DewPointF) { this.DewPointF = DewPointF; }

  private String WindChillC;

  public String getWindChillC() { return this.WindChillC; }

  public void setWindChillC(String WindChillC) { this.WindChillC = WindChillC; }

  private String WindChillF;

  public String getWindChillF() { return this.WindChillF; }

  public void setWindChillF(String WindChillF) { this.WindChillF = WindChillF; }

  private String WindGustMiles;

  public String getWindGustMiles() { return this.WindGustMiles; }

  public void setWindGustMiles(String WindGustMiles) { this.WindGustMiles = WindGustMiles; }

  private String WindGustKmph;

  public String getWindGustKmph() { return this.WindGustKmph; }

  public void setWindGustKmph(String WindGustKmph) { this.WindGustKmph = WindGustKmph; }

  private String FeelsLikeC;

  public String getFeelsLikeC() { return this.FeelsLikeC; }

  public void setFeelsLikeC(String FeelsLikeC) { this.FeelsLikeC = FeelsLikeC; }

  private String FeelsLikeF;

  public String getFeelsLikeF() { return this.FeelsLikeF; }

  public void setFeelsLikeF(String FeelsLikeF) { this.FeelsLikeF = FeelsLikeF; }

  private String chanceofrain;

  public String getChanceofrain() { return this.chanceofrain; }

  public void setChanceofrain(String chanceofrain) { this.chanceofrain = chanceofrain; }

  private String chanceofremdry;

  public String getChanceofremdry() { return this.chanceofremdry; }

  public void setChanceofremdry(String chanceofremdry) { this.chanceofremdry = chanceofremdry; }

  private String chanceofwindy;

  public String getChanceofwindy() { return this.chanceofwindy; }

  public void setChanceofwindy(String chanceofwindy) { this.chanceofwindy = chanceofwindy; }

  private String chanceofovercast;

  public String getChanceofovercast() { return this.chanceofovercast; }

  public void setChanceofovercast(String chanceofovercast) { this.chanceofovercast = chanceofovercast; }

  private String chanceofsunshine;

  public String getChanceofsunshine() { return this.chanceofsunshine; }

  public void setChanceofsunshine(String chanceofsunshine) { this.chanceofsunshine = chanceofsunshine; }

  private String chanceoffrost;

  public String getChanceoffrost() { return this.chanceoffrost; }

  public void setChanceoffrost(String chanceoffrost) { this.chanceoffrost = chanceoffrost; }

  private String chanceofhightemp;

  public String getChanceofhightemp() { return this.chanceofhightemp; }

  public void setChanceofhightemp(String chanceofhightemp) { this.chanceofhightemp = chanceofhightemp; }

  private String chanceoffog;

  public String getChanceoffog() { return this.chanceoffog; }

  public void setChanceoffog(String chanceoffog) { this.chanceoffog = chanceoffog; }

  private String chanceofsnow;

  public String getChanceofsnow() { return this.chanceofsnow; }

  public void setChanceofsnow(String chanceofsnow) { this.chanceofsnow = chanceofsnow; }

  private String chanceofthunder;

  public String getChanceofthunder() { return this.chanceofthunder; }

  public void setChanceofthunder(String chanceofthunder) { this.chanceofthunder = chanceofthunder; }
}
