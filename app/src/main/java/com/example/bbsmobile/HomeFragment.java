package com.example.bbsmobile;

import static java.nio.file.Files.find;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


public class HomeFragment extends Fragment {

    private TextView txtDate;
    private TextView txtGreet;
    private TextView txtClick;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        txtDate = view.findViewById(R.id.txtDate);
        txtGreet = view.findViewById(R.id.txtGreet);
        txtClick = view.findViewById(R.id.txtclick);

        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        String greeting;
        if (hour >0  && hour < 12) {
            greeting = "Good Morning!";
        } else if ( hour >=12 && hour < 17) {
            greeting = "Good Afternoon!";
        } else {
            greeting = "Good Evening!";
        }

        txtGreet.setText(greeting);
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd MMMM", Locale.ENGLISH);
        String currentDate = dateFormat.format(calendar.getTime());

        txtDate.setText(currentDate);

        txtClick.setText("Breakfast Lunch Dinner Snacks Desserts");

        return view;
    }
}