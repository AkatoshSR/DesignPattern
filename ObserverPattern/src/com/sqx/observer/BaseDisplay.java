package com.sqx.observer;

import com.sqx.subject.Subject;
import com.sqx.utils.StringManager;

public abstract class BaseDisplay implements DisplayElement, Observer{

    protected float Temperature;
    protected float Humidity;
    protected float Pressure;

    protected Subject subject;

    protected BaseDisplay(Subject subject) {
        this.subject = subject;
    }

    //重写
    public abstract void display();

    public void update(float Temperature, float Humidity, float Pressure){
        this.Temperature = Temperature;
        this.Humidity = Humidity;
        this.Pressure = Pressure;
        display();
    }


}
