package com.example.timezone.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import android.widget.Chronometer;
import android.widget.ImageView;

import com.example.timezone.R;
import com.example.timezone.databinding.ActivityStopWatchBinding;
import com.example.timezone.viewModel.StopWatchViewModel;

public class stopWatch extends AppCompatActivity {

    Chronometer chronometer;
    Animation rotate;
    ImageView imageView;
    Handler handler;
    long tMilliSec,tStart,tBuff,tUpdate = 0L;
    int sec, min, milliSec;
    StopWatchViewModel viewModel;
    ActivityStopWatchBinding stopWatchBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        stopWatchBinding = ActivityStopWatchBinding.inflate(getLayoutInflater());
        setContentView(stopWatchBinding.getRoot());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        viewModel = new ViewModelProvider(this).get(StopWatchViewModel.class);

        chronometer = stopWatchBinding.Meter;
        chronometer.setText(viewModel.getTime());
        rotate = AnimationUtils.loadAnimation(this,R.anim.rotation);
        imageView = stopWatchBinding.set;
        handler = new Handler();
        boolean isTimeRunning = false;



        stopWatchBinding.start.setOnClickListener(view -> {
            tBuff=viewModel.tbuff;
            Log.d("TAG", String.valueOf(tBuff));
            tStart = SystemClock.uptimeMillis();
            handler.postDelayed(runnable,0);
            chronometer.start();

            stopWatchBinding.reset.setVisibility(View.INVISIBLE);
            stopWatchBinding.start.setVisibility(View.INVISIBLE);
            stopWatchBinding.pause.setVisibility(View.VISIBLE);
            viewModel.isRunning(true);
            imageView.startAnimation(rotate);
        });


        stopWatchBinding.reset.setOnClickListener(view -> {
            chronometer.setText("00:00:00");
            viewModel.setTime("00:00:00");
            viewModel.tbuff=0L;
            handler.removeCallbacks(runnable);
            Log.d("TAG", String.valueOf(viewModel.tbuff));
            tMilliSec = 0L;
            tStart = 0L;
            tBuff = 0L;
            tUpdate = 0L;
            sec = 0;
            min =0;
            milliSec =0;

            rotate.cancel();
            imageView.setAnimation(rotate);
        });
        stopWatchBinding.pause.setOnClickListener(view -> {
            tBuff += tMilliSec;
            viewModel.setBuff(tUpdate);
            handler.removeCallbacks(runnable);
            chronometer.stop();
            viewModel.isRunning(false);

            stopWatchBinding.reset.setVisibility(View.VISIBLE);
            stopWatchBinding.start.setVisibility(View.VISIBLE);
            stopWatchBinding.pause.setVisibility(View.INVISIBLE);
            rotate.cancel();
            imageView.setAnimation(rotate);
        });
    }
        public Runnable runnable = new Runnable() {
            @Override
            public void run() {
                tMilliSec = SystemClock.uptimeMillis()-tStart;
                tUpdate = tBuff + tMilliSec;
                //viewModel.setBuff(tUpdate);
                sec = (int) (tUpdate/1000);
                min = sec/60;
                sec = sec%60;
                milliSec = (int) (tUpdate%100);
                chronometer.setText(String.format("%02d",min)+":"+String.format("%02d",sec)+":"+String.format("%02d",milliSec));
                viewModel.setTime(String.format("%02d",min)+":"+String.format("%02d",sec)+":"+String.format("%02d",milliSec));
                handler.postDelayed(this, 60);
            }
        };


    @Override
    protected void onStart() {
        super.onStart();
        if (viewModel.isRunning()){
            tBuff = viewModel.tbuff;
            tStart = SystemClock.uptimeMillis();
            handler.postDelayed(runnable,0);
            chronometer.start();

            stopWatchBinding.reset.setVisibility(View.INVISIBLE);
            stopWatchBinding.start.setVisibility(View.INVISIBLE);
            stopWatchBinding.pause.setVisibility(View.VISIBLE);
            viewModel.isRunning(true);
            imageView.startAnimation(rotate);
        }else {
            handler.removeCallbacks(runnable);
            tBuff = viewModel.tbuff;
            chronometer.setText(viewModel.getTime());
            chronometer.stop();
            viewModel.isRunning(false);

            stopWatchBinding.reset.setVisibility(View.VISIBLE);
            stopWatchBinding.start.setVisibility(View.VISIBLE);
            stopWatchBinding.pause.setVisibility(View.INVISIBLE);
            rotate.cancel();
            imageView.setAnimation(rotate);
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }


}