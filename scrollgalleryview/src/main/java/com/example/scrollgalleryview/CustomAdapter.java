package com.example.scrollgalleryview;

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
   Context mContext;
    int[] imgData;

    public CustomAdapter(Context mcontext, int [] imgData){
        this.mContext = mcontext;
        this.imgData = imgData;
    }

    @Override
    public int getCount() {
        return imgData.length;
    }

    @Override
    public Object getItem(int position) {
        return imgData[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView;

        if(convertView == null){
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(300,300));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(10,10,10,10);
        }else{
            imageView =(ImageView)convertView;
        }
        imageView.setImageResource(imgData[position]);

        return imageView;
    }
}
