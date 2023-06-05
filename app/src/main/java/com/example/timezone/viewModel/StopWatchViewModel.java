package com.example.timezone.viewModel;


import androidx.lifecycle.ViewModel;



public class StopWatchViewModel extends ViewModel {
    private boolean isRunning;
    public long tbuff;
    String time="00:00:00";

    public void isRunning(boolean run){
        isRunning = run;
    }

    public boolean isRunning(){
        return isRunning;
    }

    public void setTime(String t){
        time= t;
    }
    public String getTime(){
        return time;
    }

    public void setBuff(long buff){
        tbuff=buff;
    }

}
