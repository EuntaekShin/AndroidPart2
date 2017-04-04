package com.example.user.listview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by user on 2017-03-16.
 */

public class SingerView extends LinearLayout {
    TextView textview;
    TextView textview2;
    ImageView imageView;

    public SingerView(Context context) {

        super(context);
        init(context);
    }

    public SingerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.singer_item,this,true);


        textview = (TextView) findViewById(R.id.txt01);
        textview2 = (TextView) findViewById(R.id.txt02);
        imageView =(ImageView)findViewById(R.id.image);
    }
    public void setName(String name){textview.setText(name);}
    public void setAge(String age){
        textview2.setText(age);
    }
    public void setimage(int resId){
        imageView.setImageResource(resId);
    }


}
