package com.example.boradcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by user on 2017-03-22.
 */

public class SMSRecever extends BroadcastReceiver {
    public SMSRecever(){

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("SMSRcever","onReceivecor() 호출");
    }
}
