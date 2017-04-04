package com.example.intent;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void clickBtn1(View v) {
        Intent intent = new Intent();
        ComponentName name = new ComponentName("com.example.intent",
                "com.example.intent.subActivity");
        intent.setComponent(name);
        intent.putExtra("name","강호동");
        intent.putExtra("age",45);


        Person person12 = new Person("유재석",40);
        intent.putExtra("person", person12);

        startActivity(intent);
    }
}
