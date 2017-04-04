package com.example.user.listview;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 2017-03-16.
 */

public class MyAdapter extends BaseAdapter {
    Context mcontext;

    ArrayList<SingerItem> items =  new ArrayList<SingerItem>();

    public void addItem(SingerItem item){
        items.add(item);
    }



    public MyAdapter(Context context){
        mcontext = context;
    }

    @Override
    public int getCount() {
      return items.size();

    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SingerView view = new SingerView(mcontext.getApplicationContext());

       SingerItem item= items.get(position);
        view.setName(item.getName());
        view.setAge(item.getAge());
        view.setimage(item.getResId());



        return view;
    }
}
