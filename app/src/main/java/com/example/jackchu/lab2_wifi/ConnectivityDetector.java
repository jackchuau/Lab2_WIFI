package com.example.jackchu.lab2_wifi;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by jackchu on 10/08/2017.
 */

public class ConnectivityDetector {

    Context context;

    public ConnectivityDetector(Context context) {
        this.context = context;
    }

    public boolean isConnected(){
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Service.CONNECTIVITY_SERVICE);
        if(connectivityManager.getActiveNetworkInfo()!=null ) {
            return true;
        }

//        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(Context.WIFI_SERVICE);
//        if(wifiManager.getWifiState() == wifiManager.WIFI_STATE_ENABLED)
//        {
//            return true;
//        }
//        else{
//            Toast.makeText(context.getApplicationContext(), "Im here.", Toast.LENGTH_SHORT).show();
//            return false;
//        }
//        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Service.CONNECTIVITY_SERVICE);
//        if(connectivity != null){
//            NetworkInfo netInfo = connectivity.getActiveNetworkInfo();
//            boolean check = netInfo.isConnected();
//            return true;
//            if(check){
//                Toast.makeText(context.getApplicationContext(), "Im here.", Toast.LENGTH_SHORT).show();
//                return true;
//                if(netInfo.getState() == NetworkInfo.State.CONNECTED)
//                    return true;
//            }
        else
            return false;
    }
}
