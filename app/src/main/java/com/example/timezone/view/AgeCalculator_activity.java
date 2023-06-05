package com.example.timezone.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import com.example.timezone.R;
import com.example.timezone.databinding.ActivityAgeCalculatorActivityBinding;
import com.example.timezone.view.MainActivity;
import com.example.timezone.viewModel.AgeViewModel;
import com.example.timezone.viewModel.StopWatchViewModel;

import org.joda.time.PeriodType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AgeCalculator_activity extends AppCompatActivity {
    String mbirthday, mtoday;
    DatePickerDialog.OnDateSetListener dateSetListener;

    AgeViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityAgeCalculatorActivityBinding ageBinding = ActivityAgeCalculatorActivityBinding.inflate(getLayoutInflater());
        setContentView(ageBinding.getRoot());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        viewModel = new ViewModelProvider(this).get(AgeViewModel.class);

        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        mtoday = simpleDateFormat.format(Calendar.getInstance().getTime());
        ageBinding.todayDateText.setText("Today's Date: " + mtoday);
        if (viewModel.date == null) {
            ageBinding.dateOfBirth.setText("Date of birth: ");
        } else {
            ageBinding.dateOfBirth.setText("Date of birth: " + viewModel.date);
        }
        if (viewModel.set == null) {
            ageBinding.ageText.setText("Age");
        } else {
            ageBinding.ageText.setText(viewModel.set);
        }


        ageBinding.selectDateOfBirth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(view.getContext(), dateSetListener, year, month, day);
                datePickerDialog.getDatePicker().setMaxDate(new Date().getTime());
                datePickerDialog.show();
            }
        });
        dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                month += 1;
                mbirthday = dayOfMonth + "/" + month + "/" + year;
                viewModel.SelectDate(mbirthday);
                ageBinding.dateOfBirth.setText("Date of birth: " + viewModel.date);
            }
        };
        ageBinding.calculateAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mbirthday == null) {
                    Toast.makeText(getApplicationContext(), "please enter your date of birth", Toast.LENGTH_SHORT).show();
                } else {
                    String set = viewModel.CalculateAge(mtoday);
                    ageBinding.ageText.setText(set);
                }
            }
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