package com.sqx.subject;

import com.sqx.observer.Observer;

public interface Subject {

    // 注册观察者
    void registerObserver(String observerName, Observer observer);

    // 移除观察者
    void removeObserver(String observerName, Observer observer);

    // 通知观察者
    void notifyObserver();

}
