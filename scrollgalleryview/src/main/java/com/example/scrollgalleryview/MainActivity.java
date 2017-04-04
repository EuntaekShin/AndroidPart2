package com.example.scrollgalleryview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private int[] img_data={R.drawable.face1,R.drawable.face2,
            R.drawable.face3,R.drawable.face4,R.drawable.face5};

    private LinearLayout lv;

    private  CustomAdapter adapter;

    private ImageView[] ivs;
    GridView gv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new CustomAdapter(this,img_data);

        lv = (LinearLayout)findViewById(R.id.lv01);
        gv = (GridView)findViewById(R.id.gv01);
        gv.setAdapter(adapter);

        ivs = new ImageView[5];

        for(int i = 0; i<5;i++){
            ivs[i] = new ImageView(this);
            ivs[i].setImageResource(img_data[i]);
            lv.addView(ivs[i]);
        }

    }
}
