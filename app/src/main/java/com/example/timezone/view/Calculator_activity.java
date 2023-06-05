package com.example.timezone.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.HorizontalScrollView;

import com.example.timezone.databinding.ActivityCalculatorActivityBinding;

import com.example.timezone.viewModel.CalculatorViewModel;

import org.mariuszgromada.math.mxparser.*;

public class Calculator_activity extends AppCompatActivity {

    private HorizontalScrollView horizontalScrollView;
    CalculatorViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCalculatorActivityBinding calBinding = ActivityCalculatorActivityBinding.inflate(getLayoutInflater());
        setContentView(calBinding.getRoot());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        viewModel = new ViewModelProvider(this).get(CalculatorViewModel.class);

        horizontalScrollView = calBinding.myScrollView;
        calBinding.valueView.setText(viewModel.getValue());
        calBinding.resultView.setText((viewModel.result == null) ? "0" : viewModel.result);

        calBinding.ac1.setOnClickListener(view -> {

            viewModel.value = "0";
            viewModel.result = "0";
            calBinding.valueView.setText(viewModel.getValue());
            calBinding.resultView.setText(viewModel.result);
        });

        calBinding.plusMinus.setOnClickListener(view -> {

        });

        calBinding.del.setOnClickListener(view -> {

            String fullValue = viewModel.getValue();
            int k = fullValue.length();

            if (k == 1 || (k == 1 && fullValue.charAt(0) == '0')) {
                viewModel.value = "0";
            } else {
                viewModel.value = viewModel.value.substring(0, k - 1);
            }
            calBinding.valueView.setText(viewModel.getValue());
        });

        calBinding.divide.setOnClickListener(view -> {
            String fullValue = viewModel.getValue();

            int k = fullValue.length();
            if ((k == 1 && fullValue.charAt(0) == '0')) {
                viewModel.value = "";
            }
            viewModel.setValue("/");
            calBinding.valueView.setText(viewModel.getValue());

            horizontalScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
        });

        calBinding.seven7.setOnClickListener(view -> {
            String fullValue = viewModel.getValue();

            int k = fullValue.length();
            if ((k == 1 && fullValue.charAt(0) == '0')) {
                viewModel.value = "";
            }
            viewModel.setValue("7");
            calBinding.valueView.setText(viewModel.getValue());

            horizontalScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
        });

        calBinding.eight8.setOnClickListener(view -> {

            String fullValue = viewModel.getValue();
            int k = fullValue.length();
            if ((k == 1 && fullValue.charAt(0) == '0')) {
                viewModel.value = "";
            }
            viewModel.setValue("8");
            calBinding.valueView.setText(viewModel.getValue());

            horizontalScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
        });

        calBinding.nine9.setOnClickListener(view -> {

            String fullValue = viewModel.getValue();
            int k = fullValue.length();
            if ((k == 1 && fullValue.charAt(0) == '0')) {
                viewModel.value = "";
            }
            viewModel.setValue("9");
            calBinding.valueView.setText(viewModel.getValue());

            horizontalScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
        });

        calBinding.into.setOnClickListener(view -> {

            String fullValue = viewModel.getValue();
            int k = fullValue.length();
            if ((k == 1 && fullValue.charAt(0) == '0')) {
                viewModel.value = "";
            }
            viewModel.setValue("×");
            calBinding.valueView.setText(viewModel.getValue());
            horizontalScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
        });

        calBinding.four4.setOnClickListener(view -> {

            String fullValue = viewModel.getValue();
            int k = fullValue.length();
            if ((k == 1 && fullValue.charAt(0) == '0')) {
                viewModel.value = "";
            }
            viewModel.setValue("4");
            calBinding.valueView.setText(viewModel.getValue());

            horizontalScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
        });

        calBinding.five5.setOnClickListener(view -> {

            String fullValue = viewModel.getValue();
            int k = fullValue.length();
            if ((k == 1 && fullValue.charAt(0) == '0')) {
                viewModel.value = "";
            }
            viewModel.setValue("5");
            calBinding.valueView.setText(viewModel.getValue());


            horizontalScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
        });

        calBinding.six6.setOnClickListener(view -> {

            String fullValue = viewModel.getValue();
            int k = fullValue.length();
            if ((k == 1 && fullValue.charAt(0) == '0')) {
                viewModel.value = "";
            }
            viewModel.setValue("6");
            calBinding.valueView.setText(viewModel.getValue());

            horizontalScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
        });

        calBinding.plus.setOnClickListener(view -> {

            String fullValue = viewModel.getValue();
            int k = fullValue.length();
            if ((k == 1 && fullValue.charAt(0) == '0')) {
                viewModel.value = "";
            }
            viewModel.setValue("+");
            calBinding.valueView.setText(viewModel.getValue());

            horizontalScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
        });

        calBinding.one1.setOnClickListener(view -> {

            String fullValue = viewModel.getValue();
            int k = fullValue.length();
            if ((k == 1 && fullValue.charAt(0) == '0')) {
                viewModel.value = "";
            }
            viewModel.setValue("1");
            calBinding.valueView.setText(viewModel.getValue());

            horizontalScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
        });

        calBinding.two2.setOnClickListener(view -> {

            String fullValue = viewModel.getValue();
            int k = fullValue.length();
            if ((k == 1 && fullValue.charAt(0) == '0')) {
                viewModel.value = "";
            }
            viewModel.setValue("2");
            calBinding.valueView.setText(viewModel.getValue());

            horizontalScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
        });

        calBinding.three3.setOnClickListener(view -> {

            String fullValue = viewModel.getValue();
            int k = fullValue.length();
            if ((k == 1 && fullValue.charAt(0) == '0')) {
                viewModel.value = "";
            }
            viewModel.setValue("3");
            calBinding.valueView.setText(viewModel.getValue());

            horizontalScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
        });

        calBinding.minus.setOnClickListener(view -> {

            String fullValue = viewModel.getValue();
            int k = fullValue.length();
            if ((k == 1 && fullValue.charAt(0) == '0')) {
                viewModel.value = "";
            }
            viewModel.setValue("-");
            calBinding.valueView.setText(viewModel.getValue());

            horizontalScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
        });

        calBinding.percentage.setOnClickListener(view -> {

            String fullValue = viewModel.getValue();
            int k = fullValue.length();
            if ((k == 1 && fullValue.charAt(0) == '0')) {
                viewModel.value = "";
            }
            viewModel.setValue("%");
            calBinding.valueView.setText(viewModel.getValue());

            horizontalScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
        });

        calBinding.zero0.setOnClickListener(view -> {

            String fullValue = viewModel.getValue();
            int k = fullValue.length();
            if ((k == 1 && fullValue.charAt(0) == '0')) {
                viewModel.value = "0";
            } else {
                viewModel.setValue("0");
            }
            calBinding.valueView.setText(viewModel.getValue());

            horizontalScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
        });

        calBinding.dot.setOnClickListener(view -> {

            String fullValue = viewModel.getValue();
            int k = fullValue.length();
            if ((k == 1 && fullValue.charAt(0) == '0')) {
                viewModel.setValue(".");
            } else {
                viewModel.setValue(".");

            }
            calBinding.valueView.setText(viewModel.getValue());

            horizontalScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
        });

        calBinding.equal.setOnClickListener(view -> {

            String fullValue = viewModel.getValue();
            fullValue = fullValue.replaceAll("×", "*");
            fullValue = fullValue.replaceAll("%", "/100");

            Expression expression = new Expression(fullValue);
            double format = expression.calculate();

            viewModel.result = String.valueOf(format);
            calBinding.resultView.setText(viewModel.result);

        });

    }

    public void backHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}