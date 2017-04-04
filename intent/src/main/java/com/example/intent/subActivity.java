package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class subActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = getIntent();
        if(intent != null){
            String name = intent.getStringExtra("name");
            int age = intent.getIntExtra("age",0);
            Person person1 = (Person)intent.getSerializableExtra("person");

            Toast.makeText(getApplicationContext(),"name : "+name +" age :"+age,Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(),"person : "+person1.getName() + person1.getAge(),Toast.LENGTH_LONG).show();
        }

    }
}
