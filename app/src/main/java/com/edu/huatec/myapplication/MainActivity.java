package com.edu.huatec.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ImageView imageView= findViewById(R.id.xianshi);
        Glide
                .with(this)
                .load("http://pic150.nipic.com/file/20171224/21532952_230030263000_2.jpg")
                .placeholder(R.drawable.zhanwei)
                .error(R.drawable.error)
                .into(imageView);




    }
}
