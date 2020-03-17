package com.example.task1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.lang.reflect.Type;

public class MainActivity extends AppCompatActivity {
    @RequiresApi(api = Build.VERSION_CODES.M)
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ConstraintLayout layout = new ConstraintLayout(this);
        TextView textView = new TextView(this);
        textView.setTextColor(Color.RED);
        textView.setTypeface(null, Typeface.BOLD_ITALIC);
        textView.setText("Task 1");
        textView.setGravity(Gravity.CENTER_VERTICAL |Gravity.CENTER_HORIZONTAL);
        //textView.setGravity(Gravity.CENTER_HORIZONTAL);
        textView.setTextSize(40);
        //layout.addView(textView);
        setContentView(textView);


    }
}
