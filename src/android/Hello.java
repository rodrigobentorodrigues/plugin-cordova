package com.example.plugin;

import org.apache.cordova.*;
import android.app.Activity;
import android.app.Intent;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Hello extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("greet")) {

            String argumentos = data.getString(0);

            callbackContext.success(argumentos);
            Log.d("Cordova", "Valor recebido: " + argumentos);
            
            Activity activity = cordova.getActivity();
            Intent intent = new Intent(activity, HelloService.class);
            activity.startService(intent);

            return true;

        } else {
            
            return false;

        }
    }
}
