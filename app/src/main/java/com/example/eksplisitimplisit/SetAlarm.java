package com.example.eksplisitimplisit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class SetAlarm extends AppCompatActivity {

    private TimePicker timePicker;
    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_alarm);

        timePicker = findViewById(R.id.timePicker);
        startButton = findViewById(R.id.startButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAlarm();
            }
        });
    }

    private void setAlarm() {
        // Dapatkan waktu dari TimePicker
        int hour = timePicker.getHour();
        int minute = timePicker.getMinute();

        // Buat intent untuk AlarmReceiver
        Intent intent = new Intent(this, AlarmReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(
                this,
                0,
                intent,
                PendingIntent.FLAG_UPDATE_CURRENT
        );

        // Atur waktu alarm menggunakan AlarmManager
        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, 0);

        long timeInMillis = calendar.getTimeInMillis();

        // Aktifkan alarm
        alarmManager.set(AlarmManager.RTC_WAKEUP, timeInMillis, pendingIntent);

        Toast.makeText(this, "Alarm diatur untuk pukul " + hour + ":" + minute, Toast.LENGTH_SHORT).show();
    }
}