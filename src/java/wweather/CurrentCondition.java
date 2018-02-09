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
public class CurrentCondition {

    private String observation_time;

    public String getObservationTime() {
        return this.observation_time;
    }

    public void setObservationTime(String observation_time) {
        this.observation_time = observation_time;
    }

    private String temp_C;

    public String getTempC() {
        return this.temp_C;
    }

    public void setTempC(String temp_C) {
        this.temp_C = temp_C;
    }

    private String temp_F;

    public String getTempF() {
        return this.temp_F;
    }

    public void setTempF(String temp_F) {
        this.temp_F = temp_F;
    }

    private String weatherCode;

    public String getWeatherCode() {
        return this.weatherCode;
    }

    public void setWeatherCode(String weatherCode) {
        this.weatherCode = weatherCode;
    }

    private ArrayList<WeatherIconUrl> weatherIconUrl;

    public ArrayList<WeatherIconUrl> getWeatherIconUrl() {
        return this.weatherIconUrl;
    }

    public void setWeatherIconUrl(ArrayList<WeatherIconUrl> weatherIconUrl) {
        this.weatherIconUrl = weatherIconUrl;
    }

    private ArrayList<WeatherDesc> weatherDesc;

    public ArrayList<WeatherDesc> getWeatherDesc() {
        return this.weatherDesc;
    }

    public void setWeatherDesc(ArrayList<WeatherDesc> weatherDesc) {
        this.weatherDesc = weatherDesc;
    }

    private String windspeedMiles;

    public String getWindspeedMiles() {
        return this.windspeedMiles;
    }

    public void setWindspeedMiles(String windspeedMiles) {
        this.windspeedMiles = windspeedMiles;
    }

    private String windspeedKmph;

    public String getWindspeedKmph() {
        return this.windspeedKmph;
    }

    public void setWindspeedKmph(String windspeedKmph) {
        this.windspeedKmph = windspeedKmph;
    }

    private String winddirDegree;

    public String getWinddirDegree() {
        return this.winddirDegree;
    }

    public void setWinddirDegree(String winddirDegree) {
        this.winddirDegree = winddirDegree;
    }

    private String winddir16Point;

    public String getWinddir16Point() {
        return this.winddir16Point;
    }

    public void setWinddir16Point(String winddir16Point) {
        this.winddir16Point = winddir16Point;
    }

    private String precipMM;

    public String getPrecipMM() {
        return this.precipMM;
    }

    public void setPrecipMM(String precipMM) {
        this.precipMM = precipMM;
    }

    private String humidity;

    public String getHumidity() {
        return this.humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    private String visibility;

    public String getVisibility() {
        return this.visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    private String pressure;

    public String getPressure() {
        return this.pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    private String cloudcover;

    public String getCloudcover() {
        return this.cloudcover;
    }

    public void setCloudcover(String cloudcover) {
        this.cloudcover = cloudcover;
    }

    private String FeelsLikeC;

    public String getFeelsLikeC() {
        return this.FeelsLikeC;
    }

    public void setFeelsLikeC(String FeelsLikeC) {
        this.FeelsLikeC = FeelsLikeC;
    }

    private String FeelsLikeF;

    public String getFeelsLikeF() {
        return this.FeelsLikeF;
    }

    public void setFeelsLikeF(String FeelsLikeF) {
        this.FeelsLikeF = FeelsLikeF;
    }
}
