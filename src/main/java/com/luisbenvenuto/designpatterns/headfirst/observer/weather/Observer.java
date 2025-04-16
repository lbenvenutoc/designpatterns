package com.luisbenvenuto.designpatterns.headfirst.observer.weather;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
