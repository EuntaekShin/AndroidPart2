package com.example.listviewex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<GameData> data;
    GameAdapter gAdapter;
    ListView listView;

    String[] names = {"아이유","소녀시대","원더걸스","엑시드","티아라"};
    String[] ages ={"22","23","24","25","26"};
    int[] resId ={R.drawable.face01,R.drawable.face02,R.drawable.face03,R.drawable.face04,R.drawable.face05};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView =(ListView)findViewById(R.id.listview1);

        gAdapter = new GameAdapter(this);

        data = new ArrayList<GameData>();

        for(int i = 0 ; i<resId.length;i++){
            gAdapter.addItem(new GameData(resId[i],names[i],ages[i]));
        }

        listView.setAdapter(gAdapter);
    }
}
