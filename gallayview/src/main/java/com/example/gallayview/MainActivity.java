package com.example.gallayview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    GalleryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new GalleryAdapter(this);


        //drawable에 있는 이미지를 galleryList에 추가하는작업

        for(int i =1; i<6;i++){
            adapter.addItem(getResources().getIdentifier
                    ("face"+i, "drawable", this.getPackageName()));
        }
        //xml파일 객체화
       final  ImageView iv = (ImageView)findViewById(R.id.galleryimage);
        Gallery gallery =(Gallery)findViewById(R.id.gallery01);
        gallery.setAdapter(adapter);

        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int galleryItem  = adapter.getGalleryItem(position);
                iv.setImageResource(galleryItem);
            }

        });

    }


}
