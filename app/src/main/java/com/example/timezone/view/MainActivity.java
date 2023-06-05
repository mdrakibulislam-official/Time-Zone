package com.example.timezone.view;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.example.timezone.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());


        mainBinding.StopWatch.setOnClickListener(view -> {
            Intent intent = new Intent(this, stopWatch.class);
            startActivity(intent);

        });
        mainBinding.Timer.setOnClickListener(view -> {
            Intent intent = new Intent(this, Timer_activity.class);
            startActivity(intent);

        });
        mainBinding.Alarm.setOnClickListener(view -> {
            Intent intent = new Intent(this, Alarm_activity.class);
            startActivity(intent);

        });
        mainBinding.Calculator.setOnClickListener(view -> {
            Intent intent = new Intent(this, Calculator_activity.class);
            startActivity(intent);

        });
        mainBinding.ageCalculator.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AgeCalculator_activity.class);
            startActivity(intent);

        });

    }


    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Do You Want to Exit")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.super.onBackPressed();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


}