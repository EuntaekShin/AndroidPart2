package com.example.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    private int[] data ={R.drawable.face01,R.drawable.face02,R.drawable.face03,R.drawable.face04,R.drawable.face05};
    private CustomAdapter adapter;
    private GridView gridview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new CustomAdapter(this,data);

        gridview =(GridView)findViewById(R.id.gv01);
        gridview.setAdapter(adapter);
    }
}
