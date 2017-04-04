package com.example.listviewex;

import android.content.Context;
import android.support.v7.view.menu.MenuView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by user on 2017-03-20.
 */

public class GameAdapter extends BaseAdapter {

    private  ArrayList<GameData> gData = new ArrayList<GameData>();
    private Context mcontext;

    public GameAdapter(Context context){
        this.mcontext = context;
    }

    public void addItem(GameData gd){
        gData.add(gd);
    }

    @Override
    public int getCount() {
        return gData.size();
    }

    @Override
    public Object getItem(int position) {
        return gData.get(position).getTitle();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemList itemlist;

        if(convertView == null){
            itemlist = new ItemList(mcontext,gData.get(position));
        }else{
            itemlist = (ItemList)convertView;
        }

        itemlist.setIcon(gData.get(position).getIcon());
        itemlist.setTitle(gData.get(position).getTitle());
        itemlist.setComment(gData.get(position).getComment());

        if((position%2)==1){
            itemlist.setBackgroundColor(0x8ff0000);
        }


        return  itemlist;
    }
}
