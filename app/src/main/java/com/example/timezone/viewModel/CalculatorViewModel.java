package com.example.timezone.viewModel;

import androidx.lifecycle.ViewModel;

public class CalculatorViewModel extends ViewModel {
    public String value="0", result="";

    public void setValue(String digit){
        value += digit;
    }
    public String getValue(){
        return value;
    }
}
