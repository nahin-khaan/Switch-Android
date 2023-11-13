package com.example.aswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Switch switchd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchd = findViewById(R.id.switchId);
        switchd.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Wifi is On", Toast.LENGTH_SHORT).show();


                } else {
                    Toast.makeText(MainActivity.this, "Wifi is Off", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}