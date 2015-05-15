package com.hillel.advancedOOP.observer;

/**
 * Created by A.Nikitiuk on 15.05.2015.
 */
public class CurrentWeatherDisplay implements Updatable, Displayable {
    private Weather weather;

    @Override
    public void update (Weather weather){
        this.weather = weather;
    }

    @Override
    public void display(){
        System.out.println("Current weather is: temperature " + weather.getTemperature() +
                ", humidity " + weather.getHumidity());
    }
}
