
package com.example.inflatation;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //버튼 눌렀을때 발생하는 이벤트(onClick method)
    public void btn1(View v){
        addLayout();
    }
    //activity_main.xml 에 추가하는 메소드
    private void addLayout(){
        LinearLayout add_layout = (LinearLayout)findViewById(R.id.addLayout);

        //인플레이션
        LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.add,add_layout,true);

        //add.xml에 버튼 객체 참조
        Button btnTest=(Button) findViewById(R.id.btnTest);
        final CheckBox agree =(CheckBox)findViewById(R.id.agree);

        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(agree.isChecked()){
                    agree.setChecked(false);
                }else {
                    agree.setChecked(true);
                }
            }
        });
    }
}
