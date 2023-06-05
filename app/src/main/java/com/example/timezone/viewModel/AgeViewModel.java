package com.example.timezone.viewModel;

import androidx.lifecycle.ViewModel;

import org.joda.time.PeriodType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AgeViewModel extends ViewModel {
    public String date;
    public String set;

    public String SelectDate(String birthday) {
        date = birthday;
        return date;
    }

    public String CalculateAge(String todayDate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date1 = simpleDateFormat.parse(date);
            Date date2 = simpleDateFormat.parse(todayDate);

            long startDate = date1.getTime();
            long endDate = date2.getTime();

            org.joda.time.Period period = new org.joda.time.Period(startDate, endDate, PeriodType.yearMonthDay());
            int years = period.getYears();
            int months = period.getMonths();
            int days = period.getDays();

            Calendar calendar1 = Calendar.getInstance();
            SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
            String time = s.format(calendar1.getTime());

            String h = time.substring(0, 2);
            String m = time.substring(3, 5);
            String s1 = time.substring(6, 8);

            int ho = Integer.parseInt(h);
            int min = Integer.parseInt(m);
            int sec = Integer.parseInt(s1);

            org.joda.time.Period period1 = new org.joda.time.Period(startDate, endDate, PeriodType.hours());
            int hours = period1.getHours() + ho;

            org.joda.time.Period period2 = new org.joda.time.Period(startDate, endDate, PeriodType.minutes());
            long minutes = period2.getMinutes() + (ho * 60) + min;
            org.joda.time.Period period3 = new org.joda.time.Period(startDate, endDate, PeriodType.seconds());
            long seconds = period3.getSeconds() + ((ho * 60) + min) + sec;

            String line = "______________________";
            set = "Age:" + "\n" + "Years: " + years + "\n" + "Months: " + months + "\n" + "Days: " + days + "\n" + line + "\n" + "Total survive:" + "\n" + "Hours: " + hours + "\n" + "Minutes: " + minutes + "\n" + "Seconds: " + seconds;

            return set;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
