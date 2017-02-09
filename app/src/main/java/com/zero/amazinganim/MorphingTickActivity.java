package com.zero.amazinganim;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * 简单的一个打钩动画
 * Created by linzewu on 2017/2/6.
 */

public class MorphingTickActivity extends AppCompatActivity {

    private ImageView mImageView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morphing_tick);
        mImageView = (ImageView) findViewById(R.id.imageview);
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = AnimatedVectorDrawableCompat.create(
                this, R.drawable.animated_vector_tick);
        mImageView.setImageDrawable(animatedVectorDrawableCompat);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Animatable)mImageView.getDrawable()).start();
            }
        });
        
    }
}
