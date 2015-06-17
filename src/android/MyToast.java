package com.custom.CustomToast;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class MyToast extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("my_toast")) {

             final String toastMessage = data.getString(0);
            cordova.getActivity().runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
				Toast.makeText(cordova.getActivity(), toastMessage, Toast.LENGTH_SHORT).show();	
				}
			});
			
            return true;

        } else {
            
            return false;

        }
    }
}