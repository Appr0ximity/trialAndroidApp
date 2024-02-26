package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Objects;

public class afterLoginPage extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login_page);
        TextView mSystemView = (TextView) this.findViewById(R.id.welcomeText);
        String name = this.getIntent().getStringExtra("key");
        if ( name != null) {
            mSystemView.setText("Hello " + name);
        } else {
            mSystemView.setText("No value");
        }    }
}