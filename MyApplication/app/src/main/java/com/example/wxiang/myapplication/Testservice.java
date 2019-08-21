package com.example.wxiang.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.widget.EditText;

public class Testservice extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        Log.i("TAG", "onBind方法被调用!");
        return null;

    }

    @Override
    public void onCreate() {
        Log.i("TAG", "onCreate方法被调用!");

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }
}
