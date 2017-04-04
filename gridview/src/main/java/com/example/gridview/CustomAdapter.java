package com.example.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by user on 2017-03-21.
 */

public class CustomAdapter extends BaseAdapter {
    private Context mcontext;
    private  int data[];

    public CustomAdapter(Context mcontext, int[]data){
        this.mcontext = mcontext;
        this.data =data;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    //인덱스값을 받아서 해당값을 리턴
    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if(convertView == null){
           imageView = new ImageView(mcontext.getApplicationContext());
            imageView.setLayoutParams(new GridView.LayoutParams(200,200));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(5,5,5,5);
        } else {
            imageView = (ImageView)convertView;
        }
        imageView.setImageResource(data[position]);
        return imageView;
    }
}
