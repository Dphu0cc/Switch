package com.example.aswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Switch stwWifi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stwWifi = (Switch) findViewById(R.id.switchWifi);

        stwWifi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Toast.makeText(MainActivity.this, "Bat mo wf", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Tat wf", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}