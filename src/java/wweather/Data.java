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
public class Data {

    private ArrayList<Request> request;

    public ArrayList<Request> getRequest() {
        return this.request;
    }

    public void setRequest(ArrayList<Request> request) {
        this.request = request;
    }

    private ArrayList<CurrentCondition> current_condition;

    public ArrayList<CurrentCondition> getCurrentCondition() {
        return this.current_condition;
    }

    public void setCurrentCondition(ArrayList<CurrentCondition> current_condition) {
        this.current_condition = current_condition;
    }

    private ArrayList<Weather> weather;

    public ArrayList<Weather> getWeather() {
        return this.weather;
    }

    public void setWeather(ArrayList<Weather> weather) {
        this.weather = weather;
    }  
  
    private ArrayList<ClimateAverage> ClimateAverages;

    public ArrayList<ClimateAverage> getClimateAverages() {
        return this.ClimateAverages;
    }

    public void setClimateAverages(ArrayList<ClimateAverage> ClimateAverages) {
        this.ClimateAverages = ClimateAverages;
    }

}
