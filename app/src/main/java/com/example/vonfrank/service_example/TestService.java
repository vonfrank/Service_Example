package com.example.vonfrank.service_example;

import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.app.Service;
import android.widget.Toast;

/**
 * Created by Von Frank on 30-05-2016.
 */
public class TestService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate(){
        Toast.makeText(this, "Service was created", Toast.LENGTH_LONG).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Service was started", Toast.LENGTH_LONG).show();
        return START_NOT_STICKY;
    }

    public void onStart(){
        Toast.makeText(this, "Service was started", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
    }
}
