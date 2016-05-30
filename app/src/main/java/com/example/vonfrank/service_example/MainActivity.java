package com.example.vonfrank.service_example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startServiceClick(View view) {
        startService(new Intent(this, TestService.class));
    }

    public void stopServiceClick(View view) {
        stopService(new Intent(this, TestService.class));
    }
}
