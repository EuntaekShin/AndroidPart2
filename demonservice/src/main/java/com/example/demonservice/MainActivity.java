package com.example.demonservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.startBtn);
        button.setOnClickListener(this);
        button1 = (Button) findViewById(R.id.finsishBtn);
        button1.setOnClickListener(this);
    }
        //startService() 와 StopService() 를 이용
            public void onClick(View v) {
                Intent intent  = null;
                switch (v.getId()) {
                    case R.id.startBtn:
                        intent = new Intent(getApplicationContext(), DaemonService.class);
                        startService(intent);
                        break;


                    case R.id.finsishBtn:
                        intent = new Intent(getApplicationContext(), DaemonService.class);
                        stopService(intent);
                        break;
                }

                }

            }



