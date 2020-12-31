package com.example.myzoomcontroldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ZoomControls;

import java.util.zip.ZipEntry;

public class MainActivity extends AppCompatActivity {

        private ImageView imageView;
        private ZoomControls zoomControls;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.imageViewId);
        zoomControls = (ZoomControls)findViewById(R.id.zoomControlId);

        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x = imageView.getScaleX();
                float y = imageView.getScaleY();


                    imageView.setScaleX(x + 1);
                    imageView.setScaleY(y + 1);


            }



        });

        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x = imageView.getScaleX();
                float y = imageView.getScaleY();


                if(x>1 && y>1){
                    imageView.setScaleX(x - 1);
                    imageView.setScaleY(y - 1);
                }


            }
        });


    }
}