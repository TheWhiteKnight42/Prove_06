package com.example.prove06;

import android.util.Log;

public class TemperatureGetter {

    String cityName;

    public void TemperatureGetter(String cityName) {
        this.cityName = cityName;
    }

    public void getTemp() {
        Log.d("Pointless message", "Retrieving weather API for " + cityName);


    }
}
