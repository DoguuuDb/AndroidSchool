package com.dogu.beforaafternew;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.media.Image;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
ImageView iv;
int imagestatus=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void ImageChanger(View view){
        iv=findViewById(R.id.imageView);
        if(imagestatus==1)
        {
            iv.setImageResource(R.drawable.gorsel2);
            imagestatus=0;
        }
        else
        {
            iv.setImageResource(R.drawable.gorsel1);
            imagestatus=1;
        }
    }

}