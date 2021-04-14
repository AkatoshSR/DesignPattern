package com.sqx.observer;

import com.sqx.subject.Subject;
import com.sqx.utils.StringManager;

public class ForecastDisplay extends BaseDisplay {


    public ForecastDisplay(Subject subject) {
        super(subject);
        subject.registerObserver(StringManager.ForecastDisplay, this);
    }

    @Override
    public void display() {
        System.out.println("========================================================");
        System.out.println("当前观测者是：" + StringManager.ForecastDisplay);
        System.out.println("天气预报：");
        System.out.println("当前温度、湿度、气压分别为：" + Temperature + "、" + Humidity + "、" + Pressure);
        System.out.println("========================================================");
    }
}
