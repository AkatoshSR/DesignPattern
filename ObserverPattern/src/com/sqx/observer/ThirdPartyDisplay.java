package com.sqx.observer;

import com.sqx.subject.Subject;
import com.sqx.utils.StringManager;

public class ThirdPartyDisplay extends BaseDisplay {


    public ThirdPartyDisplay(Subject subject) {
        super(subject);
        subject.registerObserver(StringManager.ThirdPartyDisplay, this);
    }

    @Override
    public void display() {
        System.out.println("========================================================");
        System.out.println("当前观测者是：" + StringManager.ThirdPartyDisplay);
        System.out.println("其他数值：" + (Temperature + Humidity * 10 + Pressure * 10));
        System.out.println("========================================================");
    }
}
