package com.example.plugin;

import android.app.IntentService;
import android.app.Intent;
import android.util.Log;

public class HelloService extends IntentService {
    
    public HelloService() {
        super("HelloService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("Serviço", "Serviço executado!");
    }
    
}