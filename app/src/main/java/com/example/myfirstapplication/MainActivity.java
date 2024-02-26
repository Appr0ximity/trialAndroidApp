package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String x ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToNextPage(View v){
        Intent i = new Intent(this, afterLoginPage.class);
        x = ((TextView)findViewById(R.id.nameTextView)).getText().toString();
        i.putExtra("key", x);
        startActivity(i);
    }
}