package com.example.user.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] names = {"아이유","소녀시대","원더걸스","엑시드","티아라"};
    String[] ages ={"22","23","24","25","26"};
    int[] resId ={R.drawable.face01,R.drawable.face02,R.drawable.face03,R.drawable.face04,R.drawable.face05};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listview);

         MyAdapter adapter = new MyAdapter(this);

        for(int i=0; i<names.length; i++ ){
            adapter.addItem(new SingerItem(names[i],ages[i],resId[i]));
        }




        listView.setAdapter(adapter);

    }
}
