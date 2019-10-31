package com.example.prove06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getTemperature(View view) {
        editText = findViewById(R.id.editText);

        RunnableClass r = new RunnableClass();

        Thread thread1 = new Thread(r, "Thread 1");
        thread1.start();
    }

    public void getForecast(View view) {

    }
}
