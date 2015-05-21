package com.hillel.advancedOOP.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by A.Nikitiuk on 15.05.2015.
 */
public class WeatherData {
    private Weather weather;

    private List<Updatable> updatables = new ArrayList<>();

    public void addObserver(Updatable observer){
        updatables.add(observer);
    }

    public void removeObserver(Updatable observer) {updatables.remove(observer);}

    public void recieveData(int temperature, int humidity){
        weather = new Weather(temperature,humidity);

        measurementChanged();
    }

    public void measurementChanged(){
        for (Updatable observer : updatables){
            observer.update(weather);
        }
    }

}
