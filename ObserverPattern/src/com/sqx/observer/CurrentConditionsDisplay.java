package com.sqx.observer;

import com.sqx.subject.Subject;
import com.sqx.utils.StringManager;

public class CurrentConditionsDisplay extends BaseDisplay{

    public CurrentConditionsDisplay(Subject subject) {
        super(subject);
        subject.registerObserver(StringManager.CurrentConditionsDisplay, this);
    }

    @Override
    public void display() {
        System.out.println("========================================================");
        System.out.println("当前观测者是：" + StringManager.CurrentConditionsDisplay);
        System.out.println("当前温度是：" + Temperature);
        System.out.println("当前湿度是：" + Humidity);
        System.out.println("当前气压是：" + Pressure);
        System.out.println("========================================================");
    }
}
