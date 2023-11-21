package com.example.eksplisitimplisit;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {

    public void onReceive(Context context, Intent intent) {
        // Tindakan yang diambil ketika alarm diaktifkan
        Toast.makeText(context, "Alarm!", Toast.LENGTH_LONG).show();
    }
}
