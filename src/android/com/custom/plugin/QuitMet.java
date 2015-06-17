package com.custom.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class QuitMet extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("greet")) {

            String name = data.getString(0);
            String message = "QuitMet, " + name;
            callbackContext.success(message);

            return true;

        } else {
            
            return false;

        }
    }
}