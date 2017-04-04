package com.example.gallayview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2017-03-21.
 */

public class GalleryAdapter extends BaseAdapter {
    private Context mcontext;
    LayoutInflater inflater;
   private List<Integer> galleryList = new ArrayList<Integer>();


    public GalleryAdapter(Context mContext){
        this.mcontext = mContext;
        inflater = (LayoutInflater)mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void addItem(Integer integer){
        galleryList.add(integer);
    }

    public Integer getGalleryItem(int position){
       return  galleryList.get(position);
    }

    @Override
    public int getCount() {
        return galleryList.size();
    }

    @Override
    public Object getItem(int position) {
        return galleryList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = inflater.inflate(R.layout.gallery_item,parent,false);
        }
        ImageView imageView = (ImageView)convertView.findViewById(R.id.galleryimage02);

        imageView.setImageResource(galleryList.get(position));

        return convertView;
    }
}
