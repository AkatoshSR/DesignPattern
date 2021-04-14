package com.sqx.subject;

import com.sqx.observer.Observer;

import java.util.HashMap;

public class WeatherData implements Subject{

    private float temperature;
    private float humidity;
    private float pressure;

    private HashMap<String, Observer> observers;

    public WeatherData() {
        observers = new HashMap<>();
    }

    @Override
    public void registerObserver(String observerName, Observer observer) {
        if (!observers.containsKey(observerName)){
            observers.put(observerName,observer);
        }else{
            System.out.println("观察者" + observerName + "不能重复注册");
        }
    }

    @Override
    public void removeObserver(String observerName, Observer observer) {
        if (observers.containsKey(observerName)){
            observers.remove(observerName);
            System.out.println("观察者" + observerName + "删除成功");
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer obs : observers.values()){
            obs.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
