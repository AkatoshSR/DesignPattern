package com.sqx.observer;

import com.sqx.subject.Subject;
import com.sqx.utils.StringManager;

public class StatisticsDisplay extends BaseDisplay {

    public StatisticsDisplay(Subject subject) {
        super(subject);
        subject.registerObserver(StringManager.StatisticsDisplay, this);
    }

    @Override
    public void display() {
        System.out.println("========================================================");
        System.out.println("当前观测者是：" + StringManager.StatisticsDisplay);
        System.out.println("最小观测值是：" + Math.min(Math.min(Temperature,Humidity), Pressure));
        System.out.println("平均观测值是：" + (Temperature + Humidity + Pressure)/3);
        System.out.println("最大观测值是：" + Math.max(Math.max(Temperature, Humidity), Pressure));
        System.out.println("========================================================");
    }
}
