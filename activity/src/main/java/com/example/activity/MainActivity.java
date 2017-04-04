package com.example.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public  static  final int REQUEST_CODE = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.btn01);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                //Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                //Intent intent = new Intent(getBaseContext(),Main2Activity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }

    //main2에서 응답이 있을때 자동으로 호출 되는 메소드
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if(requestCode == REQUEST_CODE){
            Toast.makeText(getApplicationContext(),"응답 있음 요청코드 :"+REQUEST_CODE
                    +", 결과코드 :"+resultCode,Toast.LENGTH_LONG).show();

            if(resultCode == RESULT_OK){
               String id =  intent.getExtras().getString("id");
                Toast.makeText(getApplicationContext(),"응답 ID : " +id,Toast.LENGTH_LONG).show();

            }
        }
    }
}
