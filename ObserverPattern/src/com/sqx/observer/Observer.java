package com.sqx.observer;

public interface Observer {

    // 更新订阅
    void update(float Temperature, float Humidity, float Pressure);

}
