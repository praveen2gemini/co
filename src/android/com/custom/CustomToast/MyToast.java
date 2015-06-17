package com.custom.CustomToast;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class MyToast extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("my_toast")) {

            String name = data.getString(0);
            String message = "MyToast, " + name;
            callbackContext.success(message);

            return true;

        } else {
            
            return false;

        }
    }
}