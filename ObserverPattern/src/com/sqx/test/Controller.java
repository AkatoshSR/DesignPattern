package com.sqx.test;

import com.sqx.observer.*;
import com.sqx.subject.WeatherData;

public class Controller {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        // 实例化
        BaseDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        BaseDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        BaseDisplay forecastDisplay = new ForecastDisplay(weatherData);
        BaseDisplay thirdPartyDisplay = new ThirdPartyDisplay(weatherData);

        // 更新
        weatherData.setMeasurements(20.5f,1.2f,1.3f);
    }
}
