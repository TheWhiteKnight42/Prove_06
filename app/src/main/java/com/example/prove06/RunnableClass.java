package com.example.prove06;

public class RunnableClass implements Runnable {

    public void run(String cityName) {
        TemperatureGetter tempGet = new TemperatureGetter();
    }

    @Override
    public void run() {

    }
}
