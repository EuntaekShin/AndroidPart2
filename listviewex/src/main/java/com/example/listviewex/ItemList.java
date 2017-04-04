package com.example.listviewex;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by user on 2017-03-20.
 */

public class ItemList extends LinearLayout {

    private ImageView mIcon;
    private TextView mTitle;
    private TextView mComment;


    public ItemList(Context context, GameData gData) {
        super(context);

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.gamelist,this,true);

        mIcon =(ImageView)findViewById(R.id.imageview1);
        mTitle = (TextView) findViewById(R.id.title);
        mComment = (TextView) findViewById(R.id.comment);

    }
    public void setIcon(int icon){
        mIcon.setImageResource(icon);
    }
    public void setTitle(String data){mTitle.setText(data);}
    public void setComment(String data){
        mComment.setText(data);
    }




}
