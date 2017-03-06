package com.zero.amazinganim;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * @author linzewu
 * @date 2017/3/5
 */

public class DownloadActivity extends AppCompatActivity {

    private ImageView mImageView;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);
        
        mImageView = (ImageView) findViewById(R.id.imageview);
        VectorDrawableCompat vectorDrawableCompat = VectorDrawableCompat.create(
                getResources(), R.drawable.vector_downloading, null);
        mImageView.setImageDrawable(vectorDrawableCompat);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimatedVectorDrawableCompat animatedVectorDrawableCompat = AnimatedVectorDrawableCompat.create(
                        DownloadActivity.this, R.drawable.animated_vector_downloading_begin);
                mImageView.setImageDrawable(animatedVectorDrawableCompat);
                animatedVectorDrawableCompat.start();
                runDownloadTask();
            }
        });
        
    }
    
    
    private void runDownloadTask() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                AnimatedVectorDrawableCompat animatedVectorDrawableCompat = AnimatedVectorDrawableCompat.create(
                        DownloadActivity.this, R.drawable.animated_vector_downloading_finish);
                mImageView.setImageDrawable(animatedVectorDrawableCompat);
                animatedVectorDrawableCompat.start();
            }
        }, 3000);
    }
}
