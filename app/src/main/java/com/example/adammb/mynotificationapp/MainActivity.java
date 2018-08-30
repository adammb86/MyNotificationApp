package com.example.adammb.mynotificationapp;

import android.graphics.BitmapFactory;
import android.os.Handler;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static final int NOTIFICAITION_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NotificationCompat.Builder notification = (NotificationCompat.Builder) new NotificationCompat
                .Builder(this,"My Notification")
                .setSmallIcon(R.drawable.ic_notifications_white_24dp)
                .setLargeIcon(BitmapFactory
                        .decodeResource(getResources()
                                , R.drawable.ic_notifications_white_24dp))
                .setContentTitle(getResources()
                        .getString(R.string.content_title))
                .setContentText(getResources()
                        .getString(R.string.content_text))
                .setSubText(getResources()
                        .getString(R.string.subtext))
                .setAutoCancel(true);

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(getApplicationContext());
        notificationManagerCompat.notify(NOTIFICAITION_ID, notification.build());
    }
}
